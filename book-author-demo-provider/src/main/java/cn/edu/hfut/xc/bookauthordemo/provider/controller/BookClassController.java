package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by sunwei on 2017/12/8 Time:9:46
 */
@RestController
@RequestMapping("/bookclass")
public class BookClassController {

    private static Logger logger = LoggerFactory.getLogger(AuthorController.class);
    @Autowired
    private BookClassService bookClassService;

    /**
     * @param bookClass
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加图书类别信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody BookClass bookClass) {
        Result result = new Result();
        try {
            bookClassService.insert(bookClass);
            result.setData(bookClass.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书类别信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param bookClass
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 有条件的添加图书类别信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody BookClass bookClass) {
        Result result = new Result();
        try {
            bookClassService.insertSelective(bookClass);
            result.setData(bookClass.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书类别信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insertSelective方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insertSelective方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }


    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书类别的id不能为空");
                return result;
            }
            bookClassService.deleteByPrimaryKey(id);
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
     * @param bookClass
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新作者信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey" ,method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody BookClass bookClass){

        Result result = new Result();
        try {
            bookClassService.updateByPrimaryKey(bookClass);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(bookClass.getId());
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("updateByPrimaryKey执行异常");
            logger.error("方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键查询图书类别信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书类别id不能为空");
                return result;
            }
            result.setData(bookClassService.selectByPrimaryKey(id));
            result.setRetCode(Result.RECODE_SUCCESS);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param bookClassName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据图书类别名分页查询作者信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery",method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false,defaultValue = "") String bookClassName,
                                  @RequestParam(defaultValue = "1") int pageNum ,
                                  @RequestParam(defaultValue = "15") int pageSize){
        Result result = new Result();
        try {
            Pagination<BookClass> pagination = bookClassService.selectPageQuery(bookClassName,pageNum,pageSize);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(pagination);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
