package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerNext extends Layer {

	private static final Image[] NEXT_ACT;
	static {
		NEXT_ACT = new Image[7];
		for (int i = 0; i < NEXT_ACT.length; i++) {
			NEXT_ACT[i] = new ImageIcon("Graphics/game/" + i + ".png")
					.getImage();
		}
	}

	public LayerNext(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		this.createWindow(g);
		this.drawImageAtCenter(NEXT_ACT[this.dto.getNext()], g);
	}

	/**
	 * ÕýÖÐ»æÍ¼
	 */
	private void drawImageAtCenter(Image img, Graphics g) {
		int imgW = img.getWidth(null);
		int imgH = img.getHeight(null);
		int imgX = this.x + (this.w - imgW >> 1);
		int imgY = this.y + (this.h - imgH >> 1);
		g.drawImage(img, imgX, imgY, null);
	}
}
