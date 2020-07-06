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
Q2: 需要修改配置的项目需做一下处理
(1). implementation 'org.springframework.boot:pring-boot-starter-actuator' 添加依赖
(2). 配置文件添加
    management:
      endpoints:
        web:
          exposure:
            include:
            - refresh
