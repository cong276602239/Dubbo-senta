package org.demo.api.main;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboMain {

	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure(DubboMain.class.getClassLoader().getResource("log4j.properties"));
		context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo.xml" });
		context.start();
		System.in.read(); // 按任意键退出
	}

}
