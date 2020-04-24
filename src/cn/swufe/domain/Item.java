package cn.swufe.domain;

import java.util.Date;

public class Item {

    //股票代码
    private String identifier;
    //股票当前价格
    private float price;
    //当前时间
    private Date date;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
