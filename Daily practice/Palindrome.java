import java.util.Scanner;
public class Main{

    public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);        //creating an object to store value for num
    int num=sc.nextInt();                     //taking input from the user
    int original=num;                         // Save the original number so we can compare it later
    int digit;                                
    int reversed=0;                           // This will hold the reversed number
    while(num!=0){                            // loop till num is equals to zero
        digit=num%10;                         //it will store the last digit of the number
        reversed=reversed*10+digit;           //add the last digit
        num/=10;                              //remove the last digit from num
    }
    if(original==reversed){                   // If the reversed number matches the original, it's a palindrome
    }
    else{                                     //otherwise it is not a palindrome
        System.out.print("no");
    }
    }
}

/*
121
yes
*/
