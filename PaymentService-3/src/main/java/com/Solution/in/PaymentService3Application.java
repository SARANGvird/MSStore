package com.Solution.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.Solution.in",
exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@EnableEurekaClient

public class PaymentService3Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentService3Application.class, args);
	}

}
