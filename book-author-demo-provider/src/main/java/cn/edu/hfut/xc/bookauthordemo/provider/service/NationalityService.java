package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;

/**
 * Created by sunwei on 2017/12/8 Time:9:41
 */
public interface NationalityService {
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
     * 分页查询
     * @param nationalityName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Nationality> selectPageQuery (String nationalityName, int pageNum , int pageSize);

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
