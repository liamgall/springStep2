package com.example.Step2;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RequestController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/postRequest", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> postRequest(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.putAll(param);
		return hashmap;
	}
	@RequestMapping(value = "/getRequest", method = RequestMethod.GET)
	public String getRequest(HttpServletRequest request, Model model){
		model.addAttribute("userName", request.getParameter("userName"));
		model.addAttribute("address", request.getParameter("address"));
		model.addAttribute("phoneNumber", request.getParameter("phoneNumber"));
		model.addAttribute("eMail", request.getParameter("eMail"));
		model.addAttribute("registerPath", request.getParameter("registerPath"));
		model.addAttribute("checkList", request.getParameter("checkList"));
		System.out.println("get : "+ request.getParameter("registerPath"));
		return "showInfo";
	}
	
	
}
