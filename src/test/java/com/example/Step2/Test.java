package com.example.Step2;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class Test {
	
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	@InjectMocks
	private HomeController home;
	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.standaloneSetup(new RequestController()).build();
		logger.info("setup start..");
	}
	
	/* GET 요청이 View로 잘 전달되나 테스트 */
	@org.junit.Test
	public void testGet() throws Exception{
		this.mockMvc.perform(get("/getRequest?userName=김기환&address=서울시강남구&phoneNumber=01023789295&eMail=liamgall@naver.com&registerPath=기타&checkList=인터넷"))
		.andDo(print())
		.andExpect(status().isOk());
	}
	/* POST 요청 테스트 */
	@org.junit.Test
	public void testPost() throws Exception{
		MockHttpServletRequestBuilder createMessage = post("/postRequest")
//				.param("reqBody", "{userName:김기환}");
				
//				.contentType(MediaType.APPLICATION_JSON)
//				.content("{\"userName\":\"김기환\",\"address\":\"서울시\",\"phoneNumber\":\"01023789295\",\"eMail\":\"liamgall@naver.com\"}")
//				.accept(MediaType.APPLICATION_JSON);

				.param("userName", "김기환")
				.param("phoneNumber", "01023789295")
				.param("address", "서울시 강남구")
				.param("eMail", "liamgall@naver.com");
		
		
		this.mockMvc.perform(createMessage)
		.andDo(print())
		.andExpect(status().isOk());
		logger.info("test done..");
	}
}
