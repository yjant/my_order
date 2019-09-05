package com.iweb.my_order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iweb.my_order.dao")
public class MyOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOrderApplication.class, args);
	}

}
