package com.atguigu.fiveExtention.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 12:23
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition bird = beanFactory.getBeanDefinition("bird");
		bird.setBeanClassName("com.atguigu.bean.Cat");
		System.out.println("我自己的MyBeanFactoryPostProcessor执行了");
	}
}
