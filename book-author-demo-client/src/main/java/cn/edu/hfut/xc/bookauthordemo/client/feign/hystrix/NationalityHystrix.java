package cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix;


import cn.edu.hfut.xc.bookauthordemo.client.feign.NationalityService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.stereotype.Component;

/**
 * Created by sunwei on 2018/1/4 Time:13:37
 */
@Component
public class NationalityHystrix implements NationalityService {
    @Override
    public Result deleteByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insert(Nationality record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insertSelective(Nationality record) {
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
    public Result selectPageQuery(String nationalityName, int pageNum, int pageSize) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

//    @Override
//    public Result updateByPrimaryKeySelective(Nationality record) {
//        Result result = new Result();
//        result.setRetCode(Result.RECODE_ERROR);
//        result.setErrMsg("调用服务降级处理逻辑！");
//        return result;
//    }

    @Override
    public Result updateByPrimaryKey(Nationality record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectByColumn(Nationality nationality) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectAll() {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }
}
