package week2.day1;

public class DuplicateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for (int i=0; i < data.length; i++) {
			
			for(int j=i+1; j < data.length; j++) {
				
				if(data[i]==data[j]) {
					
					System.out.println("Duplicate Integers are: " +data[j]);
				}
			}
		}
		
		
		
	}

}
