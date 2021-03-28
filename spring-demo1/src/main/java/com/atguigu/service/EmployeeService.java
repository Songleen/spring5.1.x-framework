package com.atguigu.service;

		import com.atguigu.bean.Employee;
		import com.atguigu.dao.EmployeeMapper;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.beans.factory.annotation.Value;
		import org.springframework.stereotype.Service;
		import org.springframework.transaction.annotation.Transactional;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/26 16:43
 */
@Service
public class EmployeeService {
	@Value("我的字点")
	private String name;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Transactional(rollbackFor = Exception.class)
	public Employee getById() {
		insert();
//		int a = 100 / 0;
		return employeeMapper.getById("1232");
	}

	public void insert(){
		employeeMapper.insert();
	}
}
