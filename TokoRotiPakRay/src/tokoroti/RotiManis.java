package tokoroti;

public class RotiManis extends HargaBahan{
	
	
    // Variables for 1 batch of Roti Tawar ingredients
	@Override
	protected double Tepungterigu() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	protected double Gulapasir() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	protected double Butter() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	protected double Ragi() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	protected double Susububuk() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	protected double Susucair() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	protected double Telur() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	protected double Esbatu() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	protected double TotalAdonanRoman() {
		// TODO Auto-generated method stub
		return 2350;
	}
  
    // Variables for purchasing Roti Manis ingredients
    private double pcsTepungterigu = 0;
    private double pcsGulapasir = 0;
    private double pcsButter = 0;
    private double pcsRagi = 0;
    private double pcsSusububuk = 0;
    private double pcsSusucair = 0;
    private double pcsTelur = 0;
    private double pcsEsbatu = 0;

    // Variables for prices
    private double hargaRomanTepung;
    private double hargaRomangula;
    private double hargaRomanbutter;
    private double hargaRomanragi;
    private double hargaRomansusububuk;
    private double hargaRomansusucair;
    private double hargaRomantelur;
    private double hargaRomanesbatu;
    private double BanyakRotiSatuAdonan = 50;
    public double HargaRomanPCS;

    public void adonanRotiManis() {
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
    			pcsButter =  1;
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

    // Calculate prices for each ingredient
    private double HargaAdonanRoman() {
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
    	

    // Calculate price per piece of Roti Tawar
    public void HargaRotiManisPCS() {
        adonanRotiManis(); // Calculate the ingredient quantities first

        // Calculate the price per piece of Roti Tawar
        double HargaRomanPCS = HargaAdonanRoman() / BanyakRotiSatuAdonan;
        System.out.println("Harga Per-pcs Roti Manis = " + HargaRomanPCS);
//        System.out.println("Harga Ragi : " + pcsRagi);
   }
}