package cn.edu.hfut.xc.bookauthordemo.client.controller;

import cn.edu.hfut.xc.bookauthordemo.client.feign.NationalityService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunwei on 2018/1/4 Time:13:41
 */
@RestController
@RequestMapping(value = "/nationality")
public class NationalityController {
    private static Logger logger = LoggerFactory.getLogger(NationalityController.class);

    @Autowired
    private NationalityService nationalityService;

    /**
     * @param nationality
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加国籍信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Nationality nationality) {
        Result result = new Result();
        try {
            result = nationalityService.insert(nationality);
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param nationality
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加国籍信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Nationality nationality) {
        Result result = new Result();
        try {
            result = nationalityService.insert(nationality);
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
     * @description 根据主键删除国籍信息
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = nationalityService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("deleteByPrimaryKey方法执行异常");
            logger.error("deleteByPrimaryKey方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param nationality
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新图书馆信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Nationality nationality) {

        Result result = new Result();
        try {
            result = nationalityService.updateByPrimaryKey(nationality);
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
     * @description 根据主键查询国籍信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = nationalityService.selectByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param nationlityName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据国籍名字查询国籍信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery", method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false, defaultValue = "") String nationlityName,
                                  @RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "15") int pageSize) {
        Result result = new Result();
        try {
            result = nationalityService.selectPageQuery(nationlityName, pageNum, pageSize);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param nationality
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据国籍某个字段来查询国籍信息
     * @method selectByColumn
     */
    @RequestMapping(value = "/selectColumn", method = RequestMethod.GET)
    public Result selectByColumn(@RequestBody Nationality nationality) {

        Result result = new Result();
        try {
           result = nationalityService.selectByColumn(nationality);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据国籍某个字段来查询国籍信息
     * @method selectByColumn
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public Result selectAll(){
        Result result = new Result();
        try {
           result = nationalityService.selectAll();
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

}
