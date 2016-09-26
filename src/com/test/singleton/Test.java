package com.xye.singleton;

/**
 * 懒汉模式和饿汉模式的区别：
 * 		饿汉模式在类加载的时候比较慢，但是在运行时获取对象的速度比较快 ， 是线程安全的
 * 		懒汉模式在类加载时速度比较快，但是在运行时获取对象的速度比较慢， 是线程不安全的
 * @author xiaoy
 *
 */
public class Test {
	public static void main(String[] args) {
		// 饿汉模式
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance() ; 
		if (s1 == s2) {
			System.out.println(true);
		}
		// 懒汉模式
		Singleton2 s3 = Singleton2.getInstance() ;
		Singleton2 s4 = Singleton2.getInstance() ; 
		if (s3 == s4) {
			System.out.println("s3和s4是同一个实例");
		}else{
			System.out.println("s3和s4不是同一个实例");
		}
	}
}
