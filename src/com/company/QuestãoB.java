package com.company;

import java.util.Scanner;

public class QuestãoB {
    public static void EX02B(String[]args){
        Scanner a= new Scanner (System.in);
        int pcProduzida,pcDefeito;
        double pcem;
        System.out.println("informe o total produzido: ");
        pcProduzida=a.nextInt();
        System.out.println("informe o número de peças com defeito: ");
        pcDefeito=a.nextInt();
        pcem=pcProduzida*0.1;
        if(pcDefeito<=pcem) {
            System.out.println("não precisa de manutenção: ");
        }else{
            System.out.println("precisa de manunteção: ");
        }



    }
}
