package SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.BusDao;
import Entity.Bus;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ormconfig.xml");

		BusDao b = applicationContext.getBean("busdao", BusDao.class);

		Bus bus = new Bus(1, "Pune", "gevrai");

		int insertData = b.insertData(bus);
		System.out.println("done " + insertData);
	}

}
