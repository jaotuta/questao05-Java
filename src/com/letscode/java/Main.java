package com.letscode.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Entre com a medida em polegadas: ");
        float polegadas = numberScanner.nextFloat();

        System.out.printf("%.2f pol são %.2f em centímetros %n", polegadas, (float)(polegadas*2.54));
    }
}
