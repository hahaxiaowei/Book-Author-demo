package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.AuthorMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunwei on 2017/12/6 Time:17:26
 */
@Service
public class AuthorServiceImpl implements AuthorService{

    private Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);

    @Autowired
    private AuthorMapper authorMapper;
    /**
     * @param id
     * @return int
     * @description
     * @method deleteByPrimaryKey
     */
    @Override
    public int deleteByPrimaryKey(String id) {
        return authorMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insert
     */
    @Override
    public int insert(Author record) {
        return authorMapper.insert(record);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insertSelective
     */
    @Override
    public int insertSelective(Author record) {
        return authorMapper.insertSelective(record);
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description
     * @method selectByPrimaryKey
     */
    @Override
    public Author selectByPrimaryKey(String id) {
        return authorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Author record) {
        return authorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Author record) {
        return authorMapper.updateByPrimaryKey(record);
    }
}
