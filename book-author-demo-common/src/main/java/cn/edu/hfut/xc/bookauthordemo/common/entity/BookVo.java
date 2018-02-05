package cn.edu.hfut.xc.bookauthordemo.common.entity;

import cn.edu.hfut.xc.bookauthordemo.common.model.*;

import java.util.List;

/**
 * Created by sunwei on 2018/1/18 Time:16:45
 */
public class BookVo {
    private String id;

    private String bookName;

    private String bookClassName;

    private String publisherName;

    private String bookCode;

    private String publicationDate;

    private String publishedAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookClassName() {
        return bookClassName;
    }

    public void setBookClassName(String bookClassName) {
        this.bookClassName = bookClassName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublishedAddress() {
        return publishedAddress;
    }

    public void setPublishedAddress(String publishedAddress) {
        this.publishedAddress = publishedAddress;
    }

    @Override
    public String toString() {
        return "BookVo{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookClassName='" + bookClassName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", publishedAddress='" + publishedAddress + '\'' +
                '}';
    }
}
