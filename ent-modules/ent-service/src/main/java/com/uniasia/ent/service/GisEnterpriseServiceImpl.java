package com.uniasia.ent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.api.GisEnterpriseService;
import com.uniasia.ent.api.SOEnterpriseService;
import com.uniasia.ent.mapper.GisEnterpriseMapper;
import com.uniasia.ent.pojo.GisEnterprise;
import com.uniasia.ent.pojo.SOEnterprise;

@Service("gisEnterpriseService")
@Transactional
public class GisEnterpriseServiceImpl implements GisEnterpriseService{
	
	@Autowired
	private GisEnterpriseMapper gisEnterpriseMapper;
	@Autowired
	private SOEnterpriseService sOEnterpriseService;
	
	@Override
	public Page<GisEnterprise> queryForPage(Page<GisEnterprise> page) {
		 List<GisEnterprise> list = gisEnterpriseMapper.queryForPage(page);
		 page.setResult(list);
		 return page;
	}

	@Override
	public Page<SOEnterprise> queryForPageToSolr(Page<SOEnterprise> page) {
		return sOEnterpriseService.queryPage("archived:0", new String[0], page);
	}

	@Override
	public GisEnterprise getById(Integer id) {
		GisEnterprise gisEnterprise = new GisEnterprise();
		gisEnterprise.setId(id);
		return gisEnterpriseMapper.selectOne(gisEnterprise);
	}
	
}
