package com.session.javaclasses;

import java.io.Serializable;
import java.util.Date;


public final class Product implements Serializable, Cloneable{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bestBefore == null) ? 0 : bestBefore.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (bestBefore == null) {
			if (other.bestBefore != null)
				return false;
		} else if (!bestBefore.equals(other.bestBefore))
			return false;
		if (Double.doubleToLongBits(productCost) != Double.doubleToLongBits(other.productCost))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		System.out.println("**********From toString Method**************");
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", manufacturingDate=" + manufacturingDate + ", bestBefore=" + bestBefore + "]";
	}


	private int productId;
	private String productName;
	private double productCost;
	private Date manufacturingDate;
	private String bestBefore;
	
	
	
	public Product(int productId, String productName, double productCost, Date manufacturingDate, String bestBefore) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.manufacturingDate = manufacturingDate;
		this.bestBefore = bestBefore;
	}


	public int getProductId() {
		return productId;
	}


	public String getProductName() {
		return productName;
	}


	public double getProductCost() {
		return productCost;
	}


	public Date getManufacturingDate() {
		return manufacturingDate;
	}


	public String getBestBefore() {
		return bestBefore;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		System.out.println("I am from Clone Method");
		return super .clone();//super at method level
		
		
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	

	

}
