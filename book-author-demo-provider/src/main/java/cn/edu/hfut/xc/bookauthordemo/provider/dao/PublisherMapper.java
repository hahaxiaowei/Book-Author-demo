package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.model.PublisherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PublisherMapper {
    long countByExample(PublisherExample example);

    int deleteByPrimaryKey(String id);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    List<Publisher> selectByExample(PublisherExample example);

    Publisher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);

    /**
     * 根据出版商某个字段来查询信息
     * @param publisher
     * @return
     */
    List<Publisher> selectByColumn(Publisher publisher);

    /**
     * 查询所有信息
     */
    List<Publisher> selectAll();

    List<Publisher> selectPublisherByNationalityId(@Param("publisherNationalityId") String publisherNationalityId);
}