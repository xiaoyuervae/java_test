package com.xye.adapter;

/**
 * ����ת����������
 * @author xiaoy
 *
 */
public class TwoPlugAdapter implements ThreePlugIf {

	private GBTwoPlug plug ;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug ;
	}
	public void powerWithThree() {
		System.out.println("ͨ��ת��");
		plug.powerWithTwo() ;

	}

}
