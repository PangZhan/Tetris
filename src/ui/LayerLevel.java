package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerLevel extends Layer {

	private static final Image IMG_LV = new ImageIcon(
			"Graphics/string/level.png").getImage();

	/**
	 * 数字图片 290 40
	 */
	private static final Image IMG_NUMBER = new ImageIcon(
			"Graphics/string/num.png").getImage();
	/**
	 * 数字切片的宽度
	 */
	private static final int IMG_NUMBER_W = IMG_NUMBER.getWidth(null) / 10;
	/**
	 * 数字切片的高度
	 */
	private static final int IMG_NUMBER_H = IMG_NUMBER.getHeight(null);

	public LayerLevel(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		this.createWindow(g);
		// 窗口标题
		g.drawImage(IMG_LV, this.x + PADDING, this.y + PADDING, null);
		// 显示等级
		this.drawNumberLeftPad(32, 32, 8964, g);
	}

	/**
	 * 
	 * @param x
	 *            左上角x坐标
	 * @param y
	 *            左上角y坐标
	 * @param num
	 *            要现实的对象
	 * @param g
	 *            画笔对象
	 */
	private void drawNumberLeftPad(int x, int y, int num, Graphics g) {
		// 把数字number的每一位取出
		String strNum = Integer.toString(num);
		for (int i = 0; i < strNum.length(); i++) {
			int bit = strNum.charAt(i) - '0';
			g.drawImage(IMG_NUMBER, this.x + x + IMG_NUMBER_W * i, this.y + y,
					this.x + x + IMG_NUMBER_W * (i + 1), this.y + y
							+ IMG_NUMBER_H, bit * IMG_NUMBER_W, 0, (bit + 1)
							* IMG_NUMBER_W, IMG_NUMBER_H, null);
		}
	}
}
