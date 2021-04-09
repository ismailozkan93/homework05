package Section02;

public class TestStudent {

	public static void main(String[] args) {

		Student s;
		//System.out.println(s.name);//A Person who takes error, because local variable need to have first value.		
				
		s=new Student();
		
		System.out.println(s.name);
		
		s.name="Java";

		System.out.println(s.name.charAt(0));
	
		System.out.println(s.gender);
	}

}
