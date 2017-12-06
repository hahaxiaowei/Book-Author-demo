package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Shop {
    private String id;

    private String shopName;

    private String shopAddress;

    private String shopCreationTime;

    private String shopLife;

    private String shopNationalityId;

    private String shopOwnerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopCreationTime() {
        return shopCreationTime;
    }

    public void setShopCreationTime(String shopCreationTime) {
        this.shopCreationTime = shopCreationTime == null ? null : shopCreationTime.trim();
    }

    public String getShopLife() {
        return shopLife;
    }

    public void setShopLife(String shopLife) {
        this.shopLife = shopLife == null ? null : shopLife.trim();
    }

    public String getShopNationalityId() {
        return shopNationalityId;
    }

    public void setShopNationalityId(String shopNationalityId) {
        this.shopNationalityId = shopNationalityId == null ? null : shopNationalityId.trim();
    }

    public String getShopOwnerId() {
        return shopOwnerId;
    }

    public void setShopOwnerId(String shopOwnerId) {
        this.shopOwnerId = shopOwnerId == null ? null : shopOwnerId.trim();
    }
}