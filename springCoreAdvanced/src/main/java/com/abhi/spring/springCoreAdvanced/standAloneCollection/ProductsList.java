package com.abhi.spring.springCoreAdvanced.standAloneCollection;

import java.util.List;

public class ProductsList {
	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return String.format("ProductsList [productNames=%s]", productNames);
	}

}
