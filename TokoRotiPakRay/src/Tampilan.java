import java.util.Scanner;
package default package;

public class Tampilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Toko Roti PakRay");
        System.out.println("-------------------------");
        System.out.println("Pilihan Roti:");
        System.out.println("1. Roti Manis");
        System.out.println("2. Roti Tawar");
        System.out.println("3. Pizza");
        System.out.println("4. keluar");
        System.out.println("-------------------------");
        System.out.println("Pilihan Anda:");

        int pilihan = input.nextInt();

        // Lakukan sesuatu berdasarkan pilihan yang dimasukkan
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Roti Manis");
                System.out.println("Varian 1");
                System.out.println("Varian 2");
                System.out.println("Varian 3");
                System.out.print("Pilihan Anda : ");
                int pilihan2 = input.nextInt();
                switch(pilihan2){
                    case 1:
                    System.out.println("Keju");
                    System.out.println("Coklat");
                    System.out.println("Coklat");
                    case 2:
                    System.out.println("Read Bean");
                    System.out.println("Krim Vanilla");
                    case 3:
                    System.out.println("Keju");
                    System.out.println("Sosis");
                }
                break;
            case 2:
                System.out.println("Anda memilih Roti Tawar");
                System.out.println("Varian 1");
                System.out.println("Varian 2");
                int pilihan3 = input.nextInt();
                switch(pilihan3){
                    case 1:
                    System.out.println("Coklat");
                    case 2:
                    System.out.println("Keju");
                }
                break;
            case 3:
                System.out.println("Anda memilih Pizza");
                System.out.println("Varian 1");
                int pilihan4 = input.nextInt();
                switch(pilihan4){
                    case 1:
                    System.out.println("Keju");
                    System.out.println("Sosis");
                    System.out.println("Smoked Beef");
                    System.out.println("Bombay");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
