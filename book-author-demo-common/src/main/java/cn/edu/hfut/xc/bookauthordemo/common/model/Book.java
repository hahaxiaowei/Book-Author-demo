package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Book {
    private String id;

    private String bookName;

    private String bookClassId;

    private String authorId;

    private String libraryId;

    private String shopId;

    private String publisherId;

    private String bookCode;

    private String publicationDate;

    private String publishedAddress;

    private String nationnalityId;

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

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId == null ? null : libraryId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
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

    public String getNationnalityId() {
        return nationnalityId;
    }

    public void setNationnalityId(String nationnalityId) {
        this.nationnalityId = nationnalityId == null ? null : nationnalityId.trim();
    }
}