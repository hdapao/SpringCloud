package cn.com.hdapao.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    private Long id;

    private String name;

    private BigDecimal price;

    private String pictureList;

    private String specification;

    private String service;

    private String color;

    private String size;

    private Long shopId;

    private Date modifiedTime;
}
