package com.lhz.spring;
/**
 * 
 * @author HP
 *
 */
public class Man {
	private String manName;
	private Tool tool;
	
	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public Man(){
		this.manName = "光头强";
	}
	
	public void Work(){
		System.out.println(manName + "拿着" + tool.getToolName() + "去砍树");
	}
}
