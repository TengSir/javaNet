package edu.hbuas.javanet.t5.group;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MutilCastClient {
public static void main(String[] args) throws Exception {
		//接受方必须加入同一个组播地址
	
	   //1.创建组播对象
		MulticastSocket  reciver=new MulticastSocket(9999);
		//2.加入组播地址
		InetAddress  groupIP=InetAddress.getByName("224.0.0.0");
		
		reciver.joinGroup(groupIP);
		
		//3.封装数据包裹接受数据
		byte[] data=new byte[1024];
		
		DatagramPacket  recivePacket=new DatagramPacket(data, data.length);
		
		//4.接受并处理数据
		reciver.receive(recivePacket);
		System.out.println("接收到的数据为"+new String(data));
		
		System.out.println("接受完毕");
		
	}
}
