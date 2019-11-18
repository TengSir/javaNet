package edu.hbuas.javanet.t3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		/**
		 * URLConnection是url下面的的另外一个辅助类，他可以建立一个url地址的连接，除了可以input还可以output实现数据读写双向操作
		 */

		try {
			URL u = new URL("http://jwxt.hbuas.edu.cn/jsxsd/");
			URLConnection c = u.openConnection();
			
			InputStream  in=c.getInputStream();
			byte[] bs=new byte[1024];
			int length=-1;
			while((length=in.read(bs))!=-1) {
				System.out.println(new String(bs,0,length));
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
