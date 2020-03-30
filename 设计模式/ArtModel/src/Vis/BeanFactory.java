package Vis;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ��ȡjavabean�Ĺ���
 * @author Administrator
 *
 */
public class BeanFactory {

	public static Object getBean(String id){
		try {
			//1.��ȡdocument����
			Document doc=new SAXReader().read(BeanFactory.class.getClassLoader().getResourceAsStream("bean.xml"));
			
			//2.����api selectSingleNode(���ʽ)
			Element beanEle=(Element) doc.selectSingleNode("//bean[@id='"+id+"']");
			
			//3.��ȡԪ�ص�class����
			String classValue = beanEle.attributeValue("class");
			
			//4.ͨ�����䷵��ʵ����Ķ���
			Object newInstance = Class.forName(classValue).newInstance();
			return newInstance;
		}  catch (Exception e) {
			e.printStackTrace();
			System.out.println("��ȡbeanʧ��");
		}
		return null;
	}
}

