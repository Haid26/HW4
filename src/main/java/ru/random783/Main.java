package ru.random783;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a, b;
        final long full = 4147483647L;
        a=b=0;
        double d,c;
        d=c=0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter two integer numbers");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("enter one floating number");
        d = in.nextDouble();

        // integer operations
        System.out.println("a+b="+Integer.toString(a+b));
        System.out.println("a-b="+Integer.toString(a-b));
        if (b!=0) {
            System.out.println("a/b=" + Integer.toString(a / b));
            System.out.println("a%b=" + Integer.toString(a % b));
        }
        else if (a!= 0) {
            System.out.println("b/a=" + Integer.toString(b / a));
            System.out.println("b%a=" + Integer.toString(b % a));
        }
        else {
            System.out.println("dividing by 0 is forbidden");
        }
        System.out.println("a*b=" + Integer.toString(a * b));

        //double operations
        System.out.println("a+d="+Double.toString(a+d));
        System.out.println("a-d="+Double.toString(a-d));
        boolean flag = true;
        if (d!=0) {
            System.out.println("a/d=" + Double.toString(a / d));
            flag = false;
        }
        if (a!= 0.0) {
            System.out.println("d/a=" + Double.toString(d / a));
            flag = false;
        }
        if (flag) {
            System.out.println("dividing by 0 is forbidden");
        }
        System.out.println("a*d=" + Double.toString(a * d));

        if (a>b) {
            System.out.println("A > B");
        }
        if (a<=b){
            if (a==b){
                System.out.println("A==B");
            }
            else {
                System.out.println("A<B");
            }
        }

        //overload
        a+=full;
        System.out.println("overfilled a = "+a);
    }
}