package Lab1P1;

import java.util.Scanner;

public class lab1p1 {
	 public static void main(String [] args) {
		 
Scanner sc = new Scanner(System.in); //Scanner to ask user for input 
        
         int number1;
         int number2;
        
         int hundreds1 = 0;
         int hundreds2 = 0;
        
         int tens1 = 0;
         int tens2 = 0;
        
         int ones1 = 0;
         int ones2 = 0;
         
         Boolean validateNumber;  //validate number to check if user enter valid number
         Boolean validateNumber2;

        do {
         System.out.println("Enter first number : "); //Prompt user
         number1 = sc.nextInt();
         validateNumber = validateNumberIsBetween100and999(number1);

        
        }while (!validateNumber); //While number is not valid 

        do {
         System.out.println("Enter second number : "); //Prompt user
         number2 = sc.nextInt();
         validateNumber2 = validateNumber2IsBetween100and999(number2);
         
        }while(!validateNumber2); //While number2 is not valid 
        
 
         hundreds1 = number1 / 100;
         hundreds2 = number2 / 100;
        
         tens1 = (number1 % 100) / 10;
         tens2 = (number2 % 100) / 10;
        
         ones1 = number1 % 10;
         ones2 = number2 % 10;
        
         int results = hundreds1 + hundreds2; 
         
         int resolve = tens1 + tens2; 
         
         int resolut = ones1 + ones2; 
         
         if (results == resolve || resolve == resolut) {
        	 
        	 System.out.print("true"); //If numbers are equal
          	 
        	 }
         else {
        	 System.out.print("false");
         }
	 }

	private static Boolean validateNumber2IsBetween100and999(int number2) {
		// TODO Auto-generated method stub
		
		if (number2 >= 100 && number2 <= 999) { 
		return true;
	} System.out.println("Error! Please enter a 3 digit number."); //Outut if three digits are not entered
	return false;
}

	private static Boolean validateNumberIsBetween100and999(int number1) {
		// TODO Auto-generated method stub
		 if (number1 >= 100 && number1 <= 999) {
			 
    return true;
	} System.out.println("Error! Please enter a 3 digit number");
	return false;
}
}