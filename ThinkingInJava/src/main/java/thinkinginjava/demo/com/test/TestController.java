package thinkinginjava.demo.com.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import thinkinginjava.demo.com.test.chapter12.AppException;

/**
 * @author Administrator
 * @title: luyu
 * @ClassName ThinkingInJava
 * @description: TODO
 * @date 2019/4/28 22:11
 */
@RestController
public class TestController {

    @RequestMapping("/test/one")
    public void  test(@RequestParam String flag){

    if("success".equals(flag)){
        //
    }else if ("fail".equals(flag)) {
        throw new AppException();
    }
    }
}
