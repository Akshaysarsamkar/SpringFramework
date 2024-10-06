package SpringJdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Dao.EmpDao;
import Entity.Emp;

public class Test {

	public static void main(String[] args) {

	//	ApplicationContext context = new ClassPathXmlApplicationContext("Springjdbc.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		EmpDao res = context.getBean("empdao", EmpDao.class);

		Emp emp = new Emp();
//
//		emp.setAddress("beed");
//		emp.setEmpid(3);
//		emp.setEmpname("pankaj");
//		emp.setSalary(85.54f);
//
//		int r = res.addEmp(emp);
//		System.out.println(r);

		Emp getemp = res.getemp(1);
		System.out.println(getemp);
		System.out.println("Emp name is: " + getemp.getEmpname());
		System.out.println("Emp address is: " + getemp.getAddress());
		System.out.println("EMp salary is " + getemp.getSalary());

	}

}
