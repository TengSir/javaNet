package edu.hbuas.javanet.t5.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BroadCastServer {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket  sender=new DatagramSocket();
		
		String message="大家好，广播数据";
		InetAddress  ip=InetAddress.getByName("255.255.255.255");
		DatagramPacket  packet=new DatagramPacket(message.getBytes(), message.getBytes().length,ip,8888);
		
		
		sender.send(packet);
		
		
		System.out.println("广播完毕");
				
		
	}
}
