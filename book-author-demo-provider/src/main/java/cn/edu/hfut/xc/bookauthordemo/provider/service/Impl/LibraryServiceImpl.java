package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.model.LibraryExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.LibraryMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.LibraryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:43
 */
@Service
public class LibraryServiceImpl implements LibraryService {
    private static Logger logger = LoggerFactory.getLogger(LibraryServiceImpl.class);

    @Autowired
    private LibraryMapper libraryMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return libraryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Library record) {
        return libraryMapper.insert(record);
    }

    @Override
    public int insertSelective(Library record) {
        return libraryMapper.insertSelective(record);
    }

    @Override
    public Library selectByPrimaryKey(String id) {
        return libraryMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<Library> selectPageQuery(String libraryName, int pageNum, int pageSize) {
        LibraryExample bookClassExample = new LibraryExample();
        if (!StringUtil.isNullOrEmpty(libraryName)) {
            bookClassExample.createCriteria().andLibraryNameLike(libraryName);
        }
        Page<Library> page = PageHelper.startPage(pageNum,pageSize);
        List<Library> list = libraryMapper.selectByExample(bookClassExample);
        Pagination<Library> pagination = new Pagination<Library>(list,page.getTotal());
        return pagination;
    }

    @Override
    public int updateByPrimaryKeySelective(Library record) {
        return libraryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Library record) {
        return libraryMapper.updateByPrimaryKey(record);
    }
}
