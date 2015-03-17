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
	 * ���캯��
	 */
	public GameDto() {
		dtoInti();
	}

	/**
	 * dto��ʼ��
	 */
	public void dtoInti() {
		// TODO
		this.gameMap = new boolean[10][18];
	}

	/**
	 * ���ݿ��¼
	 */
	private List<Player> dbRecode;
	/**
	 * ���ؼ�¼
	 */
	private List<Player> diskRecode;
	/**
	 * ��Ϸ��ͼ
	 */
	private boolean[][] gameMap;
	/**
	 * ���䷽��
	 */
	private GameAct gameAct;
	/**
	 * ��һ������
	 */
	private int next;
	/**
	 * ��ǰ�ȼ�
	 */
	private int nowlevel;
	/**
	 * ��ǰ����
	 */
	private int nowPoint;
	/**
	 * ����
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
