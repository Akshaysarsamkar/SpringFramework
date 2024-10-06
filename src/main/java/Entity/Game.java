package Entity;

public class Game {

	private int gid;
	private String gamename;

	public Game(int gid, String gamename) {
		super();
		this.gid = gid;
		this.gamename = gamename;
	}

	public Game() {
		super();
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

}
