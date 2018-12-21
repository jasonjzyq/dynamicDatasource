package com.jzyq.dynamicdatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.jzyq.dynamicdatasource.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@MapperScan("com.jzyq.dynamicdatasource.dao")
@Import(DynamicDataSourceRegister.class)
public class DynamicdatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicdatasourceApplication.class, args);
	}

}

