package oop;
//method overloading

class Addition {
	void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
			
	}
	void add(float a, float b)
	{
		float sum = a+b;
		System.out.println(sum);
		
	}
	void add(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
}
	

public class Method {
	public static void main(String[] args) {
     Addition Obj = new Addition();
     Obj.add(3,4);
     Obj.add(3.9,4.8);
     Obj.add(3.98,4.76);
     }
}


