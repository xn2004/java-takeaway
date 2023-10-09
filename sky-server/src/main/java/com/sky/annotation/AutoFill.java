package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */

//指定位置：只能将注解加在方法上面
@Target(ElementType.METHOD)
//固定格式
@Retention(RetentionPolicy.RUNTIME)

public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();

}
