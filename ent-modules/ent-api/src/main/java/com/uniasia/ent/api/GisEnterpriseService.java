package com.uniasia.ent.api;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.pojo.GisEnterprise;
import com.uniasia.ent.pojo.SOEnterprise;

public interface GisEnterpriseService {
	public Page<GisEnterprise> queryForPage(Page<GisEnterprise> page);

	public Page<SOEnterprise> queryForPageToSolr(Page<SOEnterprise> page);
	
	public GisEnterprise getById(Integer id);
	
}
