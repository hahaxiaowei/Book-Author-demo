package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithNationality;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithNationalityExample;
import java.util.List;

public interface BookWithNationalityMapper {
    long countByExample(BookWithNationalityExample example);

    int deleteByPrimaryKey(String id);

    int insert(BookWithNationality record);

    int insertSelective(BookWithNationality record);

    List<BookWithNationality> selectByExample(BookWithNationalityExample example);

    BookWithNationality selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookWithNationality record);

    int updateByPrimaryKey(BookWithNationality record);

    /**
     * 查询所有作者信息
     */
    List<BookWithNationality> selectAll();
}