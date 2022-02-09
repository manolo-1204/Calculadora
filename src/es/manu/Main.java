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
                    int sumando1, sumandos, total = 0;

                    System.out.print("¿Cuántos números quieres sumar? ");
                    sumandos = entrada.nextInt();

                    for (int i = 1; i <= sumandos; i++){
                        System.out.print("Sumando " + i + ": ");
                        sumando1 = entrada.nextInt();
                        total += sumando1;
                    }
                    System.out.println("Suma: " + total);
                    break;
                case 2:
                    System.out.println("Vamo a restar");
                    int minuendo, sustraendo;

                    System.out.print("Restando 1: ");
                    minuendo = entrada.nextInt();

                    System.out.print("Restando 2: ");
                    sustraendo = entrada.nextInt();

                    System.out.println("Resta: " + (minuendo - sustraendo));
                    break;
                case 0:
                    System.out.println("Ya te va?? Despídete bien no??");
                    break;
            }
            entrada.nextLine();
            System.out.println();

            System.out.print("Pulsa intro para continuar...");
            entrada.nextLine();
        } while (opcion != 0);
    }
}
