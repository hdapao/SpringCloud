package cn.com.talkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: hsh
 * @Date: 2019/6/23 9:55 PM
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ItemAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(ItemAppilcation.class);
    }
}
