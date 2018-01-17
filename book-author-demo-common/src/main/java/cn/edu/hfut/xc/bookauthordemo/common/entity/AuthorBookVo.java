package cn.edu.hfut.xc.bookauthordemo.common.entity;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;

/**
 * Created by sunwei on 2018/1/16 Time:14:52
 */
public class AuthorBookVo {
    private Author author;
    private Book book;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "AuthorBookVo{" +
                "author=" + author +
                ", book=" + book +
                '}';
    }
}
