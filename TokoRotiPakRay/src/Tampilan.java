import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Toko Roti PakRay");
        System.out.println("-------------------------");
        System.out.println("Pilihan Roti:");
        System.out.println("1. Roti Manis");
        System.out.println("2. Roti Tawar");
        System.out.println("3. Pizza");
        System.out.println("4. keluar")
        System.out.println("-------------------------");
        System.out.println("Pilihan Anda:");

        int pilihan = input.nextInt();

        // Lakukan sesuatu berdasarkan pilihan yang dimasukkan
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Roti Manis");
                break;
            case 2:
                System.out.println("Anda memilih Roti Tawar");
                break;
            case 3:
                System.out.println("Anda memilih Pizza");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
