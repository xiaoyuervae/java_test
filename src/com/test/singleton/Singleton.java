package com.xye.singleton;


/**
 * 单例模式
 * 作用： 保证应用程序中实例有且只有一个
 * 适用范围： 只允许有一个对象
 * 类型：饿汉模式
 * @author xiaoy
 *
 */
public class Singleton {
	// 1.将构造方法私有化，不允许外界创建这个实例
	private Singleton(){
		
	}
	// 创建类的唯一实例，使用private static 修饰
	private static Singleton instance = new Singleton() ;
	
	// 3. 提供一个用于获取实例的方法,使用public static修饰
	public static Singleton getInstance() {
		return instance ;
	}
	
}
