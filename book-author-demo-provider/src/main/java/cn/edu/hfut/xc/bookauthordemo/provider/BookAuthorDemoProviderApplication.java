package cn.edu.hfut.xc.bookauthordemo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by sunwei on 2017/12/6 Time:17:37
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
public class BookAuthorDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookAuthorDemoProviderApplication.class,args);
        System.out.println("provider项目开始启动！！！");
    }
}
