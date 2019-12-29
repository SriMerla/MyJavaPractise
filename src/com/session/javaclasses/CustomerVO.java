package com.session.javaclasses;

import java.io.Serializable;

public final class CustomerVO implements Serializable {
	
	
	private int customerId;
	private String customerName;
	private String customerCity;
	private String customerUserId;
	private transient String userPassword;
	
	public CustomerVO(int customerId, String customerName, String customerCity, String customerUserId,
			String userPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerUserId = customerUserId;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "CustomerVO [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", customerUserId=" + customerUserId + ", userPassword=" + userPassword + "]";
	}
	
	
}
