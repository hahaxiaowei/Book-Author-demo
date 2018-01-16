package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.LibraryHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:12:00
 */
@FeignClient(value = "book-author-demo-provider", fallback = LibraryHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface LibraryService {
    /**
     * 根据id删除图书馆信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/library/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入图书馆信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/library/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Library record);

    /**
     * 有条件的插入信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/library/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Library record);

    /**
     * 根据主键查询图书馆信息
     * @param id
     * @return
     */
    @RequestMapping(value ="/library/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param libraryName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/library/selectPageQuery",method = RequestMethod.GET)
    Result selectPageQuery (
            @RequestParam(required = false, defaultValue = "", value = "libraryName") String libraryName ,
            @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
            @RequestParam(defaultValue = "10", value = "pageSize") int pageSize
    );

//    /**
//     * 更新图书馆信息
//     * @param record
//     * @return
//     */
//
//    Result updateByPrimaryKeySelective(@RequestBody Library record);

    /**
     * 更新图书馆信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/library/updateByPrimaryKey" ,method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Library record);
}
