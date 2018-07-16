package com.tdworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.tdworld")
@SpringBootApplication(exclude = {
		DataSourceTransactionManagerAutoConfiguration.class,
		DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class	
})
public class WebMainStarter {
	
	public static void main(String[] args) {
		SpringApplication.run(WebMainStarter.class, args);
	}
	
}
