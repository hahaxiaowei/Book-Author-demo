package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.ShopMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.ShopService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:44
 */
@Service
public class ShopServiceImpl implements ShopService {

    private static Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return shopMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Shop record) {
        return shopMapper.insert(record);
    }

    @Override
    public int insertSelective(Shop record) {
        return shopMapper.insertSelective(record);
    }

    @Override
    public Shop selectByPrimaryKey(String id) {
        return shopMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<Shop> selectPageQuery(String shopName, int pageNum, int pageSize) {
        ShopExample nationalityExample = new ShopExample();
        if (!StringUtil.isEmpty(shopName)) {
            nationalityExample.createCriteria().andShopNameLike(shopName);
        }
        Page<Shop> page = PageHelper.startPage(pageNum, pageSize);
        List<Shop> list = shopMapper.selectByExample(nationalityExample);
        Pagination<Shop> pageInfo = new Pagination<Shop>(list, page.getTotal());
        return pageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return shopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return shopMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Shop> selectAll() {
        return shopMapper.selectAll();
    }

    @Override
    public List<Shop> selectShopByShopOwnerId(String shopOwnerId) {
        return shopMapper.selectShopByShopOwnerId(shopOwnerId);
    }

    @Override
    public List<Shop> selectShopByNationalityId(String nationalityId) {
        return shopMapper.selectShopByNationalityId(nationalityId);
    }
}
