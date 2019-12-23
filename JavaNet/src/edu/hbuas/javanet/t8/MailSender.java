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
		//Java mail��һ����չAPI��������java������Ծ߱��ʼ���д����
		//ʹ��java mail API��Ҫ���²���
		
		//1.����Javamail Jar ������jar��������Ŀ������ӵ�build path
		
		
		//2.�����ʼ�����ǰ��һЩ����
		Properties  p=new Properties();
		p.put("mail.smtp.host", "smtp.163.com");
		p.put("mail.host.auth", "true");
		
		//3.����session���������ʼ�������������
		Authenticator  auth=new Authenticator() {
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("xftengqian@163.com","xxxxx");
			}
		};
		
		Session session=Session.getDefaultInstance(p,auth);//���ڵ�ǰ�����Ժ����������һ������
		
		System.out.println(session);
		//4.��װһ���ʼ���Ϣ����
		Message  message=new MimeMessage(session);
		
		try {
			message.setSubject("����");
			message.setText("�����ʼ����ݰ�");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		//5.��װ�ʼ���ַ����ָ���ʼ������˺ͷ�����
		try {
			Address  to=new InternetAddress("100000@qq.com");
			Address  from=new InternetAddress("xftengqian@163.com");
			
			message.setFrom(from);
			message.setRecipient(RecipientType.TO, to);//�����ʼ������˵�ַ
			message.setRecipient(RecipientType.CC, to);//���õ�ǰ�ʼ����͵�ַ
		} catch (Exception e) {
			e.printStackTrace();
		}
		//6.ʹ��Transport��message�����ͳ�ȥ
		try {
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		System.out.println("�������");
		
		
		
	}

}
