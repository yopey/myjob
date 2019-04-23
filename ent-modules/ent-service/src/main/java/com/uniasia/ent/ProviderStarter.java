package com.uniasia.ent;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 生产者服务启动类
 *
 */
public class ProviderStarter {
	public static Logger log = Logger.getLogger(ProviderStarter.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
        context.start();
        log.info("服务提供者已启动...");
        try {
            System.in.read();   // 进入等待状态保证程序不关闭，按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        } 
	}
}
