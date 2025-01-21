package com.ChallengeUnoBackend.principal;

import com.ChallengeUnoBackend.herramientas.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conversor conversor;
        int seleccion = 0;
        double cifraDinero = 0;

        while (seleccion != 7) {

            System.out.println("\nCONVERSOR DE DIVISAS");
            System.out.println("**************************************************");

            System.out.println("Opciones de cambio:");
            System.out.println("1.USD a COP\n2.COP a USD\n3.USD a ARS\n4.ARS a USD\n5.USD a BRL\n6.BRL a USD\n7.SALIR");
            seleccion = scan.nextInt();

            if (seleccion != 7) {
                System.out.println("\nCifra de dinero a convertir: ");
                cifraDinero = scan.nextDouble();
            }

            switch (seleccion) {
                case 1:
                    resultadoConvercion("USD", "COP", cifraDinero);
                    break;
                case 2:
                    resultadoConvercion("COP", "USD", cifraDinero);
                    break;
                case 3:
                    resultadoConvercion("USD", "ARS", cifraDinero);
                    break;
                case 4:
                    resultadoConvercion("ARS", "USD", cifraDinero);
                    break;
                case 5:
                    resultadoConvercion("USD", "BRL", cifraDinero);
                    break;
                case 6:
                    resultadoConvercion("BRL", "USD", cifraDinero);
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
    }

    public static void resultadoConvercion(String monedaBase, String monedaDeCambio, double cifraDinero){
        Conversor conversor;

        conversor = new Conversor(monedaBase, monedaDeCambio, cifraDinero);
        System.out.println(cifraDinero + " " + monedaBase + " = " + conversor.convertir() + " " + monedaDeCambio);
    }
}

