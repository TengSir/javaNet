package edu.hbuas.javanet.t5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		//UDP Client 
		//1.创建udp的socket对象，可以不指定端口
		DatagramSocket  client=new DatagramSocket(9999);
		
		//2.准备一个要发送的数据简报对象，该对象中一定封装了要发送的数据(DatagramPacket)
		byte[]  bs="你好，我是udp的客户端对象".getBytes();//讲一个常量字符串转成字节数据
		
		/****---客户器给服务器发送一段内容--**/
		InetAddress  reciveIP=InetAddress.getLocalHost();//封装一个接收方的地址类
		
		DatagramPacket  pack=new DatagramPacket(bs,bs.length,reciveIP,7890);
		//讲要发送的内容（字节数组）封装到数据简报对象里面，发送的数据包裹中必须
		//带上接收方的地址
		
	   //3.使用datagramSocket的send方法，讲数据简报发送出去
		client.send(pack);
		System.out.println("客户端发送完毕");
		
		
		/****---客户器接受服务器发送的一段内容--**/
		byte[] datas=new byte[100];
		DatagramPacket  recivePacket=new DatagramPacket(datas, datas.length);
		
		//使用client的socket对象接受数据包裹
		client.receive(recivePacket);
		
		System.out.println("服务器说:"+new String(datas));
		
		System.out.println("客户端接受完毕");
		
	}

}
