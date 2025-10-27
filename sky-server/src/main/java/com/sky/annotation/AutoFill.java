package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解，用于标识需要自动填充的字段
@Target(ElementType.METHOD)
//指定该注解可以应用的目标元素类型（当前为方法）,包括方法、字段、参数等
@Retention(RetentionPolicy.RUNTIME)
//指定注解的生命周期，表示注解在运行时生效（常用于自动填充字段）
public @interface AutoFill {

    OperationType value();
    //是该注解的成员变量，类型为OperationType枚举类，
    // 使用AutoFill注解时，传入value属性的值（OperationType类型）
    //用于标识当前操作是插入INSERT还是UPDATE
}
