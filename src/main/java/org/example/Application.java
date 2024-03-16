package org.example;
import java.sql.*;
import org.springframework.boot.SpringApplication;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@SpringBootApplication*/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"org.example"})
@EnableJpaRepositories("org.example.Repository")
public class Application {
    public static void main(String[] args) {
        System.out.println("Starting app...");
        SpringApplication.run(Application.class, args);
        System.out.println("Running server..");


    }
}