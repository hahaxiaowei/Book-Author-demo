package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBook;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBookExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;

import java.util.List;

/**
 * Created by sunwei on 2018/1/18 Time:15:43
 */
public interface AuthorWithBookService {

    int deleteByPrimaryKey(String id);

    int insert(AuthorWithBook record);

    AuthorWithBook selectByPrimaryKey(String id);

    int updateByPrimaryKey(AuthorWithBook record);

    /**
     * 查询所有信息
     */
    List<AuthorWithBook> selectAll();
}
