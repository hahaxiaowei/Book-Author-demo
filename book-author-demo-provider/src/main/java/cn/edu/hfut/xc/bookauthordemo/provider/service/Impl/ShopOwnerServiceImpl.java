package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.model.PublisherExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwnerExample;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.ShopMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.ShopOwnerMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.ShopOwnerService;
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
public class ShopOwnerServiceImpl implements ShopOwnerService {

    private static Logger logger = LoggerFactory.getLogger(ShopOwnerServiceImpl.class);

    @Autowired
    private ShopOwnerMapper shopOwnerMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return shopOwnerMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(ShopOwner record) {
        return shopOwnerMapper.insert(record);
    }

    @Override
    public int insertSelective(ShopOwner record) {
        return shopOwnerMapper.insertSelective(record);
    }

    @Override
    public ShopOwner selectByPrimaryKey(String id) {
        return shopOwnerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pagination<ShopOwner> selectPageQuery(String shopOwnerName, int pageNum, int pageSize) {
        ShopOwnerExample nationalityExample = new ShopOwnerExample();
        if (!StringUtil.isEmpty(shopOwnerName)) {
            nationalityExample.createCriteria().andShopOwnerNameLike(shopOwnerName);
        }
        Page<ShopOwner> page = PageHelper.startPage(pageNum, pageSize);
        List<ShopOwner> list = shopOwnerMapper.selectByExample(nationalityExample);
        Pagination<ShopOwner> pageInfo = new Pagination<ShopOwner>(list, page.getTotal());
        return pageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(ShopOwner record) {
        return shopOwnerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopOwner record) {
        return shopOwnerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ShopOwner> selectShopOwnerByShopId(String shopId) {
        return shopOwnerMapper.selectShopOwnerByShopId(shopId);
    }

    @Override
    public List<ShopOwner> selectShopOwnerByNationalityId(String nationalityId) {
        return shopOwnerMapper.selectShopOwnerByNationalityId(nationalityId);
    }

    @Override
    public List<ShopOwner> selectAll() {
        return shopOwnerMapper.selectAll();
    }
}
