package cn.com.talkshop.Item.model;

/**
 * @Author: hsh
 * @Date: 2019/8/8 8:19 PM
 * @Description:
 */
public class Item {

    private Long id;
    private String name;
    private String price;
    public Item() {

    }

    public Item(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
