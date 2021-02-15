import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJDBCTester {

	public static void main(String[] args) {
		
		String container="fw/datasource.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(container);
		DriverManagerDataSource dataSource=context.getBean(DriverManagerDataSource.class);
		System.out.println(dataSource);

	}

}
