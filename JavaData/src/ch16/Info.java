package ch16;
/**
 * 员工信息类
 * @author Administrator
 *
 */
public class Info {
	private String key;
	private String name;
	
	public Info(String key, String name) {
		this.key = key;
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
