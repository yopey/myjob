package com.uniasia.ent.common.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.pojo.SOEnterprise;

public interface SOEnterpriseRepository extends SolrCrudRepository<SOEnterprise, String>{
	
	Page<SOEnterprise> queryPage(String queryString, Page<SOEnterprise> page);

	QueryResponse query(SolrQuery build);
	
	//MoreLikeThis queryMoreLikeThis(String id);
}
