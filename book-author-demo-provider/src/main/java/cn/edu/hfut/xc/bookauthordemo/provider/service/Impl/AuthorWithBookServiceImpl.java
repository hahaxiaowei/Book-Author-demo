package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBook;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBookExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.AuthorWithBookMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorWithBookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2018/1/18 Time:15:46
 */

@Service
public class AuthorWithBookServiceImpl implements AuthorWithBookService {

    @Autowired
    private AuthorWithBookMapper authorWithBookMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return authorWithBookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AuthorWithBook record) {
        return authorWithBookMapper.insert(record);
    }

    @Override
    public AuthorWithBook selectByPrimaryKey(String id) {
        return authorWithBookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(AuthorWithBook record) {
        return authorWithBookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AuthorWithBook> selectAll() {
        return authorWithBookMapper.selectAll();
    }

}
