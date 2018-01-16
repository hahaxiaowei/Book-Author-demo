package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Book {
    private String id;

    private String bookName;

    private String bookClassId;

    private String publisherId;

    private String bookCode;

    private String publicationDate;

    private String publishedAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookClassId() {
        return bookClassId;
    }

    public void setBookClassId(String bookClassId) {
        this.bookClassId = bookClassId == null ? null : bookClassId.trim();
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId == null ? null : publisherId.trim();
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode == null ? null : bookCode.trim();
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate == null ? null : publicationDate.trim();
    }

    public String getPublishedAddress() {
        return publishedAddress;
    }

    public void setPublishedAddress(String publishedAddress) {
        this.publishedAddress = publishedAddress == null ? null : publishedAddress.trim();
    }
}