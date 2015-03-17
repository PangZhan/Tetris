package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GameConfig {
	/**
	 * ����
	 */
	private String title;
	/**
	 * ���ڿ��
	 */
	private int width;
	/**
	 * ���ڸ߶�
	 */
	private int height;
	/**
	 * �߿�ߴ�
	 */
	private int windowSize;
	/**
	 * �߿��ڱ߾�
	 */
	private int padding;
	/**
	 * ͼ������
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
	 * ���캯�� ��ȡxml�ļ������ȫ����Ϸ����
	 * 
	 * 
	 */
	public GameConfig() throws Exception {
		// ����xml�xȡ��
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ���������ļ�
		Document doc = reader.read("config/cfg.xml");
		// game��ʾ�õ���<game>��ǩ������ж��������xml�ļ��ĸ��ڵ�
		Element game = doc.getRootElement();
		// ���ô���
		this.setUIConfig(game.element("frame"));
		// ����ϵͳ����
		this.setSystemConfig(game.element("system"));
		// �������ݷ��ʲ���
		this.setDataConfig(game.element("data"));
	}

	/**
	 * ���ô���
	 * 
	 * @param frame
	 * �����ļ��Ĵ�������Ԫ��
	 */
	public void setUIConfig(Element frame) {
		/**
		 * ��ȡ���ڱ���
		 */
		this.title = frame.attributeValue("title");
		/**
		 * ��ȡ���ڿ��
		 */
		this.width = Integer.parseInt(frame.attributeValue("width"));
		/**
		 * ��ȡ���ڸ߶�
		 */
		this.height = Integer.parseInt(frame.attributeValue("height"));
		/**
		 * ��ȡ�ڱ߾�
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
	 * ����ϵͳ����
	 * 
	 * @param frame
	 */
	public void setSystemConfig(Element frame) {
		// TODO ����ϵͳ����
	}

	/**
	 * �������ݷ��ʲ���
	 * 
	 * @param frame
	 */
	public void setDataConfig(Element data) {
		// TODO �������ݷ��ʲ���
	}
}
