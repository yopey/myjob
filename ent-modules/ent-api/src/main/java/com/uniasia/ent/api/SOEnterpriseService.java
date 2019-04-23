package com.uniasia.ent.api;

import java.util.List;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.pojo.SOEnterprise;

public interface SOEnterpriseService {
	
	SOEnterprise get(String id);
	void save(SOEnterprise entity);
	void delete(String id);
	void deleteAll();
	Page<SOEnterprise> queryPage(String queryString, String[] filterString, Page<SOEnterprise> page);	
	List<SOEnterprise> query(String queryString);
	

}
