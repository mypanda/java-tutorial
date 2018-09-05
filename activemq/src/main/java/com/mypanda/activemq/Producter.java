package com.mypanda.activemq;

import java.util.concurrent.atomic.AtomicInteger;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Producter {

	// ActiveMq 的默认用户名
	private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
	// ActiveMq 的默认登录密码
	private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
	// ActiveMq 的链接地址 tcp://192.168.1.139:61616
	// private static final String BROKEN_URL = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static final String BROKEN_URL = "tcp://192.168.3.30:61616";
	
	AtomicInteger count = new AtomicInteger(0);
	// 链接工厂
	ConnectionFactory connectionFactory;
	// 链接对象
	Connection connection;
	// 事务管理
	Session session;
	ThreadLocal<MessageProducer> threadLocal = new ThreadLocal<>();
	
	public void init() {
		try {
			// 创建一个链接工厂
			connectionFactory = new ActiveMQConnectionFactory(USERNAME,PASSWORD,BROKEN_URL);
			// 从工程创建一个链接
			connection = connectionFactory.createConnection();
			// 开启链接
			connection.start();
			// 创建一个事务（这里通过参数可以设置事务的级别）
			session = connection.createSession(true, Session.SESSION_TRANSACTED);
			
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String disname) {
		try {
			// 创建一个消息队列
			Queue queue = session.createQueue(disname);
			// 消息生产者
			MessageProducer messageProducer = null;
			if(threadLocal.get() != null) {
				messageProducer = threadLocal.get();
			}else {
				messageProducer = session.createProducer(queue);
				threadLocal.set(messageProducer);
			}
			while(true) {
				Thread.sleep(1000);
				int num = count.getAndDecrement();
				// 创建一条信息
				TextMessage msg = session.createTextMessage(Thread.currentThread().getName() +
						"Productor:我是大帅哥，我正在生产东西！,count: " + num);
				System.out.println(Thread.currentThread().getName() +
						"Productor:我是大帅哥，我正在生产东西！,count: " + num);
				// 发送消息
				messageProducer.send(msg);
				// 提交事物
				session.commit();
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
