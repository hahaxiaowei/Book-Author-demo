package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClassExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookClassMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookClassService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:42
 */
@Service
public class BookClassServiceImpl implements BookClassService{

    private static Logger logger = LoggerFactory.getLogger(BookClassServiceImpl.class);

    @Autowired
    private BookClassMapper bookClassMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return bookClassMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BookClass record) {
        return bookClassMapper.insert(record);
    }

    @Override
    public int insertSelective(BookClass record) {
        return bookClassMapper.insertSelective(record);
    }

    @Override
    public BookClass selectByPrimaryKey(String id) {
        return bookClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<BookClass> selectPageQuery(String bookClassName, int pageNum, int pageSize) {
        BookClassExample bookClassExample = new BookClassExample();
        if (!StringUtil.isNullOrEmpty(bookClassName)) {
              bookClassExample.createCriteria().andClassNameLike(bookClassName);
        }
        Page<BookClass> page = PageHelper.startPage(pageNum,pageSize);
        List<BookClass> list = bookClassMapper.selectByExample(bookClassExample);
        Pagination<BookClass> pagination = new Pagination<BookClass>(list,page.getTotal());
        return pagination;
    }

    @Override
    public int updateByPrimaryKeySelective(BookClass record) {
        return bookClassMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BookClass record) {
        return bookClassMapper.updateByPrimaryKey(record);
    }
}
