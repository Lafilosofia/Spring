package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������
 * @Controller���Ʋ��ע��
 * @author HP
 *
 */

@Controller
@RequestMapping("user")
public class HelloController2 {
	//@@RequestMapping(hello2.do) ��ע�������ӵ���ǰ����߷���ǰ��
	@RequestMapping("/hello2.do")
	public String hello(){
		System.out.println("hello");
		//����ֵ
		return "hello";
	}
}
