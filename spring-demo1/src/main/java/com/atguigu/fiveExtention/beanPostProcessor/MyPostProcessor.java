package com.atguigu.fiveExtention.beanPostProcessor;

import com.atguigu.bean.Bird;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Describe 这个类会在对象被创建完成，属性也被赋值完成，然后执行
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 11:34
 */
//@Component
public class MyPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("bird")){
			Bird bird = (Bird) bean;
			bird.setColor("红色");
			System.out.println("初始化之前的方法……");
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("bird")){
			System.out.println("初始化之后的方法……");
		}
		return null;
	}
}
