package com.dada.redisson.annotation;

import java.lang.annotation.*;

/**
 * @Description: 基于注解的分布式式锁
 * @Documented 注解表明这个注解应该被 javadoc 工具记录. 默认情况下,javadoc 工具不在注解的元素上添加注解.
 * @Inherited 元注解是一个标记注解,它表明使用这个注解的类的所有子类都自动继承该注解.
 * @Retention(RetentionPolicy.RUNTIME) 注解的保留策略
 * @Retention(RetentionPolicy.RUNTIME) 意味着注解的生命周期与类的生命周期一致,这意味着当 Java 虚拟机运行程序时,仍然可以获取到注解的信息.
 * @Target(ElementType.METHOD) 注解的作用目标
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DistributedLock {

    /**
     * 锁的名称
     */
    String value() default "redisson";

    /**
     * 锁的有效时间
     */
    int leaseTime() default 10;
}


