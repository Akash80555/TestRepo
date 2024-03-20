package LearningJava;

public class CountEvenAndOddNumber {

    public static void main(String[] args) {
    
        int num = 123456789;
        int evn_Num = 0;
        int Odd_num = 0;
        
        
        while(num > 0) {
            
            int lastDigit = num % 10; // Get the last digit of num
            if(lastDigit % 2 == 0) {
                evn_Num++;
            }
            else {
                Odd_num++;  
            }
            num = num / 10;
        }

        System.out.println("Even numbers: " + evn_Num);
        System.out.println("Odd numbers: " + Odd_num);
    }

}
