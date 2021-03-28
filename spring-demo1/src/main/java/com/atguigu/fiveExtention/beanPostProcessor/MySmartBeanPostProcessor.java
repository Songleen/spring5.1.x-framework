package com.atguigu.fiveExtention.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/28 21:39
 */
//@Component
public class MySmartBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("bird")){
			System.out.println("执行到了这里1");
		}
		return null;
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("bird")){
			System.out.println("执行到了这里2");
		}
		return null;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("bird")){
			System.out.println("执行到了这里3");
		}
		return null;
	}
}
