package cn.com.hdapao.product;

import cn.com.hdapao.api.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/product/")
public class ProductController {
    /**
     * 获取产品信息
     */
    @GetMapping("getProductInfo")
    public Goods getProductInfo(Long productId) {
        log.info("我进来了");
        Goods goods = Goods.builder().id(1L).name("小明").color("黑色").modifiedTime(new Date())
                .price(new BigDecimal("1000")).pictureList("1.jpg").size("28").shopId(1L).specification("我是一只无敌的手机").service("为您提供售后服务").build();
        return goods;
    }
}