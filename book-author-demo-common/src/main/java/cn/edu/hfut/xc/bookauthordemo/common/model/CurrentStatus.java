package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.io.Serializable;

/**
 * Created by sunwei on 2018/1/11 Time:14:42
 */
public class CurrentStatus implements Serializable {
    private static final long serialVersionUID = -8340011846730242080L;

    //当前作者
    private Author author;

    public CurrentStatus(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
