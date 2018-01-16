package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBook;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBookExample;
import java.util.List;

public interface AuthorWithBookMapper {
    long countByExample(AuthorWithBookExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthorWithBook record);

    int insertSelective(AuthorWithBook record);

    List<AuthorWithBook> selectByExample(AuthorWithBookExample example);

    AuthorWithBook selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthorWithBook record);

    int updateByPrimaryKey(AuthorWithBook record);

    /**
     * 查询所有信息
     */
    List<AuthorWithBook> selectAll();
}