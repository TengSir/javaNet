package edu.hbuas.javanet.t8;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	public static void main(String[] args) {
		//Java mail是一套扩展API，用来让java程序可以具备邮件读写能力
		//使用java mail API需要如下步骤
		
		//1.下载Javamail Jar 包，讲jar包导入项目，并添加到build path
		
		
		//2.设置邮件发送前的一些参数
		Properties  p=new Properties();
		p.put("mail.smtp.host", "smtp.163.com");
		p.put("mail.host.auth", "true");
		
		//3.创建session，建立和邮件服务器的链接
		Authenticator  auth=new Authenticator() {
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("xftengqian@163.com","xxxxx");
			}
		};
		
		Session session=Session.getDefaultInstance(p,auth);//基于当前的属性和身份来创建一个链接
		
		System.out.println(session);
		//4.封装一个邮件消息对象
		Message  message=new MimeMessage(session);
		
		try {
			message.setSubject("标题");
			message.setText("测试邮件内容啊");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		//5.封装邮件地址对象，指明邮件接收人和发送人
		try {
			Address  to=new InternetAddress("100000@qq.com");
			Address  from=new InternetAddress("xftengqian@163.com");
			
			message.setFrom(from);
			message.setRecipient(RecipientType.TO, to);//设置邮件接收人地址
			message.setRecipient(RecipientType.CC, to);//设置当前邮件抄送地址
		} catch (Exception e) {
			e.printStackTrace();
		}
		//6.使用Transport讲message对象发送出去
		try {
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		System.out.println("发送完毕");
		
		
		
	}

}
