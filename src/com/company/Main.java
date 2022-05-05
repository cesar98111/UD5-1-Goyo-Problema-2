package com.company;
import com.company.dataestructure.Stack;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack pila=new Stack();
        System.out.println("introduce el primer numero");
        pila.push(sc.nextInt());
        sc.nextLine();
        System.out.println("introduce el segundo numero");
        pila.push(sc.nextInt());
        sc.nextLine();
        System.out.println("introduce un operador");
        String operador=sc.nextLine();
        switch (operador){
            case "+":
                int numero= pila.pop();
                numero=numero+ pila.pop();
                System.out.println(numero);
                break;
            case "-":
                numero= pila.pop();
                numero=numero - pila.pop();
                System.out.println(numero);
                break;
            case "*":
                numero= pila.pop();
                numero=numero * pila.pop();
                System.out.println(numero);
                break;
            case "/":
                numero= pila.pop();
                numero=numero / pila.pop();
                System.out.println(numero);
                break;
            default:
                System.out.println("operador erroeneo");
        }
    }
}
