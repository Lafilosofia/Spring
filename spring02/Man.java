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
		System.out.println("Man���޲ι��췽��!");
	}
	
	public void Work(){
		System.out.println(manName + "����" + tool.getToolName() + "ȥ����");
	}
}
