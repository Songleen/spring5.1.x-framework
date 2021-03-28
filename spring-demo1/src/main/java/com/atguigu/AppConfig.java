package com.atguigu;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.bean.Cat;
import com.atguigu.fiveExtention.importBeanDefinitionRegistar.MyImportBeanDefinitionRegistar;
import com.atguigu.fiveExtention.importSelector.MyImportSelector;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2020/8/18 12:31
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.atguigu")
@MapperScan(value = "com.atguigu.dao") // 这个注解在解析配置类的时候，因为内部使用了Imort注解，所以是在解析Import注解时解析的MapperScannerRegistrar
//@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({MyImportBeanDefinitionRegistar.class})
public class AppConfig {
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;


	@Bean
	public DataSource dataSource() {
		//这里使用 druid 数据源
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(jdbcUrl);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
        /*factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath" +
                        ":mapper/*.xml"));*/
		SqlSessionFactory object = factoryBean.getObject();
		System.out.println(object);
		return object;
	}

	@Bean
	public PlatformTransactionManager platformTransactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}
}
