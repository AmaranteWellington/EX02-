package com.company;

import java.util.Scanner;

public class QuestãoD {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;
        System.out.println("Informe os lados do triangulo:");
        ladoA = sc.nextInt();
        ladoB = sc.nextInt();
        ladoC = sc.nextInt();
        if (ladoA==ladoB && ladoB==ladoC) {
            System.out.println("O tringulo é EQUILÁTERO!");
        }else if(ladoA==ladoB && ladoC!=ladoA&& ladoC!=ladoB) {
            System.out.println("O triangulo é ISÓSCELES!");
        }else{
            System.out.println("O triangulo é ESCALENO!");


        }
    }
}



