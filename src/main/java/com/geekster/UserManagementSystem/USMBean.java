package com.geekster.UserManagementSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class USMBean {

    @Bean
    List<UMS> getResource(){
        return new ArrayList<>();
    }
}
