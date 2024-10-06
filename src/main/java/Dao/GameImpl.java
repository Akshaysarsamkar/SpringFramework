package Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Entity.Game;

public class GameImpl implements GameDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Game game) {

		String q = "insert into Game(gid,gname) value (?,?)";

		int update = jdbcTemplate.update(q, game.getGid(), game.getGamename());

		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Game getdata(int id) {
		String q1 = "select * from game where gid = ?";
		RowMapper<Game> mapper = new RowMapperSpringJdbcApplication();
		Game res = this.jdbcTemplate.queryForObject(q1, mapper, id);
		return res;
	}

	@Override
	public List<Game> getAllData() {
		String query = "select * from game";
		RowMapper<Game> mp = new RowMapperSpringJdbcApplication();
		List<Game> game = this.jdbcTemplate.query(query, mp);
		return game;
	}

	@Override
	public void updateinfo(int id, String game) {

		String sql = "update game set gname = ? where gid = ?";

		int update = this.jdbcTemplate.update(sql, game, id);

		System.out.println("Update successfully :=" + update);
	}

	@Override
	public void DeleteInfo(int id) {
		String q = "delete from game where gid = ?";
		int i = this.jdbcTemplate.update(q, id);
		
		System.out.println("Data Deleted succesfully........");
		
	}

}
