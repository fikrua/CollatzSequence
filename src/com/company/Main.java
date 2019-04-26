package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
        int userinput=scan.nextInt();
        System.out.print(userinput+ " ");
        while(userinput!=1){

            if(userinput%2==0){
                userinput= userinput/2;
                System.out.print(userinput+ " ");
            }
            else {
                userinput = userinput*3 +1;
                System.out.print(userinput+" ");
            }


        }

    }
}
