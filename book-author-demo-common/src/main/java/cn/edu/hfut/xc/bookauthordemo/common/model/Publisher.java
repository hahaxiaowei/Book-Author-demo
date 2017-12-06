package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Publisher {
    private String id;

    private String publisherName;

    private String publisherAddress;

    private String publisherNationalityId;

    private String publisherCreationTime;

    private String publisherLife;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName == null ? null : publisherName.trim();
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress == null ? null : publisherAddress.trim();
    }

    public String getPublisherNationalityId() {
        return publisherNationalityId;
    }

    public void setPublisherNationalityId(String publisherNationalityId) {
        this.publisherNationalityId = publisherNationalityId == null ? null : publisherNationalityId.trim();
    }

    public String getPublisherCreationTime() {
        return publisherCreationTime;
    }

    public void setPublisherCreationTime(String publisherCreationTime) {
        this.publisherCreationTime = publisherCreationTime == null ? null : publisherCreationTime.trim();
    }

    public String getPublisherLife() {
        return publisherLife;
    }

    public void setPublisherLife(String publisherLife) {
        this.publisherLife = publisherLife == null ? null : publisherLife.trim();
    }
}