package com.hcl.buld.basic.OOPS;

public  class ClientCode {
	static int i = 1;
	public static void main(String[] args) {
			ClientCode code = new ClientCode();
			code.change();
		
   		ClientCode code2 = new ClientCode();
		code2.change();
//			System.out.println(code.i);
System.out.println(i);
	}
	void change() {
		i++;
	}
}