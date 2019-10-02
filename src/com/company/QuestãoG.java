package com.company;

import java.util.Scanner;

public class QuestãoG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("O MAIOR É:" + n1);
        } else if (n2 > n1) {
            System.out.println("O MAIOR É:" + n2);
        }
    }
}


