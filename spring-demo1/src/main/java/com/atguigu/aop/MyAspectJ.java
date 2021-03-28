package com.atguigu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Describe 自定义切面
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/28 13:54
 */
//@Aspect
//@Component
public class MyAspectJ {

	@Before("execution(* com.atguigu.service.*.*(..))")
	public void beforeCut(){
		System.out.println("这是前置通知！");
	}
}
