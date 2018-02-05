package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.PublisherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:47
 */
@RestController
@RequestMapping(value = "/publisher")
public class PublisherController {
    private static Logger logger = LoggerFactory.getLogger(PublisherController.class);

    @Autowired
    private PublisherService publisherService;

    /**
     * @param publisher
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加出版商信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Publisher publisher) {
        Result result = new Result();
        try {
            publisherService.insert(publisher);
            result.setData(publisher.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入出版商信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param publisher
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加出版商信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Publisher publisher) {
        Result result = new Result();
        try {
            publisherService.insert(publisher);
            result.setData(publisher.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入出版商信息成功,生成的id为" + result.getData());
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
     * @description 根据主键删除出版商信息
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
            publisherService.deleteByPrimaryKey(id);
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
     * @param publisher
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新出版商信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Publisher publisher) {

        Result result = new Result();
        try {
            publisherService.updateByPrimaryKey(publisher);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(publisher.getId());
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
     * @description 根据主键查询出版商信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("国籍id不能为空");
                return result;
            }
            result.setData(publisherService.selectByPrimaryKey(id));
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
     * @param publisherName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据出版商名字查询出版商信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery", method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false, defaultValue = "") String publisherName,
                                  @RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "15") int pageSize) {
        Result result = new Result();
        try {
            Pagination<Publisher> pagination = publisherService.selectPageQuery(publisherName, pageNum, pageSize);
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
            List<Publisher> list = publisherService.selectAll();
            result.setData(list);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param nationaltiyId
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据国籍id查询该国籍下的出版商信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectPublisherByNationalityId/{nationaltiyId}", method = RequestMethod.GET)
    public Result selectPublisherByNationalityId(@PathVariable String nationaltiyId) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(nationaltiyId)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("国籍id不能为空");
                return result;
            }
            result.setData(publisherService.selectPublisherByNationalityId(nationaltiyId));
            result.setRetCode(Result.RECODE_SUCCESS);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }


}
