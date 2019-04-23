package com.uniasia.ent.service;

import java.util.Collections;
import java.util.List;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.api.SOEnterpriseService;
import com.uniasia.ent.common.solr.SOEnterpriseRepository;
import com.uniasia.ent.common.solr.SolrQueryBuilder;
import com.uniasia.ent.pojo.SOEnterprise;
import com.uniasia.util.AssertUtils;
import com.uniasia.util.ExceptionUtils;

@Service("sOEnterpriseService")
@Transactional
public class SOEnterpriseServiceImpl implements SOEnterpriseService{
	
	@Autowired SOEnterpriseRepository soEnterpriseRepository;
	
	@Override
	public SOEnterprise get(String id) {
		assertIdFriendly(id);
		try {
			return soEnterpriseRepository.findOne(id);
		} catch (Exception e) {
			throw ExceptionUtils.toUnchecked(e);
		}
	}

	@Override
	public Page<SOEnterprise> queryPage(String queryString, String[] filterString, Page<SOEnterprise> page) {
		try {

			SolrQueryBuilder builder = new SolrQueryBuilder()
					.withQueryString(queryString)
					.withFilterQuery(filterString)
					.withOffset(page.getFirst() - 1)
					.withSize(page.getPageSize())
					.withSort(page.getOrder(), page.getOrderBy());

			//QueryResponse response = solrServer.query(builder.build());
			QueryResponse response=soEnterpriseRepository.query(builder.build());
			if (isEmptyResult(response)) {
				return page.setResult(Collections.<SOEnterprise> emptyList());
			}

			page.setResult(getBeans(response)).setTotalCount(getTotalCount(response));

		} catch (Exception e) {
			e.printStackTrace();
			page.setResult(Collections.<SOEnterprise> emptyList());
		}

		return page;
	}
	
	@Override
	public List<SOEnterprise> query(String queryString) {
		try {

			SolrQueryBuilder builder = new SolrQueryBuilder()
					.withQueryString(queryString);

			//QueryResponse response = solrServer.query(builder.build());
			QueryResponse response=soEnterpriseRepository.query(builder.build());
			if (isEmptyResult(response)) {
				return Collections.<SOEnterprise> emptyList();
			}

			return getBeans(response);

		} catch (Exception e) {
			e.printStackTrace();
			Collections.<SOEnterprise> emptyList();
		}
		return Collections.<SOEnterprise> emptyList();
	}
		

	@Override
	public void save(SOEnterprise entity) {
		try {
			AssertUtils.notNull(entity);
			soEnterpriseRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw ExceptionUtils.toUnchecked(e);
		}
	}
	
	@Override
	public void delete(String id) {
		try {
			SOEnterprise entity=this.get(id);
			if(entity!=null){
				soEnterpriseRepository.delete(entity);
			}			
		} catch (Exception e) {
			e.printStackTrace();
			throw ExceptionUtils.toUnchecked(e);
		}
	}
	
	@Override
	public void deleteAll() {
		try {
			soEnterpriseRepository.deleteAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw ExceptionUtils.toUnchecked(e);
		}
	}
	
	private List<SOEnterprise> getBeans(QueryResponse response) {
		return response.getBeans(SOEnterprise.class);
	}

	private long getTotalCount(QueryResponse response) {
		return response.getResults().getNumFound();
	}
	
	@SuppressWarnings("unused")
	private SOEnterprise getBeansAsSingle(QueryResponse response) {
		return response.getBeans(SOEnterprise.class).get(0);
	}

	private boolean isEmptyResult(QueryResponse response) {
		if (null == response.getResults()) {
			return true;
		}

		return response.getResults().getNumFound() <= 0;
	}
	
	private void assertIdFriendly(String id) {
		// to prevent malicious request,we must check the id
		AssertUtils.isTrue(id.matches("[0-9a-zA-Z]+"),"Make sure the id is friendly!");
	}

}
