package com.amin;

public class Main {

    public static void main(String[] args) {

        //Nr.1
        System.out.println("1. uzdevums");
        for(int i = 0; i < 4; i++) {
            System.out.println("**********");
        }
        //Nr.2
        System.out.println("2. uzdevums");
        for (int j=0; j<=6; j++){

            for (int i=0; i<=j; i=i+1){
                System.out.print("*");
            }
            System.out.println("");
        }
        //NR.3
        System.out.println("3. uzdevums");
        for (int j=0; j<=6; j++) {

            for (int k=7-j; k>=2; k=k-1) {
                System.out.print(" ");
            }

            for (int i = 0; i<=j; i++) {

                System.out.print("*");
            }
            System.out.println();
        }
       // Nr.4
        System.out.println("4. uzdevums");
        for (int j=0; j<=6; j++) {

            for (int k=7-j; k>=2; k=k-1) {
                System.out.print(" ");
            }

            for (int i = 0; i<=4*j; i=i+2) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    {
    }
}