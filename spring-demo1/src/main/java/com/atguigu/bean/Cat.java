package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 14:36
 */
public class Cat {
	@Value("猫")
	private String name;
	@Value("hiese")
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
