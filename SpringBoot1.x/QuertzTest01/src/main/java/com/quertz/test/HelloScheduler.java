package com.quertz.test;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author skyBoy
 * @ClassName HelloScheduler
 * @description: TODO
 * @date 2019/3/27 11:32
 */
public class HelloScheduler {
    public static void main(String[] args) throws SchedulerException ,InterruptedException{
        //创建jobDetail实例，将它与HelloJob绑定，用来定义Job的一些属性
        JobDetail helloJobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("myJob1","group1").usingJobData("name","Hello").build();

        JobDetail hiJobDetail = JobBuilder.newJob(HiJob.class)
                .withIdentity("myJob2","group2").build();


        Date startDate = new Date();
        startDate.setTime(startDate.getTime() + 5000);

        Date endDate = new Date();
        endDate.setTime(startDate.getTime() + 5000);

        //定义触发器，用来触发任务的执行,定义job的执行时间，执行次数
//        Trigger trigger = TriggerBuilder
//                .newTrigger()
//                .withIdentity("myTrigger","group1")
//                .startNow()
//                .startAt(startDate)
//                .endAt(endDate)
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
//                .withIntervalInSeconds(1).withRepeatCount(3))
//                .build();

         SimpleTrigger simpleTrigger = TriggerBuilder
                .newTrigger()
                .withIdentity("myTrigger","group1")
                .startNow()
                .startAt(startDate)
                .endAt(endDate)
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1).withRepeatCount(3))
                .build();

        CronTrigger cronTrigger = TriggerBuilder.newTrigger()
                .withIdentity("myCroTrigger","group2")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 48 16 ? * * 2019"))
                .build();




        //定义调度器，指定Trigger去执行指定的Job
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();


        //任务执行
        scheduler.scheduleJob(hiJobDetail,cronTrigger);
        scheduler.scheduleJob(helloJobDetail,simpleTrigger);
        System.out.println("schedular start----");
        scheduler.start();






//        TimeUnit.MINUTES.sleep(1);
//        Thread.sleep(1000*60);
//        scheduler.shutdown();
//
//        System.out.println("schedular shutDown-----");


    }
}
