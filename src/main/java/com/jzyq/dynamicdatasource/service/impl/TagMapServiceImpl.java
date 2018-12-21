package com.jzyq.dynamicdatasource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzyq.dynamicdatasource.dao.TagMapDAO;
import com.jzyq.dynamicdatasource.datasource.TargetDataSource;
import com.jzyq.dynamicdatasource.domain.TagMap;
import com.jzyq.dynamicdatasource.service.TagMapService;

@Service
public class TagMapServiceImpl implements TagMapService{

	@Autowired
	private TagMapDAO tagMapDAO;
	
	@Override
	@TargetDataSource(name="ds1")
	public List<TagMap> getTagMap() {
		return tagMapDAO.getTagMap();
	}

	@Override
	@TargetDataSource(name="ds2")
	public List<TagMap> getTagMap2() {
		return tagMapDAO.getTagMap();
	}
}
