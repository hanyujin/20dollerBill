package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String greeting(@RequestParam(required=false,defaultValue="") String name) {
		return name.equals("")?"Hey!":"Hey,"+name+"!";
	}
}

/*
@RestController 
어노테이션 뷰를 렌더링하지 않고, 결과를 직접 응답 본문에 쓰는 것을 나타냄.
*/