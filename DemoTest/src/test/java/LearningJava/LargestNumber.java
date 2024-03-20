package LearningJava;

public class LargestNumber {

	public static void main(String[] args) {
		// Find the largest of 3 numbers:
		
		int a=100, b=200, c= 300;
		if(a>b &&a>c) {
			System.out.println(a+ ": Is largest num");
		}

		else if (b>a && b>c) {
			System.out.println(b+ ": Is largest num");
		}
		
		else{
			System.out.println(c+ ": Is largest num");
		}
		
		//uisng turnary oparator:
		int largest = (a > b && a > c) ? a : (b > c) ? b : c;

	    System.out.println(largest + " is the largest number Turnary");
		
	}
	

}
