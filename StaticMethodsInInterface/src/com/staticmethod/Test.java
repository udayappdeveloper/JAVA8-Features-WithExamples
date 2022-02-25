package com.staticmethod;

public class Test implements Myinter {
	
	//it is static but not overridden
	public static  void sum(int a,int b){
		System.out.println("It is not overriding");
		
	}
	
	//it is instance method not static
	public  void m1(){
		System.out.println("It is not overriding");
		
	}
	
	
	public static void main(String[] args) {
		
		Test t=new Test();
	//	t.sum(2,3) //not avlbl
		
		Myinter m=new Test();
		//m.sum //not avlbl
		Myinter.sum(2, 3);
	}

}
