package com.example.Step2;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
@Validated
public class RequestController {
	/* Post */
	@RequestMapping(value = "/postRequest", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> postRequest(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.putAll(param);
		return hashmap;
	}
	

	/* Get */
	@RequestMapping(value = "/getRequest", method = RequestMethod.GET)
	public String getRequest(HttpServletRequest request, Model model){
		
		model.addAttribute("userName", request.getParameter("userName"));
		model.addAttribute("address", request.getParameter("address"));
		model.addAttribute("phoneNumber", request.getParameter("phoneNumber"));
		model.addAttribute("eMail", request.getParameter("eMail"));
		model.addAttribute("registerPath", request.getParameter("registerPath"));
		model.addAttribute("checkList", request.getParameter("checkList"));
		
		return "showInfo";
	}
	
	
}
