package edu.hbuas.javanet.t2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo {
	public static void main(String[] args)  throws Exception{
		/**
		 * �����ֽ�����������������߼��������л�����
		 * 
		 * ���л����������Խ�java�������й������ڴ��е�һ��java����ֱ��д��Ӳ���д洢
		 * �����л����������Խ��������Ѿ����л���һ���ļ��е����ݣ���ȡ�����ڴ��е�һ��java������
		 * 
		 * ObjectOutputStream=DataOutputStream+FileOutputStream+BufferedOutputStream����
		 * 
		 * 
		 * Ĭ��java���Զ��������ǲ����Ա����л��������Ա�ObjectOutputStreamд��洢���ļ��е�
		 * 
		 * �����ȷ��Ҫ���л�������Ҫ���Լ�����ʵ��java.io.Serilizable�ӿڣ�����ͽӿ�=ֻ��������������û���κη�����Ҫʵ�֣�
		 */
		
//		DownloadTask  t=new DownloadTask("�й�����","http:sfxvxvsfsf",234234234,"2019-11-11",29.5f);
//		
//		ObjectOutputStream  out=new ObjectOutputStream(new FileOutputStream("resource/task1.ser"));
//		out.writeObject(t);//��һ����������������һ��������
//		out.flush();
//		out.close();
//		
		//�����л����ǽ�֮ǰ���л��Ķ����ȡ���ڴ�
		
		ObjectInputStream  in=new ObjectInputStream(new FileInputStream("resource/task1.ser"));
		DownloadTask  tt=(DownloadTask)in.readObject();
		tt.setPercent(99f);
		System.out.println(tt);
		
		
	}

}

class DownloadTask implements  Serializable{
	public DownloadTask() {
		super();
	}
	public DownloadTask(String name, String url, long size, String time, float percent) {
		super();
		this.name = name;
		this.url = url;
		this.size = size;
		this.time = time;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "DownloadTask [name=" + name + ", url=" + url + ", size=" + size + ", time=" + time + ", percent="
				+ percent + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	private String name;
	private String url;
	private long size;
	private String time;
	private float percent;
	
}
