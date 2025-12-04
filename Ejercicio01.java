/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author User
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String salida = "";
        int total_1 = 0;
        int total_2 = 0;
        int total_3 = 0;
        int total_4 = 0;
        int a = 30;
        int b = 60;
        int c = 90;
        int d = 120;

        for (int i = 1; i <= 21; i++) {
            salida = String.format("%s%d-%d-%d-%d\n", salida, a, b, c, d);

            total_1 = total_1 + a;
            total_2 = total_2 + b;
            total_3 = total_3 + c;
            total_4 = total_4 + d;

            a = a - 1;
            b = b - 2;
            c = c - 3;
            d = d - 4;
        }
        salida = String.format("%sTotales = %d-%d-%d-%d\n",
                salida, total_1, total_2, total_3, total_4);
        System.out.printf(salida, args);

    }

}
