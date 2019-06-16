package com.suixingpay.jooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.suixingpay.jooq"})
public class JooqApplication {

    public static void main(String[] args) {
        SpringApplication.run(JooqApplication.class, args);
    }
}
