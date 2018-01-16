package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.model.NationalityExample;
import java.util.List;

public interface NationalityMapper {
    long countByExample(NationalityExample example);

    int deleteByPrimaryKey(String id);

    int insert(Nationality record);

    int insertSelective(Nationality record);

    List<Nationality> selectByExample(NationalityExample example);

    Nationality selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Nationality record);

    int updateByPrimaryKey(Nationality record);

    /**
     * 根据国籍表里面的某个字段查询数据
     */
    List<Nationality> selectByColumn(Nationality nationality);

    /**
     * 查询所有国籍信息
     */
    List<Nationality> selectAll();
}