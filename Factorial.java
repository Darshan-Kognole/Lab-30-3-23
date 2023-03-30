package basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){  
        int i,factorial=1;
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();  
            
        for(i=1;i<=number;i++){    
            factorial=factorial*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+factorial);    
    }  
}

// public class Factorial {
//     public static void main(String[] args) {
       
//        // declare variables
//        int count;
//        long factorial = 1;
       
//        // Find factorial from 1 to 10
//        System.out.printf("\n", "Number", "Factorials");
//        for(count = 1; count <= 10; count++)
//        {
//           factorial *= count;
//           System.out.printf("%4d%,30d\n", count, factorial);
//        }
//     }
//  }