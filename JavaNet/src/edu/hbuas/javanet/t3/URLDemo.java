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
		 * Java���ۺϱ�����ԣ����Ծ߱��󲿷�Ӧ�ñ������
		 * 
		 * WEBҲ��һ�ֱ�׼�Ļ��������
		 * 
		 * java�����һ��URL������������get��url��Դ
		 * 
		 * �����̣�����Э���Լ�ʵ���������
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
