package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-provider")
public interface ProviderInterface {

	@RequestMapping("/test1")
	public String test1();
	@RequestMapping("/test2")
	public String test2();
}
