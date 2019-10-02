package com.company;

import java.util.Scanner;

public class QuestãoE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Digite o priemiro número:");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        n3= sc.nextInt();
        if(n3>n2 && n2>n1){
            //123
            System.out.println("1º: "+n1);
            System.out.println("2º: "+n2);
            System.out.println("3º: "+n3);
        }else if(n1>n2 && n2>n3){
            //321
            System.out.println("1º: "+n3);
            System.out.println("2º: "+n2);
            System.out.println("3º: "+n1);

        }else if(n3>n1 && n1>n2){
            //213
            System.out.println("1º: "+n2);
            System.out.println("2º: "+n1);
            System.out.println("3º: "+n3);
        }else if(n1>n3 && n3>n2){
            //231
            System.out.println("1º: "+n2);
            System.out.println("2º: "+n3);
            System.out.println("3º: "+n1);
        }else if(n2>n1 && n1>n3){
            //312
            System.out.println("1º: "+n3);
            System.out.println("2º: "+n1);
            System.out.println("3º: "+n2);
        }else if(n2>n3 && n3>n1){
            //132
            System.out.println("1º: "+n1);
            System.out.println("2º: "+n3);
            System.out.println("3º: "+n2);
        }

    }
}






