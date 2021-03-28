import com.atguigu.AppConfig;
import com.atguigu.bean.Bird;
import com.atguigu.bean.Cat;
import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Describe
 * @ClassName
 * @Author 李松林
 * @Date 2021/3/27 9:58
 */
public class BeanTest {
	public static void main(String[] args) {
		// 在整个配置类的初始化中，AnnotationConfigApplicationContext这个类非常重要
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService e = (EmployeeService) ac.getBean("employeeService");
		System.out.println(e.getById());
	}
}
