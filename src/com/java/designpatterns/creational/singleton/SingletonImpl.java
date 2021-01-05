package com.java.designpatterns.creational.singleton;

class Downloader {
	
	//eager version
	private static Downloader downloader = new Downloader();
	
	
	
	private Downloader() {
		
	}
	
	//eager version
	public static Downloader getEagerInstance() {
		return Downloader.downloader;
	}
	
	//lazy version - not a thread safe
	private static Downloader getLazyInstance() {
		
		if (null == downloader)
			downloader = new Downloader();
		
		return Downloader.downloader;
	}
	
	//thread safe implementation - 
		
	public void startDownloading() {
		System.out.println("Start downloading from web....");
	}
	
	
}
public class SingletonImpl {
	
	public static void main(String[] args) {
		
		Downloader d = Downloader.getEagerInstance();
		d.startDownloading();
		
		Downloader d2 = Downloader.getEagerInstance();
		d2.startDownloading();
		
		if (d == d2) System.out.println("theese are same");
	}

}
