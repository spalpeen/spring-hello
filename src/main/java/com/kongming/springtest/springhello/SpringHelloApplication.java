package com.kongming.springtest.springhello;

import com.kongming.springtest.springhello.interceptor.InterceptorConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(basePackages = {"com.kongming.springtest.springhello"})
//@ComponentScan(basePackageClasses = {InterceptorConfiguration.class})//这是扫描class
//@ComponentScan(basePackages = {"com.kongming.springtest.springhello.interceptor"})//这是扫描包
@SpringBootApplication
public class SpringHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}


}
