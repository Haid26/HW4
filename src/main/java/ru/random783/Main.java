package ru.random783;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a;
        long b;
        a=0;
        b=0;
        double d;
        float c;
        c=0.0f;
        d = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter two integer numbers");
        a = in.nextInt();
        b = in.nextLong();
        System.out.println("enter one floating number");
        d = in.nextDouble();

        // integer operations
        System.out.println("a+b="+Long.toString(a+b));
        System.out.println("a-b="+Long.toString(a-b));
        if (b!=0) {
            System.out.println("a/b=" + Long.toString(a / b));
            System.out.println("a%b=" + Long.toString(a % b));
        }
        else if (a!= 0) {
            System.out.println("b/a=" + Long.toString(b / a));
            System.out.println("b%a=" + Long.toString(b % a));
        }
        else {
            System.out.println("dividing by 0 is forbidden");
        }
        System.out.println("a*b=" + Long.toString(a * b));

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

        //overload right
        a=Integer.MAX_VALUE+15;
        System.out.println("overfilled a = "+a);
        d +=Double.MAX_VALUE*2;
        System.out.println("overfilled d ="+d);
        b+=Long.MAX_VALUE+15;
        System.out.println("overfilled b= "+b);
        c=15+Float.MAX_VALUE*2;
        System.out.println("overfilled c= "+c);
        //overload left
        a=Integer.MIN_VALUE-15;
        System.out.println("overfilled left a = "+a);
        d =-Double.MAX_VALUE*2;
        System.out.println("overfilled left d ="+d);
        b=Long.MIN_VALUE-15;
        System.out.println("overfilled left b= "+b);
        c=-Float.MAX_VALUE*2;
        System.out.println("overfilled left c= "+c);

        //max min values
        System.out.println("Double max value="+Double.MAX_VALUE);
        System.out.println("Double min value="+Double.MIN_VALUE);
        System.out.println("Float max value="+Float.MAX_VALUE);
        System.out.println("Float min value="+Float.MIN_VALUE);
        System.out.println("Long max value="+Long.MAX_VALUE);
        System.out.println("Long min value="+Long.MIN_VALUE);
        System.out.println("Int max value="+Integer.MAX_VALUE);
        System.out.println("Int min value="+Integer.MIN_VALUE);
    }
}