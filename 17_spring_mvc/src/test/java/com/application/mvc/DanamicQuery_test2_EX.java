package com.application.mvc;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.application.mvc.chapter04_dynamicQuery.DynamicQueryDAO2_EX;
import com.application.mvc.data.BrandDTO;
import com.application.mvc.data.ProductDTO;

@SpringBootTest 
public class DanamicQuery_test2_EX {
	
	@Autowired
	private DynamicQueryDAO2_EX dao2_EX;
		
	
	// [ if ] 사용예시
		@Test
		public void ifEx() {
			
			System.out.println("\n --- ifEx --- \n");
			
			Map<String,Object> searchMap = new HashMap<String, Object>();
//			searchMap.put("searchKeyword", "enrollDt");
//			searchMap.put("searchWord" , "2022");
				searchMap.put("searchKeyword", "productNm");
				searchMap.put("searchWord" , "삼성전자");
				
				for (ProductDTO productDTO : dao2_EX.ifEx(searchMap)) {
					System.out.println(productDTO);
				}
			
		}

		
		
		// [ when ] 사용예시
		@Test
		public void whenEx() {
			
			System.out.println("\n --- whenEx --- \n");
			
			Map<String,Object> searchMap = new HashMap<String, Object>();
			searchMap.put("searchKeyword", "enrollDt");
			searchMap.put("searchWord" , "2022");
//				searchMap.put("searchKeyword", "productNm");
//				searchMap.put("searchWord" , "삼성전자");
			
		}

		
		
		// [ otherwise ] 사용예시
		@Test
		public void otherwiseEx() {
			
			System.out.println("\n --- otherwiseEx --- \n");
			
			//int deliveryPrice = 0;
			int deliveryPrice = 3000;
			
		}

		
		
		// [ foreach ] insert 사용예시
		@Test
		public void foreachEx01() {
			
			System.out.println("\n --- foreachEx01 --- \n");
			
			List<BrandDTO> brandList = new ArrayList<BrandDTO>();
			
			for (int i = 100; i <= 110; i++) { // 111 ~ 120 , 121 ~ 130으로 변경하며 테스트 
				
				BrandDTO brandDTO = new BrandDTO();
				brandDTO.setBrandId(i);
				brandDTO.setBrandNm("추가된브랜드" + i);
				brandDTO.setEnteredDt(new Date());
				brandDTO.setActiveYn("Y");
				
				brandList.add(brandDTO);
				
			}
			dao2_EX.foreachEx01(brandList);
			
		}

		
		
		// [ foreach ] select 사용예시
		@Test
		public void foreachEx02() {
			
			System.out.println("\n --- foreachEx02 --- \n");
			
			long[] brandIdList = {1 , 2 , 3};
			
			dao2_EX.foreachEx02(brandIdList);
		}

		
		
		// [ foreach ] delete 사용예시
		@Test
		public void foreachEx03() {
			
			System.out.println("\n --- foreachEx03 --- \n");
			long[] brandIdList = {100 , 101 , 102 , 103 , 104 };
			
			dao2_EX.foreachEx03(brandIdList);
		}

		
		
		// [ foreach ] update 사용예시1
		@Test
		public void foreachEx04() {
			
			System.out.println("\n --- foreachEx04 --- \n");
			
			int[] productIdList = {1,2,3,4,5,6};
			
		}
		
		
		
		// [ foreach ] update 사용예시2
		@Test
		public void foreachEx05() {
			
			System.out.println("\n --- foreachEx05 --- \n");
			
			List<Map<String, Object>> mapList = new ArrayList<Map<String,Object>>(); 
			
			for (int i = 1; i < 11; i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("productId" , i);
				map.put("addPrice" , 100 * i);
				mapList.add(map);
			}
			
		}
		

		// [ where ] 사용예시
		@Test
		public void whereEx() {
			
			System.out.println("\n --- whereEx --- \n");

			ProductDTO productDTO = new ProductDTO();
			// 1) productNm과 brandCd가 모두 있을 경우 > 정상
			// 2) productNm만 있을 경우 > 정상
			// 3) brandCd만 있을 경우 > 오류
			// productDTO.setProductNm("삼성");
			productDTO.setBrandId(1);
			
		}

		
		
		// [ set ] 사용예시
		@Test
		public void setEx() {

			System.out.println("\n --- setEx --- \n");

			ProductDTO productDTO = new ProductDTO();
			// 1) price와 deliveryPrice가 모두 있을 경우 > 정상
			// 2) price만 있을 경우 > 오류
			// 3) deliveryPrice만 있을 경우 > 정상
			productDTO.setPrice(1);
			productDTO.setDeliveryPrice(1);
		
		}
		

}
