package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.model.NationalityExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.NationalityMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.NationalityService;
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
public class NationalityServiceImpl implements NationalityService {
    private static Logger logger = LoggerFactory.getLogger(NationalityServiceImpl.class);

    @Autowired
    private NationalityMapper nationalityMapper;


    @Override
    public int deleteByPrimaryKey(String id) {
        return nationalityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Nationality record) {
        return nationalityMapper.insert(record);
    }

    @Override
    public int insertSelective(Nationality record) {
        return nationalityMapper.insertSelective(record);
    }

    @Override
    public Nationality selectByPrimaryKey(String id) {
        return nationalityMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<Nationality> selectPageQuery(String nationalityName, int pageNum, int pageSize) {
        NationalityExample nationalityExample = new NationalityExample();
        if (!StringUtil.isEmpty(nationalityName)) {
            nationalityExample.createCriteria().andNationalityNameLike(nationalityName);
        }
        Page<Nationality> page = PageHelper.startPage(pageNum,pageSize);
        List<Nationality> list = nationalityMapper.selectByExample(nationalityExample);
        Pagination<Nationality> pageInfo = new Pagination<Nationality>(list,page.getTotal());
        return pageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(Nationality record) {
        return nationalityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Nationality record) {
        return nationalityMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<Nationality> selectByColumn(Nationality nationality) {
        return nationalityMapper.selectByColumn(nationality);
    }

    @Override
    public List<Nationality> selectAll() {
        return nationalityMapper.selectAll();
    }
}
