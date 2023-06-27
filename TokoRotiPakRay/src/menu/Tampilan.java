import java.util.Scanner;

public class Tampilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------");
            System.out.println("Toko Roti PakRay");
            System.out.println("-------------------------");
            System.out.println("Pilihan Roti:");
            System.out.println("1. Roti Manis ");
            System.out.println("2. Roti Tawar");
            System.out.println("3. Pizza");
            System.out.println("4. keluar");
            System.out.println("-------------------------");
            System.out.println("Pilihan Anda:");

            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Anda memilih Roti Manis");
                System.out.println("Varian 1");
                System.out.println("Varian 2");
                System.out.println("Varian 3");
                System.out.print("Pilihan Anda : ");
                int rotimanis = input.nextInt();
                if (rotimanis == 1) {
                    System.out.println("Keju");
                    System.out.println("Coklat");
                    System.out.println("Coklat");
                } else if (rotimanis == 2) {
                    System.out.println("Read Bean");
                    System.out.println("Krim Vanilla");
                } else if (rotimanis == 3) {
                    System.out.println("Keju");
                    System.out.println("Sosis");
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            } else if (pilihan == 2) {
                System.out.println("Anda memilih Roti Tawar");
                System.out.println("Varian 1");
                System.out.println("Varian 2");
                int rotitawar = input.nextInt();
                if (rotitawar == 1) {
                    System.out.println("Coklat");
                } else if (rotitawar == 2) {
                    System.out.println("Keju");
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            } else if (pilihan == 3) {
                System.out.println("Anda memilih Pizza");
                System.out.println("Varian 1");
                int pizza = input.nextInt();
                if (pizza == 1) {
                    System.out.println("Keju");
                    System.out.println("Sosis");
                    System.out.println("Smoked Beef");
                    System.out.println("Bombay");
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }
}
