package com.xye.singleton;

/**
 * ����ģʽ֮����ģʽ
 * @author xiaoy
 *
 */
public class Singleton2 {

	//1 .˽�л����췽��
	private Singleton2(){} ;
	
	//2 . �������һ��ʵ��
	private static Singleton2 instance ;
	
	//3. ����һ����ȡʵ���ķ���
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2() ;
		}
		return instance ;
	}
}
