package edu.hbuas.javanet.t7;

public class WebSiteServlet {
	public static void main(String[] args) {
		final Counter  c=new Counter();
		new Thread() {
			public void run() {
				for(int n=0;n<10;n++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					c.addCount();
				}
			};
		}.start();
		new Thread() {
			public void run() {
				for(int n=0;n<10;n++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					c.addCount();
				}
			};
		}.start();
		new Thread() {
			public void run() {
				for(int n=0;n<10;n++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					c.addCount();
				}
			};
		}.start();
	}

}
