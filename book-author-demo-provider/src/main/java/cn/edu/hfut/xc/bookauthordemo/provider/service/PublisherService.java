package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:41
 */
public interface PublisherService {

    /**
     * 根据主键删除出版商信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入出版商信息
     * @param record
     * @return
     */
    int insert(Publisher record);

    /**
     * 有条件的插入出版商信息
     * @param record
     * @return
     */
    int insertSelective(Publisher record);

    /**
     * 根据主键查询出版商信息
     * @param id
     * @return
     */
    Publisher selectByPrimaryKey(String id);

    /**
     * 分页查询
     * @param publisherName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Publisher> selectPageQuery (String publisherName, int pageNum , int pageSize);

    /**
     * 有条件的更新出版商信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Publisher record);

    /**
     * 更新出版商信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Publisher record);

    /**
     * 查询所有信息
     */
    List<Publisher> selectAll();
}
