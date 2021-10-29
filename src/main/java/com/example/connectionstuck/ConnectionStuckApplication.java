package com.example.connectionstuck;

import io.r2dbc.spi.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class ConnectionStuckApplication {

  public static void main(String[] args) {

    System.setProperty("logging.level.io.r2dbc.postgresql", "DEBUG");
    System.setProperty("logging.level", "TRACE");
    System.setProperty("logging.level.io.r2dbc.pool", "TRACE");
    SpringApplication.run(ConnectionStuckApplication.class, args);
  }

}
