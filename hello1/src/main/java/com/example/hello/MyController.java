package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String MyTest()
	{
		return ("<h1>   Welcome Admin  </h1>");
	}

}
