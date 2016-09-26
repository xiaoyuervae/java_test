package com.xye.adapter;

/**
 * 二相转三相适配器
 * @author xiaoy
 *
 */
public class TwoPlugAdapter implements ThreePlugIf {

	private GBTwoPlug plug ;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug ;
	}
	public void powerWithThree() {
		System.out.println("通过转化");
		plug.powerWithTwo() ;

	}

}
