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

public class genap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int num3 = scanner.nextInt();

        System.out.println("Angka " + num1 + " adalah ribuan: " + checkThousands(num1));
        System.out.println("Angka " + num2 + " adalah ribuan: " + checkThousands(num2));
        System.out.println("Angka " + num3 + " adalah ribuan: " + checkThousands(num3));

        scanner.close();
    }

    public static boolean checkThousands(int num) {
        return num >= 1000 && num <= 9999;
    }
}
