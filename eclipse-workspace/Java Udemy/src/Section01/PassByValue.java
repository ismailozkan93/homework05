package Section1;


public class PassByValue {
		static int x=5;//It is changed as "static".Because it has used in static method.
		//static y;Instance variable takes default value.
	public static void main(String[] args) {//Here is static,because of this instance variable as 
		System.out.println(x);				//"static" changed.
		int x=1;//Local variable'dir.It uses in method body.
		System.out.println("Before the call,x is " + x);
		increment(x);//Here is static because of static condition the method "increment" should be static.
		System.out.println("After the call,x is" + x);

	}
	public static void increment(int n) {
		//int a; it doesnt make error
		//	System.out.println(a); //It takes error beacuse LOCAL variable doesnt take default value.
		System.out.println(n);
		n++;
		System.out.println("n inside the method is"+ n);
		
	}
}
