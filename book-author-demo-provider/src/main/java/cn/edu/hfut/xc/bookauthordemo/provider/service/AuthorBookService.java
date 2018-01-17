package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.provider.dao.AuthorMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunwei on 2018/1/16 Time:14:54
 */
public class AuthorBookService {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private BookMapper bookMapper;


}
