package cn.swufe.domain;

public class Stock {

    //股票代码
    private String identifier;
    //股票名称
    private String name;
    //是否关注
    private int care;



    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCare() {
        return care;
    }

    public void setCare(int care) {
        this.care = care;
    }
}
