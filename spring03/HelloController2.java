package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器
 * @Controller控制层的注解
 * @author HP
 *
 */

@Controller
@RequestMapping("user")
public class HelloController2 {
	//@@RequestMapping(hello2.do) 该注解可以添加到类前面或者方法前面
	@RequestMapping("/hello2.do")
	public String hello(){
		System.out.println("hello");
		//返回值
		return "hello";
	}
}
