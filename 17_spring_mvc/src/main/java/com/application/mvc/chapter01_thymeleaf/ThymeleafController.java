package com.application.mvc.chapter01_thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.application.mvc.data.SupposeDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {
	
	@Autowired// DTO자동 연결
	private SupposeDAO supposeDAO;
	
	@GetMapping("/link")
	public String link( ) {
		
		return "chapter01_thymeleaf/link";
	}
	
	@GetMapping("/varExpression")
	public String varExpression(HttpServletRequest request) {
		
		request.setAttribute("string"  , supposeDAO.getString());
		request.setAttribute("int"     , supposeDAO.getInt());
		request.setAttribute("double"  , supposeDAO.getDouble());
		request.setAttribute("boolean" , supposeDAO.getBoolean());
		request.setAttribute("date"    , supposeDAO.getDate());
		request.setAttribute("dto"     , supposeDAO.getDTO());
		request.setAttribute("dtoList" , supposeDAO.getDTOList());
		request.setAttribute("map"     , supposeDAO.getMap());
		request.setAttribute("mapList" , supposeDAO.getMapList()); 
		
		return "chapter01_thymeleaf/varExpression";
	}

}
