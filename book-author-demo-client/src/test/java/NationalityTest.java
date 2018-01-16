import cn.edu.hfut.xc.bookauthordemo.client.BookAuthorDemoClientApplication;
import cn.edu.hfut.xc.bookauthordemo.client.feign.NationalityService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by sunwei on 2018/1/9 Time:16:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BookAuthorDemoClientApplication.class)
public class NationalityTest {

    private static Logger logger = LoggerFactory.getLogger(NationalityTest.class);
    @Autowired
    private NationalityService nationalityService;

    @Test
    public void insert(){
        Nationality nationality = new Nationality();
        nationality.setNationalityName("美国");
        nationality.setNationalityLocation("北美洲中部");
        nationality.setNationalityLife("200");
        Date date = new Date();
        nationality.setNationalityCreatedTime(String.valueOf(date));
        Result result = nationalityService.insert(nationality);
        logger.info("插入结果为："+result);
    }

}
