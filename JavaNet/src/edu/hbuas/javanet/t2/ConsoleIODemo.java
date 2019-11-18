package edu.hbuas.javanet.t2;

import java.io.IOException;

public class ConsoleIODemo {
	public static void main(String[] args) {
		System.out.println("标准数据，将数据输出到标准的输出介质-屏幕上的控制台里面");//
		
		//java将标准的输入和输出全部封装到System累中的in/out
		try {
			byte[] bs=new byte[10];
			int length= System.in.read(bs);
			System.out.println(new String(bs) );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
