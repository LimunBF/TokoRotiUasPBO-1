package menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import varianroti.VarRotiTawar;
import varianroti.VarRotiManis;
import varianroti.VarPizza;

public class Tampilan  {
	
    public static void main(String[] args) {
    	Tampilan Tampilanawal = new Tampilan();
    	Tampilanawal.Tampilansatu();

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
        Tampilandua();
    }    
    
    	public void Tampilandua() {
    		try {
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
		    		TimeUnit.SECONDS.sleep(1);
		            System.out.println("Pilihan Anda:");
		            int pilihan = input.nextInt();
		    		TimeUnit.SECONDS.sleep(1);
		            if (pilihan == 1) 
		            {		            	
		                System.out.println("Anda memilih Roti Manis");
		                System.out.println("Pilih Varian Roti Manis");
		                System.out.println("Ketik Dari Angka 1, 2, 3");
		                System.out.println("Varian 1 Isian Keju Coklat");
		                System.out.println("Varian 2 Isian Red Bean dan Vanilla");
		                System.out.println("Varian 3 Isian Keju dan Sosis");
		                System.out.println("Ketik 1, 2, atau 3 Untuk Memilih : ");
		                System.out.print("Pilihan Anda : ");
		                int rotimanis = input.nextInt();
			    		TimeUnit.SECONDS.sleep(1);
		                if (rotimanis == 1) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                	double order = input.nextInt();
		                    double hargaorderromanvar1 = order * Roman1.RotiManisvar1();
		                	System.out.println("Total Harga Order Pesanan Roti Manis Varian 1 : Rp." + hargaorderromanvar1);
		                	this.finalhargaorderRotiManisVar1 += order;
				    		TimeUnit.SECONDS.sleep(3);
				    		Tampilanlagi();
				    		break;
		                } else if (rotimanis == 2) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                	double order = input.nextInt();
		                	double hargaorderromanvar2 = order * Roman1.RotiManisvar2();
		                	System.out.println("Total Harga Order Pesanan Roti Manis Varian 2 : Rp." + hargaorderromanvar2);
		                	this.finalhargaorderRotiManisVar2 += order;
				    		TimeUnit.SECONDS.sleep(3);
				    		Tampilanlagi();
				    		break;
		                } else if (rotimanis == 3) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderromanvar3 = order * Roman1.RotiManisvar3();
		                	System.out.println("Total Harga Order Pesanan Roti Manis Varian 3 : Rp." + hargaorderromanvar3);
		                	this.finalhargaorderRotiManisVar3 += order;
				    		TimeUnit.SECONDS.sleep(3);
				    		Tampilanlagi();
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
	                System.out.println("Ketik 1 atau 2 Untuk Memilih : ");
	                int rotitawar = input.nextInt();
		                if (rotitawar == 1) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderrowarvar1 = order * Rowar1.RotiTawarvar1();
		                	System.out.println("Total Harga Order Pesanan Roti Tawar Varian 1 : Rp." + hargaorderrowarvar1);
		                	this.finalhargaorderRotiTawarVar1 += order;
				    		TimeUnit.SECONDS.sleep(3);
				    		Tampilanlagi();
				    		break;
		                } else if (rotitawar == 2) {
		                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
		                    int order = input.nextInt();
		                	double hargaorderrowarvar2 = order * Rowar1.RotiTawarVar2();
		                	System.out.println("Total Harga Order Pesanan Roti Tawar Varian 2 : Rp." + hargaorderrowarvar2);
		                	this.finalhargaorderRotiTawarVar2 += order;
				    		TimeUnit.SECONDS.sleep(3);
				    		Tampilanlagi();
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
		                System.out.println("Varian Pizza Isian Keju, Sosis, Smoked Beed dan Bawang Bombay");
		                System.out.println("Pilihan Anda");
		                System.out.println("Ketik 1 Untuk Memilih : ");
			    		TimeUnit.SECONDS.sleep(1);
		                int pizza = input.nextInt();
			                if (pizza == 1) {
			                    System.out.println("Berapa Banyak Yang Anda ingin Pesan : ");
			                    int order = input.nextInt();
			                    double hargaorderpizzavar1 = order * Pizza1.HargaPizzaVar1();
			                	System.out.println("Total Harga Order Pesanan Roti Pizza : Rp." + hargaorderpizzavar1);
			                    this.finalhargaorderPizzaVar1 += order;
					    		TimeUnit.SECONDS.sleep(1);
					    		Tampilanlagi();
					    		break;
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
		                System.out.println("--------------------------------------------------------------");
		            	System.out.println("Terima kasih!");
		            	System.out.println("Telah Memilih Toko Roti Pak Ray Sebagai Pilihan Bakery Anda");
		                System.out.println("--------------------------------------------------------------");
		            	break;
		            } 
		            else 
		            {
		            	System.out.println("Pilihan tidak valid");
	                    System.out.println("Kembali Ke Menu Pilihan");
	                    Tampilandua();
			    		TimeUnit.SECONDS.sleep(2);
			    		break;
		            }
	    		}
    	}
    		catch(InterruptedException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    	}
    	
    	
        public void Tampilantiga() {
        	try {
//    		Scanner input = new Scanner(System.in);
	    	TimeUnit.SECONDS.sleep(2);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Detail Total Orderan Yang Anda Pesan Adalah : ");
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Total Orderan Roti Manis Varian 1 : " + finalhargaorderRotiManisVar1);
            System.out.println("Total Orderan Roti Manis Varian 2 : " + finalhargaorderRotiManisVar2);
            System.out.println("Total Orderan Roti Manis Varian 3 : " + finalhargaorderRotiManisVar3);
            System.out.println("Total Orderan Roti Tawar Varian 1 : " + finalhargaorderRotiTawarVar1);
            System.out.println("Total Orderan Roti Tawar Varian 2 : " + finalhargaorderRotiTawarVar2);
            System.out.println("Total Orderan Roti Pizza Varian 1 : " + finalhargaorderPizzaVar1);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("1. Roti Manis Varian 1 : " + ((Math.ceil(Roman1.RotiManisvar1() * finalhargaorderRotiManisVar1)/500) *500));
            System.out.println("2. Roti Manis Varian 2 : " + ((Math.ceil(Roman1.RotiManisvar2() * finalhargaorderRotiManisVar2) / 500) *500));
            System.out.println("3. Roti Manis Varian 3 : " + ((Math.ceil(Roman1.RotiManisvar3() * finalhargaorderRotiManisVar3) / 500) *500));
            System.out.println("4. Roti Tawar Varian 1 : " + ((Math.ceil(Rowar1.RotiTawarvar1() * finalhargaorderRotiManisVar3) /500 ) * 500));
            System.out.println("5. Roti Tawar Varian 2 : " + ((Math.ceil(Rowar1.RotiTawarVar2() * finalhargaorderRotiTawarVar2) /500) *500));
            System.out.println("6. Roti Pizza Varian 1 : " + ((Math.ceil(Pizza1.HargaPizzaVar1() * finalhargaorderPizzaVar1) /500 ) * 500));
            System.out.println("-------------------------------------------------------------------------------------------------");
        	System.out.println("Terima kasih!");
        	System.out.println("Telah Memilih Toko Roti Pak Ray Sebagai Pilihan Bakery Anda");
            System.out.println("-------------------------------------------------------------------------------------------------");
        	}
        	catch(InterruptedException ex)
    		{
    			ex.printStackTrace();
    		}
        }
        
        public void Tampilanlagi( ) {
        	try {
        	while(true){
            System.out.println("---------------------------------------------------------------------------------");
        	System.out.println("Anda Telah Memilih Varian Roti Yang Anda Inginkan");
	    	TimeUnit.SECONDS.sleep(1);
        	System.out.println("Apakah Anda Ingin Memilih Varian Roti Lagi");
        	System.out.println("Ketik 'Ya' atau Ketik 1 Jika Ingin Melanjutkan");
        	System.out.println("Ketik 'Tidak' atau Ketik 2 Jika Tidak Ingin Melanjutkan dan Memunculkan Total Harga");
            System.out.println("---------------------------------------------------------------------------------");
        	Scanner jawab = new Scanner(System.in);
            String ans = jawab.next();
	    	TimeUnit.SECONDS.sleep(2);
        	if (ans.equals("1") || ans.equalsIgnoreCase("YA")) {
        		Tampilansatu();
        		break;
        	}        	
        	else if (ans.equals("2") || ans.equalsIgnoreCase("Tidak")) {
        		Tampilantiga();
        		break;
        	}
        	else {
                System.out.println("-----------------------------------");
        		System.out.println("Input Yang Anda Berikan Salah");
        		System.out.println("Mohon Input Kembali ");
                System.out.println("-----------------------------------");
                Tampilanlagi();
                break;
        	}
        	}
        	}
        	catch(InterruptedException ex)
    		{
    			ex.printStackTrace();
    		}
        }
}

