package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Entity.Game;

public class RowMapperSpringJdbcApplication implements RowMapper<Game> {

	@Override
	public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Game game =  new Game();
		game.setGamename(rs.getString(2));
		game.setGid(rs.getInt(1));
		
		return game;
		
	}

}
