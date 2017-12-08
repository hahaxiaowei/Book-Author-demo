package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunwei on 2017/12/6 Time:17:26
 */
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }
}
