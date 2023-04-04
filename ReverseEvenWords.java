package week2.day1;

public class ReverseEvenWords {

	
		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
		
}
		public static void main(String[] args) {  
		    System.out.println(StringFormatter.reverseWord("I am a software tester"));

}  
}