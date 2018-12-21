package com.jzyq.dynamicdatasource.datasource;

import java.lang.annotation.*;

/**
 * 
 * @Title TargetDataSource.java
 * @Package com.jzyq.dynamicdatasource.datasource
 * @Description 作用于类、接口或者方法上
 * @Adddate 2018年12月21日 下午3:00:30
 * @version V1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name();
    
}
