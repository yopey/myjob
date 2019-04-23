package com.uniasia.ent.common.solr;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.solr.core.SolrCallback;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.repository.support.SimpleSolrRepository;
import org.springframework.stereotype.Repository;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.pojo.SOEnterprise;

@Repository
public class SolrSOEnterpriseRepository extends SimpleSolrRepository<SOEnterprise, String> implements SOEnterpriseRepository{
	
    @Autowired
    public SolrSOEnterpriseRepository(@Qualifier("enterpriseSolrTemplate") SolrOperations solrOperations) {
        super(solrOperations);
    }

	@Override
	public Page<SOEnterprise> queryPage(String queryString,Page<SOEnterprise> page) {
		final SolrQuery solrQuery = new SolrQuery(queryString);
        solrQuery.setStart(page.getFirst() - 1).setRows(page.getPageSize());

        List<SOEnterprise> results= getSolrOperations().execute(new SolrCallback<List<SOEnterprise>>() {
		        	@Override
		            public List<SOEnterprise> doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
		                QueryResponse resp = solrClient.query(solrQuery);
		                if (resp.getResults().getNumFound() < 1) {
		                    return Collections.<SOEnterprise>emptyList();
		                }
		                return getSolrOperations().getConverter().read(resp.getResults(), SOEnterprise.class);
		            }

		        });
       
        return page.setResult(results);
	}

	@Override
	public QueryResponse query(final SolrQuery build) {
        QueryResponse response= getSolrOperations().execute(new SolrCallback<QueryResponse>() {
		        	@Override
		            public QueryResponse doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
		                QueryResponse resp = solrClient.query(build);
		                return resp;
		            }

		        });
       
        return response;
	}

}
