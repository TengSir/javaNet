package edu.hbuas.javanet.t5.group;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MutilCastServer {
	public static void main(String[] args) throws Exception {
		//组播使用MutilCastSocket类来通讯
		
		//1.创建一个多播对象
		MulticastSocket  sender=new MulticastSocket();
		//2.加入组播地址(指定通讯频道)
		InetAddress  groupIP=InetAddress.getByName("224.0.0.0");
		
		sender.joinGroup(groupIP);
	
		while(true) {
			
			//3.封装数据包裹
			String message="你好,组播的用户们";
			DatagramPacket  sendpacket=new DatagramPacket(message.getBytes(),message.length(),groupIP,9999);
			
			//4.发送数据
			sender.send(sendpacket);
			
			System.out.println("数据已经发送到组播地址内");
		}
		
	}

}
