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
		//获得游戏配置
		GameConfig cfg = ConfigFactory.getGameConfig();
		//设置标题
		this.setTitle(cfg.getTitle());
		//设置默认关闭操作
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//TODO 设置窗口大小
		this.setSize(cfg.getWidth(),cfg.getHeight());
		//设置用户不可以改变窗口大小
		this.setResizable(false);
		//不同显示器上都要求窗口居中
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int x = screen.width - this.getWidth()>>1;
		int y = screen.height - this.getHeight()>>1;
		this.setLocation(x,y);
		//设置默认Panle
		this.setContentPane(panelGame);
		//默认该窗口为显示
		this.setVisible(true);
	}
}
