package control;

import service.GameService;
import ui.JPanelGame;

/**
 * ������Ҽ����¼� ���ƻ��� �����߼�
 * 
 * @author Woods
 * 
 */
public class GameControl {
	/*
	 * ��Ϸ�����
	 */
	private JPanelGame panelGame;
	/**
	 * 
	 * ��Ϸ�߼���
	 */
	private GameService gameService;

	public GameControl(JPanelGame panelGame, GameService gameService) {
		this.panelGame = panelGame;
		this.gameService = gameService;
	}

	public void test() {

		this.panelGame.repaint();
	}

	/**
	 * ��������������ϣ�
	 */
	public void keyUp() {
		this.gameService.keyUp();
		this.panelGame.repaint();
	}

	/**
	 * ��������������£�
	 */
	public void keyDown() {
		this.gameService.keyDown();
		this.panelGame.repaint();

	}

	/**
	 * ���������������
	 */
	public void keyLeft() {
		this.gameService.keyLeft();
		this.panelGame.repaint();
	}

	/**
	 * ��������������ң�
	 */
	public void keyRight() {
		this.gameService.keyRight();
		this.panelGame.repaint();

	}
}
