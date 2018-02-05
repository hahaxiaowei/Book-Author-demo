package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.model.PublisherExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.PublisherMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.PublisherService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:43
 */
@Service
public class PublisherServiceImpl implements PublisherService {

    private static Logger logger = LoggerFactory.getLogger(PublisherServiceImpl.class);

    @Autowired
    private PublisherMapper publisherMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return publisherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Publisher record) {
        return publisherMapper.insert(record);
    }

    @Override
    public int insertSelective(Publisher record) {
        return publisherMapper.insertSelective(record);
    }

    @Override
    public Publisher selectByPrimaryKey(String id) {
        return publisherMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<Publisher> selectPageQuery(String publisherName, int pageNum, int pageSize) {
        PublisherExample nationalityExample = new PublisherExample();
        if (!StringUtil.isEmpty(publisherName)) {
            nationalityExample.createCriteria().andPublisherNameLike(publisherName);
        }
        Page<Publisher> page = PageHelper.startPage(pageNum, pageSize);
        List<Publisher> list = publisherMapper.selectByExample(nationalityExample);
        Pagination<Publisher> pageInfo = new Pagination<Publisher>(list, page.getTotal());
        return pageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(Publisher record) {
        return publisherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Publisher record) {
        return publisherMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Publisher> selectAll() {
        return publisherMapper.selectAll();
    }

    @Override
    public List<Publisher> selectPublisherByNationalityId(String nationalityId) {
        return publisherMapper.selectPublisherByNationalityId(nationalityId);
    }
}
