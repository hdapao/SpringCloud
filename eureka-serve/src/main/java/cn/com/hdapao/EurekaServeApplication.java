package cn.com.hdapao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huihui
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServeApplication.class);
    }
}
