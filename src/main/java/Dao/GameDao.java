package Dao;

import java.util.List;

import Entity.Game;

public interface GameDao {

	public int insert(Game game);

	public Game getdata(int id);

	public List<Game> getAllData();

	public void updateinfo(int id , String game);
	
	public void DeleteInfo(int id);

}
