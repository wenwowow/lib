package Weather;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

public class xmlAndjson {
	/**
     * JSON(����)�ַ���ת����XML�ַ���
     * ���������� xom-1.1.jar��
     * @param jsonString
     * @return
     */
    public static String json2xml(String jsonString) {
        XMLSerializer xmlSerializer = new XMLSerializer();
        return xmlSerializer.write(JSONSerializer.toJSON(jsonString));
      
    }
    /**
     * xml ת json
     * ���������� xom-1.1.jar��
     * @param xmlString xml�ַ���
     * @return
     */
    public static String xml2json(String xmlString) {
        XMLSerializer xmlSerializer = new XMLSerializer();
        JSON json = xmlSerializer.read(xmlString);
        return json.toString(1);
    }
}
