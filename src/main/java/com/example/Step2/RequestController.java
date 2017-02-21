package com.example.Step2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RequestController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "postRequest", method = RequestMethod.POST)
	public String postRequest(HttpServletRequest request, Model model){
		model.addAttribute("userName", request.getParameter("userName"));
		model.addAttribute("address", request.getParameter("address"));
		model.addAttribute("phoneNumber", request.getParameter("phoneNumber"));
		model.addAttribute("eMail", request.getParameter("eMail"));
		model.addAttribute("registerPath", request.getParameter("registerPath"));
		model.addAttribute("checkList", request.getParameter("checkList"));
		System.out.println(request.getParameter("registerPath"));
		return "showInfo";
	}
	@RequestMapping(value = "getRequest", method = RequestMethod.GET)
	public String getRequest(HttpServletRequest request, Model model){
		model.addAttribute("userName", request.getParameter("userName"));
		model.addAttribute("address", request.getParameter("address"));
		model.addAttribute("phoneNumber", request.getParameter("phoneNumber"));
		model.addAttribute("eMail", request.getParameter("eMail"));
		model.addAttribute("registerPath", request.getParameter("registerPath"));
		model.addAttribute("checkList", request.getParameter("checkList"));
		System.out.println(request.getParameter("registerPath"));
		return "showInfo";
	}
	
	
}
