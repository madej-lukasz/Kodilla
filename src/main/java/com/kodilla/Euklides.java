package com.kodilla;

class Euklides {
    public static void main (String[] args) {
        int a = 40;
        int b = 3;

        while(a!=b) {
            if(a>b)
                a-=b;
            else
                b-=a;


            System.out.println(a);
        }

    }
}