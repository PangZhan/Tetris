package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

/**
 * ���ƴ���
 * 
 * @author Woods
 * 
 */
abstract public class Layer {
	
	protected static final int PADDING;
	private static final int SIZE;
	static{
		//�����Ϸ����
		GameConfig cfg = ConfigFactory.getGameConfig();
		PADDING = cfg.getPadding();
		SIZE = cfg.getWindowSize();
	}
	private static final Image WINDOW_IMG = new ImageIcon(
			"graphics/window/window.png").getImage();
	private static final int WINDOW_W = WINDOW_IMG.getWidth(null);
	private static final int WINDOW_H = WINDOW_IMG.getHeight(null);
	/**
	 * �������Ͻ�x����
	 */
	protected int x;
	/**
	 * �������Ͻ�y����
	 */
	protected int y;
	/**
	 * ���ڸ߶�
	 */
	protected int h;
	/**
	 * ���ڿ��
	 */
	protected int w;
	/**
	 * ��Ϸ����
	 */
	protected GameDto dto =null;

	protected Layer(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	 * ���ƴ���
	 */
	protected void createWindow(Graphics g) {
		// ����
		g.drawImage(WINDOW_IMG, x, y, x + SIZE, y + SIZE, 0, 0, SIZE, SIZE,
				null);
		// ����
		g.drawImage(WINDOW_IMG, x + SIZE, y, w + x - SIZE, y + SIZE, SIZE, 0,
				WINDOW_H - SIZE, SIZE, null);
		// ����
		g.drawImage(WINDOW_IMG, x + w - SIZE, y, x + w, y + SIZE, WINDOW_H
				- SIZE, 0, WINDOW_H, SIZE, null);
		// ����
		g.drawImage(WINDOW_IMG, x, y + SIZE, x + SIZE, h + y - SIZE, 0, SIZE,
				SIZE, WINDOW_H - SIZE, null);
		// ��
		g.drawImage(WINDOW_IMG, x + SIZE, y + SIZE, w + x - SIZE, y + h - SIZE,
				SIZE, SIZE, WINDOW_W - SIZE, WINDOW_H - SIZE, null);
		// ����
		g.drawImage(WINDOW_IMG, w + x - SIZE, y + SIZE, x + w, h + y - SIZE,
				WINDOW_W - SIZE, SIZE, WINDOW_W, WINDOW_H - SIZE, null);
		// ����
		g.drawImage(WINDOW_IMG, x, h + y - SIZE, x + SIZE, h + y, 0, WINDOW_H
				- SIZE, SIZE, WINDOW_H, null);
		// ����
		g.drawImage(WINDOW_IMG, x + SIZE, h + y - SIZE, x + w - SIZE, h + y,
				SIZE, WINDOW_H - SIZE, WINDOW_W - SIZE, WINDOW_H, null);
		// ����
		g.drawImage(WINDOW_IMG, w + x - SIZE, y + h - SIZE, x + w, h + y,
				WINDOW_H - SIZE, WINDOW_W - SIZE, WINDOW_H, WINDOW_W, null);
	}
	
	
	/**
	 * ˢ����Ϸ��������
	 * @author Woods
	 * @param g ����
	 */
	abstract public void paint(Graphics g);
	
	public void setDto(GameDto dto) {
		this.dto = dto;
	}

}
