package dto;

import java.util.List;

import entity.GameAct;

/**
 * 
 * @author Woods
 * 
 */
public class GameDto {
	/**
	 * 构造函数
	 */
	public GameDto() {
		dtoInti();
	}

	/**
	 * dto初始化
	 */
	public void dtoInti() {
		// TODO
		this.gameMap = new boolean[10][18];
	}

	/**
	 * 数据库记录
	 */
	private List<Player> dbRecode;
	/**
	 * 本地记录
	 */
	private List<Player> diskRecode;
	/**
	 * 游戏地图
	 */
	private boolean[][] gameMap;
	/**
	 * 下落方块
	 */
	private GameAct gameAct;
	/**
	 * 下一个方块
	 */
	private int next;
	/**
	 * 当前等级
	 */
	private int nowlevel;
	/**
	 * 当前分数
	 */
	private int nowPoint;
	/**
	 * 消行
	 */
	private int RemoveLine;

	public List<Player> getDbRecode() {
		return dbRecode;
	}

	public void setDbRecode(List<Player> dbRecode) {
		this.dbRecode = dbRecode;
	}

	public List<Player> getDiskRecode() {
		return diskRecode;
	}

	public void setDiskRecode(List<Player> diskRecode) {
		this.diskRecode = diskRecode;
	}

	public boolean[][] getGameMap() {
		return gameMap;
	}

	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}

	public GameAct getGameAct() {
		return gameAct;
	}

	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getNowlevel() {
		return nowlevel;
	}

	public void setNowlevel(int nowlevel) {
		this.nowlevel = nowlevel;
	}

	public int getNowPoint() {
		return nowPoint;
	}

	public void setNowPoint(int nowPoint) {
		this.nowPoint = nowPoint;
	}

	public int getRemoveLine() {
		return RemoveLine;
	}

	public void setRemoveLine(int removeLine) {
		RemoveLine = removeLine;
	}

}
