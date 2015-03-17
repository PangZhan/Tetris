package ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import config.GameConfig;
import config.ConfigFactory;

public class JFrameGame extends JFrame{
	
	public JFrameGame(JPanelGame panelGame){
		//�����Ϸ����
		GameConfig cfg = ConfigFactory.getGameConfig();
		//���ñ���
		this.setTitle(cfg.getTitle());
		//����Ĭ�Ϲرղ���
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//TODO ���ô��ڴ�С
		this.setSize(cfg.getWidth(),cfg.getHeight());
		//�����û������Ըı䴰�ڴ�С
		this.setResizable(false);
		//��ͬ��ʾ���϶�Ҫ�󴰿ھ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int x = screen.width - this.getWidth()>>1;
		int y = screen.height - this.getHeight()>>1;
		this.setLocation(x,y);
		//����Ĭ��Panle
		this.setContentPane(panelGame);
		//Ĭ�ϸô���Ϊ��ʾ
		this.setVisible(true);
	}
}
