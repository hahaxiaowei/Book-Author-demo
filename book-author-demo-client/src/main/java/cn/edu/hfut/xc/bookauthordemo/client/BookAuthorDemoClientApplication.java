package cn.edu.hfut.xc.bookauthordemo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by sunwei on 2017/12/6 Time:17:50
 */
@SpringBootApplication
@EnableDiscoveryClient//允许eureka注册中心发现
@EnableFeignClients //允许Feign
@EnableHystrix //允许负载均衡
@EnableSwagger2 //允许Swagger
public class BookAuthorDemoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookAuthorDemoClientApplication.class,args);
        System.out.println("client项目开始启动！！！");
    }
}
