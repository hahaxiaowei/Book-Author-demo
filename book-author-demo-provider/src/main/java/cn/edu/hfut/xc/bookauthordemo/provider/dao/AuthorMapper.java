package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;

public interface AuthorMapper {
    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入作者信息
     * @param record
     * @return
     */
    int insert(Author record);

    /**
     * 有条件的插入作者信息
     * @param record
     * @return
     */
    int insertSelective(Author record);

    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    Author selectByPrimaryKey(String id);

    /**
     * 有条件更新作者信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Author record);

    /**
     * 根据作者的主键更新作者信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Author record);
}