package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        while (n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum:"+sum);
    }
}
//tong cac chu so