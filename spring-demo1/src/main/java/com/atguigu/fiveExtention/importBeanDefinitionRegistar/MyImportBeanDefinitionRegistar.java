package com.atguigu.fiveExtention.importBeanDefinitionRegistar;

import com.atguigu.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 17:08
 */
public class MyImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(Cat.class);
		registry.registerBeanDefinition("hot",bd);
	}
}
