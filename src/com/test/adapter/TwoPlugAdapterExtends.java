package com.xye.adapter;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	public void powerWithThree() {
		System.out.println("ʹ�ü̳�������");
		this.powerWithTwo() ;
	}

}
