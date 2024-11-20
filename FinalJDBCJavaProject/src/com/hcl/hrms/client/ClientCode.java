package com.hcl.hrms.client;

import com.hcl.hrms.dao.IProduct;
import com.hcl.hrms.dao.ProductImpl;

public class ClientCode {
	public static void main(String[] args) {
		IProduct iProduct = new ProductImpl();
		iProduct.createTable();
		//iProduct.insertTable();
		//iProduct.updateTable();
		//iProduct.deleteTable();
		//iProduct.selectTable();
	}

}
