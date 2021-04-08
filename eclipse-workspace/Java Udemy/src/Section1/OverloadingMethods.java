package Section1;

public class OverloadingMethods {

public static void main(String[] args) {
		
}

		public static int max(int num1, int num2) {
			if(num1>num2)
				return num1;
			else
				return num2;
			
		}
		public static double max(double num1, double num2) {
			if(num1>num2)
				return num1;
			else
				return num2;
			
		}
		public static double max(double num1, double num2, double num3) {
			return max(max(num1,num2),num3);
			
		}
	}

/*A person who can change variable type, so person can produce many methods with same "METHODNAME".It means
 * "METHOD OVERLOADING". 
 *A Person can make Overlaoding only with parameters.
 *Changing return type is not enough to make "OVERLOADING."
 *Changing Access Modifier is not enough to make "OVERLOADING"
 *Changing Methody Body is not enough to make "OVERLOADING"
 *METHOD OVERLOADING is COMPILE TIME POLYMORPHISM. 
 *
 *
 */


/*1)Return Type lar degistirilerek method overloading yapilmaz.Yani;ismi ve paremetreleri ayni olan iki method
 * return typelari farkli bile olsa java onlari ayni kabul eder.
 *2)Access Modifier lar degistirilerek method overloading yapilmaz. Yani; ismi ve parametreleri ayni olan iki metod
 *Acess Modiefierlari farkli bile olsa Java onlari ayni kabul eder.
 *3)Method Bodyler degistirilerek method overloading yapilmaz.Yani; ismi ve parametreleri ayni bile olsa Java onlari
 *ayni metod kabul eder. 
 */
//Note: Method Overloading Compile Time Polymorpfisim dir.
