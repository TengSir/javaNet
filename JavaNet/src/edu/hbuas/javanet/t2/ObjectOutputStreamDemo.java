package edu.hbuas.javanet.t2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo {
	public static void main(String[] args)  throws Exception{
		/**
		 * 对象字节输出流，过滤流，高级流，序列化流。
		 * 
		 * 序列化技术：可以将java程序运行过程中内存中的一个java对象直接写入硬盘中存储
		 * 反序列化技术：可以将磁盘中已经序列化的一个文件中的数据，读取到到内存中的一个java对象中
		 * 
		 * ObjectOutputStream=DataOutputStream+FileOutputStream+BufferedOutputStream合体
		 * 
		 * 
		 * 默认java的自定义类型是不可以被序列化，不可以被ObjectOutputStream写入存储到文件中的
		 * 
		 * 如果的确需要序列化，则需要让自己的类实现java.io.Serilizable接口（标记型接口=只是用来声明，并没有任何方法需要实现）
		 */
		
//		DownloadTask  t=new DownloadTask("中国机长","http:sfxvxvsfsf",234234234,"2019-11-11",29.5f);
//		
//		ObjectOutputStream  out=new ObjectOutputStream(new FileOutputStream("resource/task1.ser"));
//		out.writeObject(t);//讲一个对象输出到具体的一个介质中
//		out.flush();
//		out.close();
//		
		//反序列化就是讲之前序列化的对象读取到内存
		
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
