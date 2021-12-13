package Bai1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        /*if(a>b){
            if(a%b==0){
                System.out.println("greatest common divisor(uoc chung lon nhat):"+b);
                System.out.println("least common multiple(boi chung nho nhat):"+a);
            }
            else{
                for(int i=b-1;i>1;i--)if(a%i==0 && b%i==0) {
                    System.out.println("greatest common divisor(uoc chung lon nhat):" + i);
                    System.out.println("least common multiple(boi chung nho nhat):" + (a * b) / i);
                }
            }
        }
        else{
            if(b%a==0){
                System.out.println("greatest common divisor(uoc chung lon nhat):"+a);
                System.out.println("least common multiple(boi chung nho nhat):"+b);
            }
            else{
                for(int i=a-1;i>=1;i--)if(a%i==0 && b%i==0){
                    System.out.println("greatest common divisor(uoc chung lon nhat):"+i);
                    System.out.println("least common multiple(boi chung nho nhat):" + (a * b) / i);
                }
            }
        }*/
        System.out.println("greatest common divisor(uoc chung lon nhat):"+GCD(a,b));
        System.out.println("least common multiple(boi chung nho nhat):" + (a * b) / GCD(a,b));

    }
public static int GCD(int a,int b){
        while (a!=b){
            if(a>b)a=a-b;
            else b=b-a;
        }
        return a;
}

}
