package Distancia;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutos;

        minutos = input.nextInt();

        System.out.printf("%d minutos\n", 2 * minutos);
    }
}