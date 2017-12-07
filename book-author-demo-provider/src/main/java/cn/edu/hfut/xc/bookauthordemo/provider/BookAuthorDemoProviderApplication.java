package cn.edu.hfut.xc.bookauthordemo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by sunwei on 2017/12/6 Time:17:37
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BookAuthorDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookAuthorDemoProviderApplication.class,args);
    }
}
