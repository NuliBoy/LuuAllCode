package com.hengyu.rabbitmq.common.enums;

import lombok.Getter;

/**
 * 队列配置枚举
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:05
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Getter
public enum QueueEnum
{
    /**
     * 用户注册
     * 创建账户消息队列
     */
    USER_REGISTER_CREATE_ACCOUNT("register.account","register.#"),
    /**
     * 用户注册
     * 发送注册成功邮件消息队列
     */
    USER_REGISTER_SEND_MAIL("register.mail","register.#")
    ;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 队列路由键
     */
    private String routingKey;

    QueueEnum(String name, String routingKey) {
        this.name = name;
        this.routingKey = routingKey;
    }
}
