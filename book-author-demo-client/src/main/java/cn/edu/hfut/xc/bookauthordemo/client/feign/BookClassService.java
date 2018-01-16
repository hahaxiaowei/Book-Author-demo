package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.AuthorHystrix;
import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.BookClassHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:11:59
 */
@FeignClient(value = "book-author-demo-provider", fallback = BookClassHystrix.class)//熔断处理，服务降级到AuthorHystrix类
public interface BookClassService {
    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    @RequestMapping(value = "/book/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入新的类别
     * @param record
     * @return
     */
    @RequestMapping(value = "/book/insert", method = RequestMethod.POST)
    Result insert(@RequestBody BookClass record);

    /**
     * 有条件的插入新的类别
     * @param record
     * @return
     */
    @RequestMapping(value = "/book/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody BookClass record);

    /**
     * 根据主键查询图书类别
     * @param id
     * @return
     */
    @RequestMapping(value ="/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param bookClassName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/book/selectPageQuery",method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "bookClassName") String bookClassName,
                                           @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                           @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件的更新类别
//     * @param record
//     * @return
//     */
//    Result updateByPrimaryKeySelective(BookClass record);

    /**
     * 根据主键更新类别
     * @param record
     * @return
     */

    @RequestMapping(value = "/bookclass/updateByPrimaryKey" ,method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody BookClass record);
}
