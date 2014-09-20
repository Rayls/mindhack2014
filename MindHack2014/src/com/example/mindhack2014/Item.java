package com.example.mindhack2014;

public class Item {
	private String name;
	private String type;
	private Integer value;
	
	/*public Item(String itemName, String itemType, int val)
	{
		this.name = itemName;
		this.type = itemType;
		this.value = val;
	}
*/	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
}
