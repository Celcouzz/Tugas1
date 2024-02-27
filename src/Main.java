package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di sistem login library!");

        while (true) {
            System.out.println("\nPilih jenis pengguna: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.println("Masukkan password: ");
                    String adminPassword = scanner.nextLine();

                    if (adminUsername.equals("admin") && adminPassword.equals("admin123")) {
                        System.out.println("Login admin berhasil.");

                    } else {
                        System.out.println("Username atau password salah.");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan NIM (panjang harus 15 karakter): ");
                    String nim = scanner.nextLine();

                    if (nim.length() == 15) {
                        System.out.println("Login mahasiswa berhasil .");

                    } else {
                        System.out.println("Panjang NIM harus 15 karakter.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem login library.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
 }
}
}