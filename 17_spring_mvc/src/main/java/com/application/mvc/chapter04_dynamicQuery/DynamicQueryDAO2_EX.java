package com.application.mvc.chapter04_dynamicQuery;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.application.mvc.data.BrandDTO;
import com.application.mvc.data.ProductDTO;

@Mapper
public interface DynamicQueryDAO2_EX {
	
		// [ if ] 사용예시
		public List<ProductDTO> ifEx(Map<String,Object> searchMap);
		
		// [ when ] 사용예시
		public List<ProductDTO> whenEx(Map<String, Object> searchMap);
		// [ otherwise ] 사용예시
		public List<ProductDTO> otherwiseEx(int deliveryPrice);
		// [ foreach ] insert 사용예시
		public void foreachEx01(List<BrandDTO> brandList);
		// [ foreach ] select 사용예시
		public BrandDTO foreachEx02(long[] brandList);
		// [ foreach ] delete 사용예시
		public void foreachEx03(long[] brandList);
		// [ foreach ] update 사용예시1
		// [ foreach ] update 사용예시2
		
		// [ where ] 사용예시
		// [ set ] 사용예시

}
