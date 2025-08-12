import java.util.Scanner;
public class Main{

    public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int or=num;
    int digit;
    int reversed=0;
    while(num!=0){
        digit=num%10;                     
        reversed=reversed*10+digit;
        num/=10;
    }
    if(or==reversed){
        System.out.print("yes");
    }
    else{
        System.out.print("no");
    }
    }
}

/*
121
yes
*/
