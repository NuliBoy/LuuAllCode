package com.quertz.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author skyBoy
 * @ClassName HelloJob
 * @description: TODO
 * @date 2019/3/27 10:41
 */
public class HelloJob implements Job {
    public HelloJob() {
        System.out.println("HelloJob创建成功！");
    }

    //业务逻辑
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date date  = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Exec Time is"+sf.format(date));
        //编写业务逻辑
        System.out.println("Hello World");
    }
}
