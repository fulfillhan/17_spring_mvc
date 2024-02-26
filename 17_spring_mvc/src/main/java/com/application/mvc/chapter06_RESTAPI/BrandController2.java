package com.application.mvc.chapter06_RESTAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.mvc.data.BrandDTO;
import com.mysql.cj.log.Log;

@Controller
class BrandTestController02{
	@GetMapping("/RESTAPI/view02")
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
	public List<BrandDTO> getBrandList() {
		return brandDAO.getBrandList();
		
	}
	
	@GetMapping("#{brandId}")
	public BrandDTO getBrandDetail(@PathVariable("brandId") long brandId) {
		return brandDAO.getBrandDetail(brandId);
	}
	
	@PostMapping
	public void  createBrand(@RequestBody BrandDTO brandDTO) {
		brandDAO.createBrand(brandDTO);
	}
	
	@PutMapping
	public void updateBrand(@RequestBody BrandDTO brandDTO) {
		 brandDAO.updateBrand(brandDTO);
	}
	
	

}
