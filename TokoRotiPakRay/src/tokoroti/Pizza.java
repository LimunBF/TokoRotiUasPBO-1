package tokoroti;

public class Pizza extends HargaBahan{
	
	@Override
	protected double Tepungterigu() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	protected double Gulapasir() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	protected double Butter() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	protected double Ragi() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	protected double Susububuk() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	protected double Susucair() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	protected double Telur() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	protected double Esbatu() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	protected double TotalAdonan() {
		// TODO Auto-generated method stub
		return 1950;
	}
	@Override
	protected double BeratRoti() {
		return 190;
	}
	
	//Variabel Untuk Pembelian Bahan RotiTawar
    private double pcsTepungterigu = 0;
    private double pcsGulapasir = 0;
    private double pcsButter = 0;
    private double pcsRagi = 0;
    private double pcsSusububuk = 0;
    private double pcsSusucair = 0;
    private double pcsTelur = 0;
    private double pcsEsbatu = 0;

    // Variables for prices
    private double hargaPizzaTepung;
    private double hargaPizzagula;
    private double hargaPizzabutter;
    private double hargaPizzaragi;
    private double hargaPizzasusububuk;
    private double hargaPizzasusucair;
    private double hargaPizzatelur;
    private double hargaPizzaesbatu;
    private double BanyakRotiSatuAdonan;

    public void adonanPizza() {
    	{
    		if (Tepungterigu() <= 1000){
    			pcsTepungterigu = 1;
    		}
    		else if(Tepungterigu() > 1000) {
    			pcsTepungterigu = Math.ceil((Tepungterigu() / 1000 ) *1);
    		}
    		if (Gulapasir() <= 1000) {
    			pcsGulapasir = 1;
    		}
    		else if(Gulapasir() > 1000) {
    			pcsGulapasir = Math.ceil((Gulapasir() / 1000) * 1);
    		}
    		if (Butter() <= 500) {
    			pcsButter = 1;
    		}
    		else if(Butter() >500) {
    			pcsButter = Math.ceil((Butter() / 500) * 1);
    		}
    		if (Ragi() <= 11) {
    			pcsRagi = 1;
    		}
    		else if(Ragi() > 11) {
    			pcsRagi = Math.ceil((Ragi() / 11) *1);
    		}
    		if (Susububuk() <= 1000) {
    			pcsSusububuk = 1;
    		}
    		else if(Susububuk() > 1000) {
    			pcsSusububuk = Math.ceil((Susububuk() / 1000) *1);
    		}
    		if (Susucair() <= 1000) {
    			pcsSusucair = 1;
    		}
    		else if(Susucair() > 1000) {
    			pcsSusucair = Math.ceil((Susucair() / 1000) *1);
    		}
    		if (Telur() <= 1000) {
    			pcsTelur = 1;
    		}
    		else if(Telur() > 1000) {
    			pcsTelur = Math.ceil((Telur() / 1000)*1);
    		}
    		if(Esbatu() <=1000) {
    			pcsEsbatu = 1;
    		}
    		else if(Esbatu() >1000) {
    			pcsEsbatu = Math.ceil((Esbatu() /1000) *1);
    		}
    	}
    }
    
    private double HargaAdonanPizza() {
        double TotalHarga = (pcsTepungterigu * hargaTepungterigu())
                + (pcsGulapasir * hargaGulapasir())
                + (pcsButter * hargaButter())
                + (pcsRagi * hargaRagi())
                + (pcsSusububuk * hargaSusububuk())
                + (pcsSusucair * hargaSusucair())
                + (pcsTelur * hargaTelur())
                + (pcsEsbatu * hargaEsbatu());
        return TotalHarga;
    }
    
    //Menghitung Banyak Roti per adonan
    private double BanyakPizza() {
    	BanyakRotiSatuAdonan = Math.ceil(TotalAdonan() / BeratRoti());
    	return BanyakRotiSatuAdonan;
    }
    	
    // Calculate price per piece of Roti Tawar
    public double HargaPizzaPCS() {
        adonanPizza(); // Calculate the ingredient quantities first
        BanyakPizza();
        
        //Menghitung Harga Pizza per-pcs
        double HargaPizzaPCS = (HargaAdonanPizza() / BanyakPizza());
        double HargaPizzaPCSBulat = (Math.ceil(HargaPizzaPCS / 500) *500);
        return HargaPizzaPCSBulat;
//        System.out.println("Tepung = " + hargaPizzaTepung);
//        System.out.println("Gula = " + hargaPizzagula);
//        System.out.println("Butter = " + hargaPizzabutter);
//        System.out.println("Ragi = " + hargaPizzaragi);
//        System.out.println("SusuBubuk = " + hargaPizzasusububuk);
//        System.out.println("SusuCair = " + hargaPizzasusucair);
//        System.out.println("Telur = " + hargaPizzatelur);
//        System.out.println("EsBatu = " + hargaPizzaesbatu);
        
   }
}