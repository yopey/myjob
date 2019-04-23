package com.uniasia.ent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

	private static final String ERRORSERVER = "/error/500";
	private static final String ERRORNULL = "/error/404";

	@RequestMapping(value = "/errorServer",method={RequestMethod.POST, RequestMethod.GET})
	public String errorServer(Model model, HttpServletRequest request) {
		return ERRORSERVER;
	}

	@RequestMapping(value = {"/errorNull","/404.html"},method={RequestMethod.POST, RequestMethod.GET})
	public String errorNull404(Model model, HttpServletRequest request) {
		return ERRORNULL;
	}
}