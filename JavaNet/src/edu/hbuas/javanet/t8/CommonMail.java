package edu.hbuas.javanet.t8;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class CommonMail {
	public static void main(String[] args) throws Exception {
		//����apche ���ʼ�������ʵ�ֵ��ʼ����Ͱ�������
		Email email = new SimpleEmail();
		email.setHostName("smtp.163.com");
//		email.setSmtpPort(25);
		email.setAuthenticator(new DefaultAuthenticator("xftengqian@163.com", "password"));
//		email.setSSLOnConnect(true);
		email.setFrom("xftengqian@163.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("12312312@qq.com");
		email.send();
	}

}
