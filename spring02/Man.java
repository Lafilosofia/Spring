package com.lhz.spring02;
/**
 * 
 * @author HP
 *
 */
public class Man {
	private String manName;
	private Tool tool;
	
	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public Man(){
		System.out.println("Man的无参构造方法!");
	}
	
	public void Work(){
		System.out.println(manName + "拿着" + tool.getToolName() + "去砍树");
	}
}
