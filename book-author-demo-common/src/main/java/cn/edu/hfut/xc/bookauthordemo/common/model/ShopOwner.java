package cn.edu.hfut.xc.bookauthordemo.common.model;

public class ShopOwner {
    private String id;

    private String shopOwnerName;

    private String shopOwnerSex;

    private String shopOwnerAge;

    private String shopOwnerAddress;

    private String shopOwnerNation;

    private String shopOwnerNationalityId;

    private String shopOwnerRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShopOwnerName() {
        return shopOwnerName;
    }

    public void setShopOwnerName(String shopOwnerName) {
        this.shopOwnerName = shopOwnerName == null ? null : shopOwnerName.trim();
    }

    public String getShopOwnerSex() {
        return shopOwnerSex;
    }

    public void setShopOwnerSex(String shopOwnerSex) {
        this.shopOwnerSex = shopOwnerSex == null ? null : shopOwnerSex.trim();
    }

    public String getShopOwnerAge() {
        return shopOwnerAge;
    }

    public void setShopOwnerAge(String shopOwnerAge) {
        this.shopOwnerAge = shopOwnerAge == null ? null : shopOwnerAge.trim();
    }

    public String getShopOwnerAddress() {
        return shopOwnerAddress;
    }

    public void setShopOwnerAddress(String shopOwnerAddress) {
        this.shopOwnerAddress = shopOwnerAddress == null ? null : shopOwnerAddress.trim();
    }

    public String getShopOwnerNation() {
        return shopOwnerNation;
    }

    public void setShopOwnerNation(String shopOwnerNation) {
        this.shopOwnerNation = shopOwnerNation == null ? null : shopOwnerNation.trim();
    }

    public String getShopOwnerNationalityId() {
        return shopOwnerNationalityId;
    }

    public void setShopOwnerNationalityId(String shopOwnerNationalityId) {
        this.shopOwnerNationalityId = shopOwnerNationalityId == null ? null : shopOwnerNationalityId.trim();
    }

    public String getShopOwnerRemark() {
        return shopOwnerRemark;
    }

    public void setShopOwnerRemark(String shopOwnerRemark) {
        this.shopOwnerRemark = shopOwnerRemark == null ? null : shopOwnerRemark.trim();
    }
}