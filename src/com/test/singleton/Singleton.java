package com.xye.singleton;


/**
 * ����ģʽ
 * ���ã� ��֤Ӧ�ó�����ʵ������ֻ��һ��
 * ���÷�Χ�� ֻ������һ������
 * ���ͣ�����ģʽ
 * @author xiaoy
 *
 */
public class Singleton {
	// 1.�����췽��˽�л�����������紴�����ʵ��
	private Singleton(){
		
	}
	// �������Ψһʵ����ʹ��private static ����
	private static Singleton instance = new Singleton() ;
	
	// 3. �ṩһ�����ڻ�ȡʵ���ķ���,ʹ��public static����
	public static Singleton getInstance() {
		return instance ;
	}
	
}
