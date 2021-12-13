package Bai3;

import java.util.Scanner;

public class RunMain {
    public static int input(){
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter n:");
             n=sc.nextInt();
            if(n<=0) System.out.println("Enter n>0:");
        }while (n<=0);
        return n;
    }
    public static int prime(int n){
        int dem=0;
        for(int i=2;i<n;i++)if(n%i==0){
            dem++;
            break;
        }
        if(dem==0)return 1;
        else return 0;
    }
    public static void analysis(int n){
       int i=2;
        while (n>1){
           if(prime(i)==1){
               if(n%i==0) {
                   System.out.print(i+".");
                   n=n/i;
               }
               else i++;
           }
           else i++;
        }

    }
    public static void main(String[] args) {
       int n=input();
        System.out.print(n+"=");
        analysis(n);

    }
}
