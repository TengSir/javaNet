package edu.hbuas.javanet.t3;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class SocketAddressDemo {

	public static void main(String[] args) {
		//SocketAddress类就是为了后期java使用这个地址来连接指定主机的一个地址类
		SocketAddress s=new InetSocketAddress("172.19.22.111", 8888);

	}

}
