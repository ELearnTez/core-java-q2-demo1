package com.yuvintech.git.impl;

import com.yuvintech.git.IStringUtils;

public class StringUtilsImpl implements IStringUtils{

	@Override
	public boolean isNotEmpty(String arg) {
		return (arg!= null && !arg.equals("")) ? true : false ;
	}

}
