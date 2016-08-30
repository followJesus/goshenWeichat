/**
 * 
 */
package goshen.education.weichat;

/**
 * @author cunli
 * 2016年8月24日 下午6:11:04
 * 主菜单
 */
public class WeiMenu {
	private String type;
	private String name;
	private String key;
	private SubMenu[] sub_button;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/** 
	 * @return the sub_button
	 */
	public SubMenu[] getSub_button() {
		return sub_button;
	}

	/**
	 * @param sub_button the sub_button to set
	 */
	public void setSub_button(SubMenu[] sub_button) {
		this.sub_button = sub_button;
	}


}
