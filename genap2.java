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

public class genap2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        if (isValidInput(batasAwal, batasAkhir)) {
            System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
            tampilkanPrima(batasAwal, batasAkhir);

            System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
            tampilkanKomposit(batasAwal, batasAkhir);
        } else {
            System.out.println("Input tidak valid. Pastikan batasAwal >= 1 dan batasAkhir <= 100.");
        }
    }

    public static boolean isValidInput(int batasAwal, int batasAkhir) {
        return (batasAwal >= 1 && batasAkhir <= 100 && batasAwal <= batasAkhir);
    }

    public static boolean isPrima(int angka) {
        if (angka < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void tampilkanPrima(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void tampilkanKomposit(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
