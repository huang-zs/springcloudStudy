package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static AtomicInteger a = new AtomicInteger(0);

	@RequestMapping("/test1")
	public String test1() {
		return "test" + a.addAndGet(1);
	}
	@RequestMapping("/test2")
	public String test2() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "test" + a.addAndGet(1);
	}
}
