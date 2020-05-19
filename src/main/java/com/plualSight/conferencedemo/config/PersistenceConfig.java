package com.plualSight.conferencedemo.config;

import org.hibernate.dialect.PostgreSQL82Dialect;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfig {

    @Bean
    public DataSource setDataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/postgres");
        dataSourceBuilder.username("postgres").password("Welcome");
        System.out.println("My custom data source has been initialized");
        return dataSourceBuilder.build();
    }


}

