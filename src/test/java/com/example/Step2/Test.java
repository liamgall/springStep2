//package com.example.Step2;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import javax.inject.Inject;
//
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//@RunWith(MockitoJUnitRunner.class)
//@WebAppConfiguration
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
//public class Test {
//	
//	private static final Logger logger = LoggerFactory.getLogger(Test.class);
//	
//	@Inject
//	private WebApplicationContext wac;
//	@InjectMocks
//	private HomeController home;
//	
//	private MockMvc mockMvc;
//	
//	@Before
//	public void setUp(){
////		this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
//		this.mockMvc = MockMvcBuilders.standaloneSetup(home).build();
////		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//		logger.info("setup start..");
//	}
//	
//	@org.junit.Test
//	public void test() throws Exception{
//		this.mockMvc.perform(get("/"));
////		mockMvc.perform(MockMvcRequestBuilders.get("/"));
//		
//		
//	}
//}
