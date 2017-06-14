package com.nag.batch.nagspringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NagSpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(NagSpringBatchApplication.class, args);
    }


}
