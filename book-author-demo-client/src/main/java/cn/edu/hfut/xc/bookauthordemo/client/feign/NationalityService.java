package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.NationalityHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:12:00
 */
@FeignClient(value = "book-author-demo-provider", fallback = NationalityHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface NationalityService {
    /**
     * 根据主键删除国籍信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/nationality/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入国籍信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/nationality/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Nationality record);

    /**
     * 有条件的插入国籍信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/nationality/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Nationality record);

    /**
     * 根据主键查询国籍信息
     * @param id
     * @return
     */
    @RequestMapping(value ="/nationality/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param nationalityName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/nationality/selectPageQuery",method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "nationalityName") String nationalityName ,
                                             @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                             @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件更新国籍信息
//     * @param record
//     * @return
//     */
//    Result updateByPrimaryKeySelective(@RequestBody Nationality record);

    /**
     * 根据主键更新国籍信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/nationality/updateByPrimaryKey" ,method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Nationality record);

    /**
     * 根据国籍某个字段来查询国籍信息
     * @param nationality
     * @return
     */
    @RequestMapping(value = "/nationality/selectColumn", method = RequestMethod.GET)
    Result selectByColumn(@RequestBody Nationality nationality);

    /**
     * 查询表中的所有国籍信息
     * @return
     */
    @RequestMapping(value = "/nationality/selectAll", method = RequestMethod.GET)
    Result selectAll();
}
