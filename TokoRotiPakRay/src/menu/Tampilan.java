package menu;

import java.util.Scanner;
import varianroti.VarRotiTawar;
import varianroti.VarRotiManis;
import varianroti.VarPizza;

public class Tampilan  {
	
    public static void main(String[] args) {
    	Tampilan Tampilanawal = new Tampilan();
    	Tampilanawal.Tampilansatu();
    	
    	Tampilan Tampilanakhir = new Tampilan();
    	Tampilanakhir.Tampilandua();
    
    }
    
    VarRotiManis Roman1 = new VarRotiManis();
    VarRotiTawar Rowar1 = new VarRotiTawar();
    VarPizza Pizza1 = new VarPizza();
    
    public void Tampilansatu() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Toko Roti PakRay");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Etalase Roti:");
        System.out.println("1. Roti Manis Varian 1 Isian Keju Coklat: Rp." + Roman1.RotiManisvar1());
        System.out.println("2. Roti Manis Varian 2 Isian Red Bean dan Vanilla : Rp." + Roman1.RotiManisvar2());
        System.out.println("3. Roti Manis Varian 3 Isian Keju dan Sosis : Rp." + Roman1.RotiManisvar3());
        System.out.println("4. Roti Tawar Varian 1 Isian Coklat : Rp." + Rowar1.RotiTawarvar1());
        System.out.println("5. Roti Tawar Varian 2 Isian Keju : Rp." + Rowar1.RotiTawarVar2());
        System.out.println("6. Pizza Dengan Isian Keju, Sosis, Smoked Beed dan Bawang Bombay : Rp." + Pizza1.HargaPizzaVar1());
        System.out.println("--------------------------------------------------------------------------------------");
    }    
    
    	public void Tampilandua() {
	    		Scanner input = new Scanner(System.in);
	
	    		while (true) {
		            System.out.println("-------------------------");
		            System.out.println("Toko Roti PakRay");
		            System.out.println("-------------------------");
		            System.out.println("Pilihan Jenis Roti:");
		            System.out.println("1. Roti Manis ");
		            System.out.println("2. Roti Tawar");
		            System.out.println("3. Pizza");
		            System.out.println("4. keluar");
		            System.out.println("-------------------------");
		            System.out.println("Pilihan Anda:");
	
		            int pilihan = input.nextInt();
	
		            if (pilihan == 1) {
	                System.out.println("Anda memilih Roti Manis");
	                System.out.println("Varian 1 Isian Keju Coklat");
	                System.out.println("Varian 2 Isian Red Bean dan Vanilla");
	                System.out.println("Varian 3 Isian Keju dan Sosis");
	                System.out.print("Pilihan Anda : ");
	                int rotimanis = input.nextInt();
		                if (rotimanis == 1) {
		                	double orderromanvar1 = input.nextInt();
		                	double hargaorderromanvar1 = orderromanvar1 * Roman1.RotiManisvar1();
		                	System.out.println("Total Harga Order Pesanan Roti Manis Varian ! : Rp." +hargaorderromanvar1);
		                    Tampilandua();
		                    break;
		                } else if (rotimanis == 2) {
		                    System.out.println("Read Bean");
		                	double orderromanvar2 = input.nextInt();
		                	double hargaorderromanvar2 = orderromanvar2 * Roman1.RotiManisvar2();
		                    Tampilandua();
		                    break;
		                } else if (rotimanis == 3) {
		                    System.out.println("Keju");
		                	int orderromanvar3 = input.nextInt();
		                	double hargaorderromanvar3 = orderromanvar3 * Roman1.RotiManisvar3();
		                    Tampilandua();
		                    break;
		                } else {
		                    System.out.println("Pilihan tidak valid");
		                    Tampilandua();
		                    break;
		                    
		                }
	            } else if (pilihan == 2) {
	                System.out.println("Anda memilih Roti Tawar");
	                System.out.println("Varian 1");
	                System.out.println("Varian 2");
	                int rotitawar = input.nextInt();
		                if (rotitawar == 1) {
		                	int orderrowarvar1 = input.nextInt();
		                    System.out.println("Coklat");
		                } else if (rotitawar == 2) {
		                	int orderrowarvar2 = input.nextInt();
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
