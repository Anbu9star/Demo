class Demo{
	Demo(){
		System.out.println("This from constructor");
	}
	public static void main(String args[]){
		System.out.println("This from Main Method");
		new Demo();
		m1();
	}
	static void m1(){
		System.out.println("Hi, i am a method");
	}
}
