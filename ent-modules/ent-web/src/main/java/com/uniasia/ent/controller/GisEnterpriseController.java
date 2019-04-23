package com.uniasia.ent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uniasia.core.orm.Page;
import com.uniasia.ent.api.GisEnterpriseService;
import com.uniasia.ent.pojo.GisEnterprise;
import com.uniasia.ent.pojo.SOEnterprise;

@Controller
@RequestMapping("/enterprise/")
public class GisEnterpriseController {
	@Autowired
	private GisEnterpriseService gisEnterpriseService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model, Page<GisEnterprise> page,
									@RequestParam(name = "pageNo", required = false, defaultValue = "1") int pageNo,
									HttpServletRequest request) {
		page.setPageNo(pageNo);
		page = gisEnterpriseService.queryForPage(page);
		model.addAttribute("page", page);
		return "/enterprise/list";
	}
	
	@RequestMapping(value = "solrList", method = RequestMethod.GET)
	public String solrList(Model model, Page<SOEnterprise> page,
			@RequestParam(name = "pageNo", required = false, defaultValue = "1") int pageNo,
			HttpServletRequest request) {
		page.setPageNo(pageNo);
		page = gisEnterpriseService.queryForPageToSolr(page);
		model.addAttribute("page", page);
		return "/enterprise/list";
	}
	
	@RequestMapping(value="show",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public GisEnterprise show(Integer id){
		GisEnterprise info = gisEnterpriseService.getById(id);
		return info;
	}
}
