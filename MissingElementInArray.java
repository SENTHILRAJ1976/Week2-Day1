package week2.day1;

public class MissingElementInArray {


	public static int getMissingNo(int[] nums, int n) {
		
	int sum = ((n+1)*(n+2))/2;
	for(int i=0; i<n; i++) {
		sum-=nums[i];
		return sum;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here 5 is missing
		int[] num = {1,2,3,4,7,6,8};
		
		int arr = num.length;
	
		System.out.println(getMissingNo(num, arr));
		
		
				
		
		
	}

}

}
