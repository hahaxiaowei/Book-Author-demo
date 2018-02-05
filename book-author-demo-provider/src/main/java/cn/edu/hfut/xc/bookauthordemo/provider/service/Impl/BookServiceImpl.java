package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.entity.BookVo;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookClassMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.BookMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.PublisherMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
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
    private PublisherMapper publisherMapper;

    @Autowired
    private BookClassMapper bookClassMapper;

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
    public Pagination<BookVo> selectPageQuery(String bookName, int pageNum, int pageSize) {
        BookExample bookClassExample = new BookExample();
        if (!StringUtil.isNullOrEmpty(bookName)) {
            bookClassExample.createCriteria().andBookNameLike(bookName);
        }
        Page<BookVo> page = PageHelper.startPage(pageNum,pageSize);
        List<Book> list = bookMapper.selectByExample(bookClassExample);
        List<BookVo> listBookVo  = new LinkedList<BookVo>();
        for(int i = 0; i < list.size(); i++) {
            BookVo bookVo = new BookVo();
            bookVo.setId(list.get(i).getId());
            bookVo.setBookName(list.get(i).getBookName());
            bookVo.setPublicationDate(list.get(i).getPublicationDate());
            bookVo.setPublishedAddress(list.get(i).getPublishedAddress());
            bookVo.setBookCode(list.get(i).getBookCode());
            if (StringUtil.isNullOrEmpty(list.get(i).getBookClassId()) && StringUtil.isNullOrEmpty(list.get(i).getPublisherId())) {
                  bookVo.setPublisherName(null);
                  bookVo.setBookClassName(null);
            }else if (!StringUtil.isNullOrEmpty(list.get(i).getBookClassId()) && StringUtil.isNullOrEmpty(list.get(i).getPublisherId())) {
                bookVo.setBookClassName(bookClassMapper.selectByPrimaryKey(list.get(i).getBookClassId()).getClassName());
                bookVo.setPublisherName(null);
            }else if (StringUtil.isNullOrEmpty(list.get(i).getBookClassId()) && !StringUtil.isNullOrEmpty(list.get(i).getPublisherId())) {
                bookVo.setPublisherName(publisherMapper.selectByPrimaryKey(list.get(i).getPublisherId()).getPublisherName());
                bookVo.setBookClassName(null);
            }else {
                bookVo.setBookClassName(bookClassMapper.selectByPrimaryKey(list.get(i).getBookClassId()).getClassName());
                bookVo.setPublisherName(publisherMapper.selectByPrimaryKey(list.get(i).getPublisherId()).getPublisherName());
            }
            listBookVo.add(bookVo);
        }
        Pagination<BookVo> pagination = new Pagination<BookVo>(listBookVo,page.getTotal());
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

    @Override
    public List<Book> selectBooksByAuthorId(String authorId) {
        return bookMapper.selectBooksByAuthorId(authorId);
    }

    @Override
    public List<Book> selectBooksByLibraryId(String libraryId) {
        return bookMapper.selectBooksByLibraryId(libraryId);
    }

    @Override
    public List<Book> selectBooksByShopId(String shopId) {
        return bookMapper.selectBooksByShopId(shopId);
    }

    @Override
    public List<Book> selectBooksByNationalityId(String nationalityId) {
        return bookMapper.selectBooksByNationalityId(nationalityId);
    }

    @Override
    public Book selectBookAuthorByPrimaryKey(String id) {
        return bookMapper.selectBookAuthorByPrimaryKey(id);
    }

    @Override
    public List<Book> selectBookWithAuthor() {
        return bookMapper.selectBookWithAuthor();
    }

    @Override
    public Book selectBookLibraryByPrimaryKey(String id) {
        return bookMapper.selectBookAuthorByPrimaryKey(id);
    }

    @Override
    public List<Book> selectBookWithLibrary() {
        return bookMapper.selectBookWithAuthor();
    }
}
