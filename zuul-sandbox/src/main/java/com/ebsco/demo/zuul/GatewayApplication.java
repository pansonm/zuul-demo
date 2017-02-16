package com.ebsco.demo.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

  @Bean
  public LogRequestFilter logRequestFilter() {
    return new LogRequestFilter();
  }

  @Bean
  public AddResponseHeaderFilter addResponseHeaderFilter() {
    return new AddResponseHeaderFilter();
  }
}