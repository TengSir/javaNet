package edu.hbuas.javanet.t3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress  i=InetAddress.getByName("www.baidu.com");
		System.out.println(i.getHostName());
		System.out.println(i.getHostAddress());
		InetAddress[]  inets=InetAddress.getAllByName("www.baidu.com");
		
		for(InetAddress  in:inets) {
			System.out.println(in.getHostAddress());
		}

	}

}
