package SpringJdbcapplication;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.GameDao;
import Entity.Game;

public class SpringJdbcApplicationTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJdbcApplication.xml");

		GameDao res = applicationContext.getBean("gamedao", GameDao.class);

		Scanner scanner = new Scanner(System.in);
		boolean go = true;

		while (go) {

			System.out.println();
			System.out.println("1] insert data");
			System.out.println("2] Get Single Row Data");
			System.out.println("3] Get Multiple Row Data");
			System.out.println("4] Update data");
			System.out.println("5] Delete data");
			System.out.println("6] Exit");

			System.out.println("Select Which operation u want to perform :- ");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1:
				Game game = new Game();

				System.out.println();
				System.out.println("Enter the Game ID");
				int gid = scanner.nextInt();

				System.out.println("Entet the Game Name");
				String gname = scanner.next();

				game.setGamename(gname);
				game.setGid(gid);
				int i = res.insert(game);
				System.out.println("data inserted succesfully");
				break;

			case 2:
				System.out.println("Enter the Game id to get all information releted to the game:=");
				int id = scanner.nextInt();

				Game game2 = res.getdata(id);

				System.out.println("Game ID := " + game2.getGid());
				System.out.println("Game Name :=" + game2.getGamename());
				break;

			case 3:
				List<Game> allData = res.getAllData();
				for (Game data : allData) {
					System.out.println();
					System.out.println("Game ID := " + data.getGid());
					System.out.println("Game Name := " + data.getGamename());
					System.out.println();
				}
				break;

			case 4:
				System.out.println("Enter the Updated Game Name:=");
				String gname1 = scanner.next();

				System.out.println("Enter the Game ID:=");
				int id1 = scanner.nextInt();

				res.updateinfo(id1, gname1);

				break;

			case 5:

				System.out.println("Enter the Game id : ");
				int id2 = scanner.nextInt();
				res.DeleteInfo(id2);

				break;

			default:
				go = false;
			}

			System.out.println(
					"======================================== Application Close ======================================================");

		}
		scanner.close();
//		
//		System.out.println("done" + i);
	}

}
