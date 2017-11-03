package com.lezjava;

public class Main3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = b.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
                System.out.println("Success!");
        }
        System.out.println("b1 " + b1);
        System.out.println("b2 " + b2);
        System.out.println("b3 " + b3);
        }
    }