package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 先启动后台，再npm install,npm run dev打包启动前端vue项目
 * 前端vue项目配置8080端口：http://127.0.0.1:8080/#/home
 * 通过index.js的proxyTable代理访问后台服务http://127.0.0.1:8086/#/home
 * */
@SpringBootApplication
@EnableScheduling//开启定时任务支持
public class BlogserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogserverApplication.class, args);
    }
}
