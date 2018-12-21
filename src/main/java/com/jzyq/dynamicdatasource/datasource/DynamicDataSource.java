package com.jzyq.dynamicdatasource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * @Title DynamicDataSource.java
 * @Package com.jzyq.dynamicdatasource.datasource
 * @Description 动态数据源
 * @Adddate 2018年12月21日 下午2:57:20
 * @version V1.0
 * AbstractRoutingDataSource(每执行一次数据库，动态获取DataSource)
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
