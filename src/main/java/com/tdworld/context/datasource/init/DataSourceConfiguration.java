package com.tdworld.context.datasource.init;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfiguration {
	
	@Bean("readMember")
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public DataSource dataSourceReadMember() {
		return DataSourceBuilder.create().type(DruidDataSource.class).build();
	}	

}
