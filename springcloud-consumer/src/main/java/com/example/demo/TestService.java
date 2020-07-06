package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {
	@Autowired
	private ProviderInterface providerInterface;

	private static AtomicInteger a = new AtomicInteger(0);

	@HystrixCommand(fallbackMethod = "fallback")
	public String test1() {
		return providerInterface.test1();
	}
	@HystrixCommand(fallbackMethod = "fallback")
	public String test2() {
		return providerInterface.test2();
	}

	public String fallback() {
		return "fallback" + a.addAndGet(1);
	}
}
