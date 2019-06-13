package com.example.generaldealresponse.controller;

import com.example.generaldealresponse.entity.HelloWorld;
import com.example.generaldealresponse.exception.DemoOneException;
import com.example.generaldealresponse.exception.DemoTwoException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luyu
 * @ClassName DemoController
 * @description: TODO
 * @date 2019/6/11 11:17
 * @Version 1.0
 */

@RestController
@Api(value = "Swagger Test Control", description = "演示Swagger用法的Control类", tags = "Swagger Test Control Tag")
public class DemoController {

    @RequestMapping(value = "/say/{name}",method = RequestMethod.GET)
    @ApiOperation(value = "最基本的接口sayHi",notes = "say hi")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "name",value = "学生姓名",required = true,paramType="path",dataType = "String"),
                    @ApiImplicitParam(name="age",value = "学生年龄",required = true, paramType = "query",dataType = "Integer")
            }
    )
    public HelloWorld sayHi(@PathVariable String name, Integer age){
        return new HelloWorld(name,age);
    }

    @RequestMapping(value = "/throw/demoOneException",method = RequestMethod.GET)
    @ApiOperation(value = "抛出第一异常",notes = "throws demoOneException")
    public void throwOne(){ throw new DemoOneException(); }

    @RequestMapping(value = "/throw/demoTwoException",method = RequestMethod.GET)
    @ApiOperation(value = "抛出第二异常",notes = "throws demoTwoException")
    public void throwTwo(){
        throw new DemoTwoException();
    }

    @RequestMapping(value = "/throw/demoRuntimeException",method = RequestMethod.GET)
    @ApiOperation(value = "抛出基本异常",notes = "throws demoRuntimeException")
    public void throwThrowable() { throw new RuntimeException(); }
}
