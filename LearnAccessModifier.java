package week2.day1;

public class LearnAccessModifier {
	
	
	public void getnum() {
		System.out.println("Testleaf");
	}
	
	
	private void getdata() {
		System.out.println("123456");
	}
	
	
	void getinfo() {
		System.out.println("$$%%^&&%$$");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnAccessModifier lam  = new LearnAccessModifier();
		lam.getnum();
		lam.getdata();
		lam.getinfo();
		
		
	}

}
