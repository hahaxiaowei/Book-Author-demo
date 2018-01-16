package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithShop;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithShopExample;
import java.util.List;

public interface BookWithShopMapper {
    long countByExample(BookWithShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(BookWithShop record);

    int insertSelective(BookWithShop record);

    List<BookWithShop> selectByExample(BookWithShopExample example);

    BookWithShop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookWithShop record);

    int updateByPrimaryKey(BookWithShop record);
}