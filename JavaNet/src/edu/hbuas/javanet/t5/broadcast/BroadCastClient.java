package edu.hbuas.javanet.t5.broadcast;

import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadCastClient {
	//alt+/
	public static void main(String[] args) throws Exception {
		
		DatagramSocket  reciver=new DatagramSocket(8888);
		
		byte[] bs=new byte[1024];
		
		DatagramPacket  recivePacket=new DatagramPacket(bs,bs.length);
		
		reciver.receive(recivePacket);//接收方阻塞方法
		
		System.out.println("广播方发过来的数据："+new String(bs));
		System.out.println("接受完毕");
		
	}

}
