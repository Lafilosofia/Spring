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
		this.manName = "��ͷǿ";
	}
	
	public void Work(){
		System.out.println(manName + "����" + tool.getToolName() + "ȥ����");
	}
}
