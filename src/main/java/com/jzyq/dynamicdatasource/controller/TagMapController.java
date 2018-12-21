package com.jzyq.dynamicdatasource.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jzyq.dynamicdatasource.domain.TagMap;
import com.jzyq.dynamicdatasource.service.TagMapService;

/**
 * 
 * @Title TagMapController.java
 * @Package com.jzyq.dynamicdatasource.controller
 * @Description 
 * @Adddate 2018年12月21日 下午3:07:53
 * @version V1.0
 */
@RestController
public class TagMapController {

	private Logger logger = Logger.getLogger(TagMapController.class);

	@Autowired
	private TagMapService tagMapService;

	@GetMapping("/tagmap")
	public List<TagMap> getTagMap() {
		logger.info("使用数据源1");
		List<TagMap> list = tagMapService.getTagMap();
		return list;
	}

	@GetMapping("/tagmap2")
	public List<TagMap> getTagMap2() {
		logger.info("使用数据源2");
		List<TagMap> list = tagMapService.getTagMap2();
		return list;
	}
}
