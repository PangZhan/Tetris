package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GameConfig {
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 窗口宽度
	 */
	private int width;
	/**
	 * 窗口高度
	 */
	private int height;
	/**
	 * 边框尺寸
	 */
	private int windowSize;
	/**
	 * 边框内边距
	 */
	private int padding;
	/**
	 * 图层属性
	 */
	
	private List<LayerConfig> layersConfig;
	
	public String getTitle() {
		return title;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getWindowSize() {
		return windowSize;
	}

	public int getPadding() {
		return padding;
	}

	public List<LayerConfig> getLayersConfig() {
		return layersConfig;
	}

	/**
	 * 
	 * 构造函数 读取xml文件，获得全部游戏配置
	 * 
	 * 
	 */
	public GameConfig() throws Exception {
		// 創建xml讀取器
		SAXReader reader = new SAXReader();
		// 读取xml文件，获得了文件
		Document doc = reader.read("config/cfg.xml");
		// game表示拿到了<game>标签里的所有东西，获得xml文件的根节点
		Element game = doc.getRootElement();
		// 配置窗口
		this.setUIConfig(game.element("frame"));
		// 配置系统参数
		this.setSystemConfig(game.element("system"));
		// 配置数据访问参数
		this.setDataConfig(game.element("data"));
	}

	/**
	 * 配置窗口
	 * 
	 * @param frame
	 * 配置文件的窗口配置元素
	 */
	public void setUIConfig(Element frame) {
		/**
		 * 获取窗口标题
		 */
		this.title = frame.attributeValue("title");
		/**
		 * 获取窗口宽度
		 */
		this.width = Integer.parseInt(frame.attributeValue("width"));
		/**
		 * 获取窗口高度
		 */
		this.height = Integer.parseInt(frame.attributeValue("height"));
		/**
		 * 获取内边距
		 */
		this.padding = Integer.parseInt(frame.attributeValue("padding"));
		/**
		 * 
		 */
		this.windowSize = Integer.parseInt(frame.attributeValue("windowSize"));
		List<Element> layers = frame.elements("layer");
		layersConfig = new ArrayList<LayerConfig>();
		for (Element layer : layers) {
			LayerConfig lc = new LayerConfig(layer.attributeValue("className"),
					Integer.parseInt(layer.attributeValue("x")),
					Integer.parseInt(layer.attributeValue("y")),
					Integer.parseInt(layer.attributeValue("w")),
					Integer.parseInt(layer.attributeValue("h")));
			layersConfig.add(lc);
		}
	}

	/**
	 * 配置系统参数
	 * 
	 * @param frame
	 */
	public void setSystemConfig(Element frame) {
		// TODO 配置系统参数
	}

	/**
	 * 配置数据访问参数
	 * 
	 * @param frame
	 */
	public void setDataConfig(Element data) {
		// TODO 配置数据访问参数
	}
}
