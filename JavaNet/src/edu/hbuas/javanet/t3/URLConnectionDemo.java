package edu.hbuas.javanet.t3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		/**
		 * URLConnection��url����ĵ�����һ�������࣬�����Խ���һ��url��ַ�����ӣ����˿���input������outputʵ�����ݶ�д˫�����
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
