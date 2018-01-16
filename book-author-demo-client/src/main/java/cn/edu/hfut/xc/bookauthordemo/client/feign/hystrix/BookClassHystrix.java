package cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix;


import cn.edu.hfut.xc.bookauthordemo.client.feign.BookClassService;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.stereotype.Component;

/**
 * Created by sunwei on 2018/1/4 Time:13:36
 */
@Component
public class BookClassHystrix implements BookClassService {
    @Override
    public Result deleteByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insert(BookClass record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insertSelective(BookClass record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectPageQuery(String bookClassName, int pageNum, int pageSize) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

//    @Override
//    public Result updateByPrimaryKeySelective(BookClass record) {
//        Result result = new Result();
//        result.setRetCode(Result.RECODE_ERROR);
//        result.setErrMsg("调用服务降级处理逻辑！");
//        return result;
//    }

    @Override
    public Result updateByPrimaryKey(BookClass record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }
}
