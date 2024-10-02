package com.learn.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	

	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello world!";
	}

	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first html web page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html web page body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	// /src/main/resourcs/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	
}
