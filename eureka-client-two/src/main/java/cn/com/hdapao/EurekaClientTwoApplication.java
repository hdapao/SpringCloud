package cn.com.hdapao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huihui
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaClientTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTwoApplication.class);
    }
}
