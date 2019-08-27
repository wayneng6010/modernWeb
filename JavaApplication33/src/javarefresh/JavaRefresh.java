package javarefresh;

import java.util.Scanner;

public class JavaRefresh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Distinction");

        int length,width,height,volume,ttlsa;
        
        System.out.print("Please input length: ");
        length = input.nextInt();
        
        System.out.print("Please input width: ");
        width = input.nextInt();
        
        System.out.print("Please input height: ");
        height = input.nextInt();
        
        volume = length * width * height;
        ttlsa = (2 * length * height) + (2 * length * height) + (2 * width * height);
        
        System.out.println("Volume: " + volume);
        System.out.println("Total Surface Area: " + ttlsa);
    }
    
}
