package com.company;

import java.util.Scanner;

public class QuestãoA {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int copias;
        double totalpago;
        System.out.println("informe quantidade de copias:");
        copias = a.nextInt();
        if (copias <= 100) {
            totalpago = copias * 0.25;
        } else {
            totalpago = copias * 0.20;
        }
        System.out.println("total a ser pago é:" +  totalpago  +  "R$" );
    }
}