package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.AuthorHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunwei on 2018/1/4 Time:11:54
 */
@FeignClient(value = "book-author-demo-provider", fallback = AuthorHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface AuthorService {
    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/author/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@RequestParam(value = "id") String id);

    /**
     * 插入作者信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/author/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Author record);

    /**
     * 有条件的插入作者信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/author/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Author record);

    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    @RequestMapping(value ="/author/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param authorName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/author/selectPageQuery",method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "authorName") String authorName,
                                        @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                        @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件更新作者信息
//     * @param record
//     * @return
//     */
//
//    Result updateByPrimaryKeySelective(@RequestBody Author record);

    /**
     * 根据作者的主键更新作者信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/author/updateByPrimaryKey" ,method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Author record);

    /**
     * 判断手机号是否存在
     */
    @RequestMapping(value = "/author/isPhoneNumberExist/{phoneNumber}",method = RequestMethod.GET)
    Result isPhoneNumberExist(@PathVariable(value = "phoneNumber") String phoneNumber);

    /**
     * 登录操作
     * @param authorInfo
     * @return
     */
    @RequestMapping(value = "/author/login",method = RequestMethod.POST)
    Result login(@RequestBody AuthorInfo authorInfo);

    /**
     * 登出操作
     * @param request
     * @return
     */
    @RequestMapping(value = "/author/loginOut",method = RequestMethod.GET)
    Result loginOut(HttpServletRequest request);

    /**
     * 清除session操作
     * @param request
     * @return
     */
    @RequestMapping(value = "/author/clearSystemSession",method = RequestMethod.GET)
    Result clearSystemSession( ServletRequest request);

    @RequestMapping(value = "/author/getSystemSession",method = RequestMethod.GET)
    Result getSystemSession(ServletRequest request);

    @RequestMapping(value = "/author/getVerificatCode/{phoneNum}", method = RequestMethod.GET)
    Result getVerificatCode(@PathVariable(value = "phoneNum") String phoneNum);

    @RequestMapping(value = "/author/isVerificatCorrect", method = RequestMethod.GET)
    Boolean isVerificatCorrect(@RequestParam(value = "verificationCode") String verificationCode, @RequestParam(value = "phoneNum") String phoneNum);

    @RequestMapping(value ="/author/selectAll",method = RequestMethod.GET)
    Result selectAll();
}
