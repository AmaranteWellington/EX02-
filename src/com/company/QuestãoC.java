package com.company;

import java.util.Scanner;

public class QuestãoC {
    public static void EX03C(String[]arg) {
        Scanner a = new Scanner(System.in);
        int idade;
        System.out.println("informe a idade do nadador:");
        idade = a.nextInt();
        if (idade <= 10) {
            System.out.println("Sua categoria é infantil");
        } else if (idade > 10 && idade <= 17) {
        System.out.println("sua categoria é juvenil");
    }else{
        System.out.println("sua categoria é senior");
        }

    }
}
