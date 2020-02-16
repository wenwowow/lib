package entity;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * ת������Ԫ��
 */
public class Json2JavaElement {

	/**
	 * �Ƿ�Ϊ��������
	 * 
	 * <p>
	 * ����Ǽ��ϵĻ�,��������������ΪcustomClassName��Ӧ���Զ�����,����type
	 */
	private boolean isArray;
	
	/**
	 * ��������
	 */
	private JsonElement arrayItemJe;
	
	/**
	 * �������,�����3��ΪArrayList<ArrayList<ArrayList<>>>
	 */
	private int arrayDeep;

	/**
	 * �Զ�������
	 * 
	 * <p>
	 * �ǿ�ʱ�������Զ�����,��ʱ��ʹ��type����(customClassName��typeֻ�ܶ�ѡһ,�����ϵ)
	 */
	private String customClassName;
	private JsonObject souceJo;
	private Json2JavaElement parentJb;

	private String name;
	private Class<?> type;
	
	/**
	 * ע��,nullʱ�����ע��
	 */
	private String des;

	public boolean isArray() {
		return isArray;
	}

	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}

	public JsonElement getArrayItemJe() {
		return arrayItemJe;
	}

	public void setArrayItemJe(JsonElement arrayItemJe) {
		this.arrayItemJe = arrayItemJe;
	}

	public int getArrayDeep() {
		return arrayDeep;
	}

	public void setArrayDeep(int arrayDeep) {
		this.arrayDeep = arrayDeep;
	}

	public String getCustomClassName() {
		return customClassName;
	}

	public void setCustomClassName(String customClassName) {
		this.customClassName = customClassName;
	}

	public JsonObject getSouceJo() {
		return souceJo;
	}

	public void setSouceJo(JsonObject souceJo) {
		this.souceJo = souceJo;
	}

	public Json2JavaElement getParentJb() {
		return parentJb;
	}

	public void setParentJb(Json2JavaElement parentJb) {
		this.parentJb = parentJb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}
	
	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "\n"
				+ "Json2JavaElement [isArray=" + isArray
				+ ", arrayDeep=" + arrayDeep + ", name=" + name + ", type="
				+ type + "]";
	}

}