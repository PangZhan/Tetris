package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

/**
 * 绘制窗口
 * 
 * @author Woods
 * 
 */
abstract public class Layer {
	
	protected static final int PADDING;
	private static final int SIZE;
	static{
		//获得游戏配置
		GameConfig cfg = ConfigFactory.getGameConfig();
		PADDING = cfg.getPadding();
		SIZE = cfg.getWindowSize();
	}
	private static final Image WINDOW_IMG = new ImageIcon(
			"graphics/window/window.png").getImage();
	private static final int WINDOW_W = WINDOW_IMG.getWidth(null);
	private static final int WINDOW_H = WINDOW_IMG.getHeight(null);
	/**
	 * 窗口左上角x坐标
	 */
	protected int x;
	/**
	 * 窗口左上角y坐标
	 */
	protected int y;
	/**
	 * 窗口高度
	 */
	protected int h;
	/**
	 * 窗口宽度
	 */
	protected int w;
	/**
	 * 游戏数据
	 */
	protected GameDto dto =null;

	protected Layer(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	 * 绘制窗口
	 */
	protected void createWindow(Graphics g) {
		// 左上
		g.drawImage(WINDOW_IMG, x, y, x + SIZE, y + SIZE, 0, 0, SIZE, SIZE,
				null);
		// 中上
		g.drawImage(WINDOW_IMG, x + SIZE, y, w + x - SIZE, y + SIZE, SIZE, 0,
				WINDOW_H - SIZE, SIZE, null);
		// 右上
		g.drawImage(WINDOW_IMG, x + w - SIZE, y, x + w, y + SIZE, WINDOW_H
				- SIZE, 0, WINDOW_H, SIZE, null);
		// 中左
		g.drawImage(WINDOW_IMG, x, y + SIZE, x + SIZE, h + y - SIZE, 0, SIZE,
				SIZE, WINDOW_H - SIZE, null);
		// 中
		g.drawImage(WINDOW_IMG, x + SIZE, y + SIZE, w + x - SIZE, y + h - SIZE,
				SIZE, SIZE, WINDOW_W - SIZE, WINDOW_H - SIZE, null);
		// 中右
		g.drawImage(WINDOW_IMG, w + x - SIZE, y + SIZE, x + w, h + y - SIZE,
				WINDOW_W - SIZE, SIZE, WINDOW_W, WINDOW_H - SIZE, null);
		// 下左
		g.drawImage(WINDOW_IMG, x, h + y - SIZE, x + SIZE, h + y, 0, WINDOW_H
				- SIZE, SIZE, WINDOW_H, null);
		// 下中
		g.drawImage(WINDOW_IMG, x + SIZE, h + y - SIZE, x + w - SIZE, h + y,
				SIZE, WINDOW_H - SIZE, WINDOW_W - SIZE, WINDOW_H, null);
		// 下右
		g.drawImage(WINDOW_IMG, w + x - SIZE, y + h - SIZE, x + w, h + y,
				WINDOW_H - SIZE, WINDOW_W - SIZE, WINDOW_H, WINDOW_W, null);
	}
	
	
	/**
	 * 刷新游戏具体内容
	 * @author Woods
	 * @param g 画笔
	 */
	abstract public void paint(Graphics g);
	
	public void setDto(GameDto dto) {
		this.dto = dto;
	}

}
