	package com.application.mvc.chapter01_thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.mvc.data.SupposeDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/thymeleaf")
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
	
	
	@GetMapping("/controlStatement")
	public String controlStatement(HttpServletRequest request) {
		
		request.setAttribute("string"  , supposeDAO.getString());
		request.setAttribute("int"     , supposeDAO.getInt());
		request.setAttribute("double"  , supposeDAO.getDouble());
		request.setAttribute("boolean" , supposeDAO.getBoolean());
		request.setAttribute("date"    , supposeDAO.getDate());
		request.setAttribute("dto"     , supposeDAO.getDTO());
		request.setAttribute("dtoList" , supposeDAO.getDTOList());
		request.setAttribute("map"     , supposeDAO.getMap());
		request.setAttribute("mapList" , supposeDAO.getMapList()); 
		
		return "chapter01_thymeleaf/controlStatement";
	}
	
	@GetMapping("/format")
	public String format(HttpServletRequest request) {
		
		request.setAttribute("string"  , supposeDAO.getString());
		request.setAttribute("int"     , supposeDAO.getInt());
		request.setAttribute("double"  , supposeDAO.getDouble());
		request.setAttribute("boolean" , supposeDAO.getBoolean());
		request.setAttribute("date"    , supposeDAO.getDate());
		request.setAttribute("dto"     , supposeDAO.getDTO());
		request.setAttribute("dtoList" , supposeDAO.getDTOList());
		request.setAttribute("map"     , supposeDAO.getMap());
		request.setAttribute("mapList" , supposeDAO.getMapList()); 
		
		return "chapter01_thymeleaf/format";
	}
	
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("dto"     , supposeDAO.getDTO());// model로 바꾸서 진행
		return "chapter01_thymeleaf/form";
	}

}
