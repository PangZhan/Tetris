package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerBackground extends Layer {
	//TODO ¡Ÿ ±±≥æ∞
	private static final Image IMG_BG_TEMP = new ImageIcon("Graphics/background/bg02.jpg")
	.getImage();

	public LayerBackground(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(IMG_BG_TEMP,0,0,1168,680,null);
	}

}
