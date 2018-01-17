package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithLibrary;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithNationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookWithShopMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2017/12/6 Time:17:26
 */
@Service
public class BookServiceImpl implements BookService {

    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookWithNationality bookWithNationality;

    @Autowired
    private BookWithLibrary bookWithLibrary;

    @Autowired
    private BookWithShopMapper bookWithShopMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return bookMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insert
     */
    @Override

    public int insert(Book record) {
        BookWithNationality bookWithNationality = new BookWithNationality();
        bookWithNationality.setBookId(record.getId());
        bookWithNationality.setBookName(record.getBookName());

        return bookMapper.insert(record);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insertSelective
     */
    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Book
     * @description
     * @method selectByPrimaryKey
     */
    @Override
    public Book selectByPrimaryKey(String id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<Book> selectPageQuery(String bookName, int pageNum, int pageSize) {
        BookExample bookClassExample = new BookExample();
        if (!StringUtil.isNullOrEmpty(bookName)) {
            bookClassExample.createCriteria().andBookNameLike(bookName);
        }
        Page<Book> page = PageHelper.startPage(pageNum,pageSize);
        List<Book> list = bookMapper.selectByExample(bookClassExample);
        Pagination<Book> pagination = new Pagination<Book>(list,page.getTotal());
        return pagination;
    }

    /**
     * @param record
     * @return int
     * @description
     * @method updateByPrimaryKeySelective
     */
    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method updateByPrimaryKey
     */
    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
