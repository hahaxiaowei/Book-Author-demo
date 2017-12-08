package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;

public interface NationalityMapper {
    /**
     * 根据主键删除国籍信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入国籍信息
     * @param record
     * @return
     */
    int insert(Nationality record);

    /**
     * 有条件的插入国籍信息
     * @param record
     * @return
     */
    int insertSelective(Nationality record);

    /**
     * 根据主键查询国籍信息
     * @param id
     * @return
     */
    Nationality selectByPrimaryKey(String id);

    /**
     * 有条件更新国籍信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Nationality record);

    /**
     * 根据主键更新国籍信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Nationality record);
}