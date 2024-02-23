package com.application.mvc.chapter06_RESTAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class BrandTestController02{
	@GetMapping("/RESTAPI/view")
	public String view() {
		return "chapter06_RESTAPI/brand2";
	}
}

@RestController
@RequestMapping("/brand2")
public class BrandController2 {
	
	@Autowired
	private BrandDAO brandDAO;
	
	
	// Brand 데이터 전체 요청
	@GetMapping
	public void getBrandList() {
		
	}
		

}
