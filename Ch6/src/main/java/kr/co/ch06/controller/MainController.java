package kr.co.ch06.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch06.vo.UserVO;

@Controller
public class MainController {
	
	@GetMapping(value= {"/", "/index"})
	public String index(Model model) {
	
		String tit = "Spring Boot";
		String name = "Thymeleaf";
		
		UserVO user1= new UserVO();
		user1.setUid("hong");
		user1.setHp("010-1234-1234");
		user1.setName("홍길동");
		user1.setAge(25);
		
		UserVO user2 = null;
		
		List<UserVO> users = new ArrayList<>();
		users.add(new UserVO("a101","일번","010-1",21));
		users.add(new UserVO("a102","이번","010-2",22));
		users.add(new UserVO("a103","삼번","010-3",31));
		users.add(new UserVO("a104","사번","010-4",41));
		users.add(new UserVO("a105","오번","010-5",51));
		
		model.addAttribute("user1", user1);
		model.addAttribute("user2", user2);
		model.addAttribute("users", users);
		model.addAttribute("tit", tit);
		model.addAttribute("name", name);
		
		return "/index";
	}
	
	@GetMapping("/include")
	public String include() {
		return "/include";
	}
	@GetMapping("/layout")
	public String layout() {
		return "/layout";
	}
}
