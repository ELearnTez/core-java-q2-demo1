package com.yuvintech.git.nextSub;

import com.yuvintech.git.ISubtraction;

public class NextSub implements ISubtraction {

	@Override
	public int subtract(int a, int b) {
		System.out.println("subtraction 2");
		return a-b;
	}

}
