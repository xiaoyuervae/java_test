package com.xye.singleton;

/**
 * ����ģʽ�Ͷ���ģʽ������
 * 		����ģʽ������ص�ʱ��Ƚ���������������ʱ��ȡ������ٶȱȽϿ� �� ���̰߳�ȫ��
 * 		����ģʽ�������ʱ�ٶȱȽϿ죬����������ʱ��ȡ������ٶȱȽ����� ���̲߳���ȫ��
 * @author xiaoy
 *
 */
public class Test {
	public static void main(String[] args) {
		// ����ģʽ
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance() ; 
		if (s1 == s2) {
			System.out.println(true);
		}
		// ����ģʽ
		Singleton2 s3 = Singleton2.getInstance() ;
		Singleton2 s4 = Singleton2.getInstance() ; 
		if (s3 == s4) {
			System.out.println("s3��s4��ͬһ��ʵ��");
		}else{
			System.out.println("s3��s4����ͬһ��ʵ��");
		}
	}
}
