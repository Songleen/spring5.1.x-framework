package com.atguigu.fiveExtention.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 16:25
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.atguigu.bean.Cat"};
	}
}
