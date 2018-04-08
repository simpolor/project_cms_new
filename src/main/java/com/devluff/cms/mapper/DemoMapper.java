package com.devluff.cms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.devluff.cms.model.Demo;

@Mapper
public interface DemoMapper {

	int selectDemoCount();
	
	Demo selectDemo(int seq);
	
	@Select("SELECT COUNT(*) FROM demo")
	int findAllCount();
}
