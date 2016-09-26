package com.xye.singleton;

/**
 * 单例模式之懒汉模式
 * @author xiaoy
 *
 */
public class Singleton2 {

	//1 .私有化构造方法
	private Singleton2(){} ;
	
	//2 . 声明类的一个实例
	private static Singleton2 instance ;
	
	//3. 构建一个获取实例的方法
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2() ;
		}
		return instance ;
	}
}
