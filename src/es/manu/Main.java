package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Menú");
            System.out.println("-----------------");
            System.out.println("1.-Sumar");
            System.out.println("2.-Restar");
            System.out.println("0.-Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vamo a sumar");
                    int sumando1, sumando2;
                    System.out.print("Sumando 1: ");
                    sumando1 = entrada.nextInt();
                    System.out.print("Sumando 2: ");
                    sumando2 = entrada.nextInt();
                    System.out.print("Suma: " + (sumando1 + sumando2));
                    break;
                case 2:
                    System.out.println("Vamo a restar");
                    break;
                case 0:
                    System.out.println("Ya te va?? Despídete bien no??");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
    }
}
