package cn.edu.hfut.xc.bookauthordemo.common.model;

public class ShopWithShopOwner {
    private String id;

    private String shopId;

    private String shopOwnerId;

    private String shopName;

    private String shopOwnerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopOwnerId() {
        return shopOwnerId;
    }

    public void setShopOwner(String shopOwnerId) {
        this.shopOwnerId = shopOwnerId == null ? null : shopOwnerId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopOwnerName() {
        return shopOwnerName;
    }

    public void setShopOwnerName(String shopOwnerName) {
        this.shopOwnerName = shopOwnerName == null ? null : shopOwnerName.trim();
    }
}