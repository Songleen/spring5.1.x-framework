package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 9:49
 */
@Component
public class Bird {
	@Value("白色")
	private String color;
	@Value("67")
	private String age;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Bird{" +
				"color='" + color + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
