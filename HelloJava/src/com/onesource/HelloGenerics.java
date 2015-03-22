package com.onesource;

  class Box <T>{
	T t;
	public void setStatus(T t){
		this.t=t;
//		return;
	}
	public T getStatus(){
		return this.t;
	}
}
public class HelloGenerics {

	public <T> T testGenerics(T gen){
		System.out.println(gen);
		return gen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloGenerics hg = new HelloGenerics();
		Box<String> b = new Box<>();
		b.setStatus("Hello Generics..2");
		System.out.println(b.getStatus());
		hg.testGenerics("Hello Generic Method");
	}

}
