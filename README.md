# springcloudStudy

Q1: hystrix dashboard报错,java 控制台 Unrecognized SSL message, plaintext connection? 或 浏览器 控制台  EventSource's response has a MIME type ("text/plain") that is not "text/ev
A1: 被监控的项目需做一下处理 
(1). implementation 'org.springframework.boot:pring-boot-starter-actuator' 添加依赖  
(2). 配置文件添加  
    management: 
      endpoints:  
        web:  
          exposure:  
            include: 
            - hystrix.stream  

Q2: 使用@RefreshScope动态修改配置参数，调用http://ip:port/actuator/refresh触发配置修改,报404
A2: 需要修改配置的项目需做一下处理
(1). implementation 'org.springframework.boot:pring-boot-starter-actuator' 添加依赖
(2). 配置文件添加
    management:
      endpoints:
        web:
          exposure:
            include:
            - refresh

Q3: 使用springcloud-bus,项目启动报错org.springframework.context.ApplicationContextException: Failed to start bean ‘outputBindingLifecycle’; 
A3: 需要默认输出源,配置文件加入
implementation 'org.springframeworkcloud:spring-cloud-starter-stream-rabbit'
Q3.1: 项目正常启动，但未见效果
A3.1: 未解

Q4: 使用网关分发请求，调用会触发熔断的接口，后端报错Error during filtering com.netflix.zuul.exception.ZuulException: ,前端报错504,理论上应该会直接返回降级接口
A4: 未解
