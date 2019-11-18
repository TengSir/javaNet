package edu.hbuas.javanet.t3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws Exception {
		// HttpClient
		/**
		 * Java是综合编程语言，所以具备大部分应用编程能力
		 * 
		 * WEB也是一种标准的互联网软件
		 * 
		 * java设计了一个URL类用来解析（get）url资源
		 * 
		 * 网络编程，网络协议自己实现网络软件
		 * 
		 */
		URL  url=new URL("https://n14-pl-agv.autohome.com.cn/video-16/E3BD4E39114FD258/2019-11-14/E2E9CED4CD1621AD6F15C4841F4F2CE2-300.mp4?key=B171A7DD2F3879BCCCD8275F58DACEE9&time=1574048754");
		
		InputStream  in=url.openStream();
		FileOutputStream out=new FileOutputStream("C://1.mp4");
		byte[] bs=new byte[1024];
		int length=-1;
		while((length=in.read(bs))!=-1) {
			out.write(bs,0,length);
		}
		out.close();
		in.close();
		
//		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
//		String message=null;
//		while((message=reader.readLine())!=null) {
//			System.out.println(message);
//		}
	}

}
