package com.itheima.health.exception;

/**
 * Description: 自定义异常
 * 友好提示
 * 区分系统与自定义的异常
 * 终止已经不符合业务逻辑的代码
 * User: Eric
 */
public class MyException extends RuntimeException {
    public MyException(String message){
        super(message);
    }
}
