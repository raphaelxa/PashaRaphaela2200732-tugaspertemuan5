/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author pasha
 */
import java.util.Scanner;

public class genap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (antara 1 dan 1000): ");
        int N = scanner.nextInt();

        if (isValidInput(N)) {
            cetakPola(N);
        } else {
            System.out.println("Input tidak valid. Pastikan N antara 1 dan 1000.");
        }
    }

    public static boolean isValidInput(int N) {
        return (N >= 1 && N <= 1000);
    }

    public static void cetakPola(int N) {
        cetakSegitiga(N);
    }

    public static void cetakSegitiga(int N) {
         for (int i = 1; i <= N; i++) {
            System.out.print("N=" + i + " ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); 
    }

   }
}