package kr.co.ch10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SubController {

	@GetMapping("/sub/hello")
	public String hello() {
		log.trace("hello trace 로그 ...");
		log.debug("hello debug 로그 ...");
		log.info("hello info 로그 ...");
		log.warn("hello warn 로그 ...");
		log.error("hello error 로그 ...");
		return "/sub/hello";
	}
	@GetMapping("/sub/welcome")
	public String welcome() {
		log.trace("hello trace 로그 ...");
		log.debug("hello debug 로그 ...");
		log.info("hello info 로그 ...");
		log.warn("hello warn 로그 ...");
		log.error("hello error 로그 ...");
		return "/sub/welcome";
	}
	@GetMapping("/sub/greeting")
	public String greeting() {
		log.trace("hello trace 로그 ...");
		log.debug("hello debug 로그 ...");
		log.info("hello info 로그 ...");
		log.warn("hello warn 로그 ...");
		log.error("hello error 로그 ...");
		return "/sub/greeting";
	}
}
