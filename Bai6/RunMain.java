package Bai6;

import java.util.Scanner;

public class RunMain {
    public static int inputn(){
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter n:");
            n=sc.nextInt();
            if(n<=0) System.out.println("Enter n>0");
        }while (n<=0);
        return n;
    }

    public static void main(String[] args) {
        int n=inputn();
        int [] f=new int[n+1];
        f[0]=1;f[1]=1;
        for(int i=2;i<=n;i++)f[i]=f[i-1]+f[i-2];
        System.out.println("Fibonanci number "+n+":"+f[n-1]);

    }
}
