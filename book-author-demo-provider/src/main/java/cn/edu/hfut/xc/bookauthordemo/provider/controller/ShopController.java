package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:47
 */
@RestController
@RequestMapping(value = "/shop")
public class ShopController {
    private static Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ShopService shopService;

    /**
     * @param shop
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加商店信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Shop shop) {
        Result result = new Result();
        try {
            shopService.insert(shop);
            result.setData(shop.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入商店信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param shop
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加商店信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Shop shop) {
        Result result = new Result();
        try {
            shopService.insert(shop);
            result.setData(shop.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入商店信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }
    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键删除商店信息
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("出版商的id不能为空");
                return result;
            }
            shopService.deleteByPrimaryKey(id);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("deleteByPrimaryKey方法执行异常");
            logger.error("deleteByPrimaryKey方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param shop
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新商店信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Shop shop) {

        Result result = new Result();
        try {
            shopService.updateByPrimaryKey(shop);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(shop.getId());
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("updateByPrimaryKey执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键查询商店信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("商店id不能为空");
                return result;
            }
            result.setData(shopService.selectByPrimaryKey(id));
            result.setRetCode(Result.RECODE_SUCCESS);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param shopName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据出版商名字查询出版商信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery", method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false, defaultValue = "") String shopName,
                                  @RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "15") int pageSize) {
        Result result = new Result();
        try {
            Pagination<Shop> pagination = shopService.selectPageQuery(shopName, pageNum, pageSize);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(pagination);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有出版商信息
     * @method selectByColumn
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public Result selectAll(){
        Result result = new Result();
        try {
            List<Shop> list = shopService.selectAll();
            result.setData(list);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
