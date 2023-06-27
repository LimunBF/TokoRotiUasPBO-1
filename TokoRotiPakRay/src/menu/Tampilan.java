package menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import varianroti.VarRotiTawar;
import varianroti.VarRotiManis;
import varianroti.VarPizza;

public class Tampilan  {
	
    public static void main(String[] args) {
//    	Tampilan Tampilanawal = new Tampilan();
//    	Tampilanawal.Tampilansatu();
//    	
//    	Tampilan Tampilanakhir = new Tampilan();
//    	Tampilanakhir.Tampilandua();
    	
    	Tampilan Tampilanakhirakhir = new Tampilan();
    	Tampilanakhirakhir.Tampilantiga();
    }
    
    private static float finalhargaorderRotiManisVar1;
    private static float finalhargaorderRotiManisVar2;
    private static float finalhargaorderRotiManisVar3;
    private static float finalhargaorderRotiTawarVar1;
    private static float finalhargaorderRotiTawarVar2;
    private static float finalhargaorderPizzaVar1
    ;
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
    		try {
	    		Scanner input = new Scanner(System.in);
	    		while (true) {
		            System.out.println("-------------------------");
		            System.out.println("Toko Roti PakRay");
		            System.out.println("-------------------------");
//		    		TimeUnit.SECONDS.sleep(1);
		            System.out.println("Pilihan Jenis Roti:");
		            System.out.println("1. Roti Manis ");
		            System.out.println("2. Roti Tawar");
		            System.out.println("3. Pizza");
		            System.out.println("4. keluar");
		            System.out.println("-------------------------");
		    		TimeUnit.SECONDS.sleep(1);
		            System.out.println("Pilihan Anda:");
		            int pilihan = input.nextInt();
		    		TimeUnit.SECONDS.sleep(1);
		            if (pilihan == 1) 
		            {		            	
		                System.out.println("Anda memilih Roti Manis");
		                System.out.println("Varian 1 Isian Keju Coklat");
		                System.out.println("Varian 2 Isian Red Bean dan Vanilla");
		                System.out.println("Varian 3 Isian Keju dan Sosis");
		                System.out.print("Pilihan Anda : ");
		                int rotimanis = input.nextInt();
			    		TimeUnit.SECONDS.sleep(1);
		                if (rotimanis == 1) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                	double order = input.nextInt();
		                    double hargaorderromanvar1 = order * Roman1.RotiManisvar1();
		                	System.out.println("Total Harga Order Pesanan Roti Manis Varian ! : Rp." + hargaorderromanvar1);
		                	this.finalhargaorderRotiManisVar1 += order;
				    		TimeUnit.SECONDS.sleep(3);
		                    Tampilandua();
		                    break;
		                } else if (rotimanis == 2) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                	double order = input.nextInt();
		                	double hargaorderromanvar2 = order * Roman1.RotiManisvar2();
		                	this.finalhargaorderRotiManisVar2 += order;
				    		TimeUnit.SECONDS.sleep(3);
		                    Tampilandua();
		                    break;
		                } else if (rotimanis == 3) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderromanvar3 = order * Roman1.RotiManisvar3();
		                	this.finalhargaorderRotiManisVar3 += order;
				    		TimeUnit.SECONDS.sleep(3);
		                    Tampilandua();
		                    break;
		                } else {
		                    System.out.println("Pilihan tidak valid");
		                    System.out.println("Kembali Ke Menu Pilihan");
				    		TimeUnit.SECONDS.sleep(1);
		                    Tampilandua();
		                    break;
		                }
	            } 
		            else if (pilihan == 2) 
		            {
	                System.out.println("Anda memilih Roti Tawar");
	                System.out.println("Varian 1 Isian Coklat ");
	                System.out.println("Varian 2 Isian Keju ");
	                int rotitawar = input.nextInt();
		                if (rotitawar == 1) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderrowarvar1 = order * Rowar1.RotiTawarvar1();
		                	this.finalhargaorderRotiTawarVar1 += order;
				    		TimeUnit.SECONDS.sleep(3);
		                    Tampilandua();
		                    break;
		                } else if (rotitawar == 2) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderrowarvar2 = order * Rowar1.RotiTawarVar2();
		                	this.finalhargaorderRotiTawarVar2 += order;
				    		TimeUnit.SECONDS.sleep(3);
		                    Tampilandua();
		                    break;
		                } else {
		                    System.out.println("Pilihan tidak valid");
		                    System.out.println("Kembali Ke Menu Pilihan");
				    		TimeUnit.SECONDS.sleep(1);
		                    Tampilandua();
		                    break;
		                }
		            } 
		            else if (pilihan == 3) 
		            {
		                System.out.println("Anda memilih Pizza");
		                System.out.println("Pizza Hanya Memiliki 1 Varian Saja");
		                System.out.println("Varian 1  Isian Keju, Sosis, Smoked Beed dan Bawang Bombay");
		                System.out.println("Pilihan Anda : \n ");
			    		TimeUnit.SECONDS.sleep(1);
		                int pizza = input.nextInt();
			                if (pizza == 1) {
			                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
			                    int order = input.nextInt();
			                    double hargaorderpizzavar1 = order * Pizza1.HargaPizzaVar1();
			                    this.finalhargaorderPizzaVar1 += order;
					    		TimeUnit.SECONDS.sleep(1);
			                } else {
			                    System.out.println("Pilihan tidak valid");
			                    System.out.println("Kembali Ke Menu Pilihan");
					    		TimeUnit.SECONDS.sleep(1);
			                    Tampilandua();
			                    break;
			                }
		            } 
		            else if (pilihan == 4) 
		            {
		            	System.out.println("Terima kasih!");
		            	break;
		            } 
		            else 
		            {
		            	System.out.println();
		            	System.out.println("Pilihan tidak valid");
		            }
	    		}
	            System.out.println("--------------------------------------------------------------------------------------");
	            System.out.println("Total Orderan Yang Anda Pesan Adalah : ");
	            System.out.println("--------------------------------------------------------------------------------------");
	            System.out.println("1. Roti Manis Varian 1 : "  );
    	}
    		catch(InterruptedException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    	}
    	
    	
        public void Tampilantiga() {
    		Scanner input = new Scanner(System.in);
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Detail Total Orderan Yang Anda Pesan Adalah : ");
            System.out.println("--------------------------------------------------------------------------------------");
            int order = input.nextInt();
            double hargaorderpizzavar1 = order * Pizza1.HargaPizzaVar1();
            this.finalhargaorderPizzaVar1 += order;
            this.finalhargaorderRotiTawarVar2 += order;
            System.out.println("1. Roti Manis Varian 1 : " + ((Math.ceil(Roman1.RotiManisvar1() * finalhargaorderRotiManisVar1)/500) *500));
            System.out.println("2. Roti Manis Varian 2 : " + ((Math.ceil(Roman1.RotiManisvar2() * finalhargaorderRotiManisVar2) / 500) *500));
            System.out.println("3. Roti Manis Varian 3 : " + ((Math.ceil(Roman1.RotiManisvar3() * finalhargaorderRotiManisVar3) / 500) *500));
            System.out.println("4. Roti Tawar Varian 1 : " + ((Math.ceil(Rowar1.RotiTawarvar1() * finalhargaorderRotiManisVar3) /500 ) * 500));
            System.out.println("5. Roti Tawar Varian 2 : " + ((Math.ceil(Rowar1.RotiTawarVar2() * finalhargaorderRotiTawarVar2) /500) *500));
            System.out.println("6. Roti Pizza Varian 1 : " + ((Math.ceil(Pizza1.HargaPizzaVar1() * finalhargaorderPizzaVar1) /500 ) * 500));

        }
}
