package tokoroti;
public class RotiTawar extends HargaBahan {

	// Variables for 1 batch of Roti Tawar ingredients
	@Override
	protected double Tepungterigu() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	protected double Gulapasir() {
		// TODO Auto-generated method stub
		return 125;
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
		return 250;
	}

	@Override
	protected double Susucair() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	protected double Telur() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	protected double Esbatu() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	protected double TotalAdonan() {
		// TODO Auto-generated method stub
		return 2065;
	}
	@Override
	protected double BeratRoti() {
		return 400;
	}

	// Variables for purchasing RotiTawar ingredients
	private double pcsTepungterigu = 0;
	private double pcsGulapasir = 0;
	private double pcsButter = 0;
	private double pcsRagi = 0;
	private double pcsSusububuk = 0;
	private double pcsSusucair = 0;
	private double pcsTelur = 0;
	private double pcsEsbatu = 0;

	// Variables for prices
	private double hargaRowarTepung;
	private double hargaRowargula;
	private double hargaRowarbutter;
	private double hargaRowarragi;
	private double hargaRowarsusububuk;
	private double hargaRowarsusucair;
	private double hargaRowartelur;
	private double hargaRowaresbatu;
	private double BanyakRotiSatuAdonan;
	public double HargaRoWarPCS;

	//    public void adonanRotiTawar() {
	//        pcsTepungterigu = Tepungterigu / beratTepungterigu();
	//        pcsGulapasir = Gulapasir / beratGulapasir();
	//        pcsButter = Butter / beratButter();
	//        pcsRagi = Ragi / beratRagi();
	//        pcsSusububuk = Susububuk / beratSusububuk();
	//        pcsSusucair = Susucair / beratSusucair();
	//        pcsTelur = Telur / beratTelur();
	//        pcsEsbatu = Esbatu / beratEsbatu();
	//    }


	public void adonanRotiTawar()
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

	
    //Menghitung Banyak Roti per adonan
    private double BanyakRotiTawar() {
    	BanyakRotiSatuAdonan = TotalAdonan() / BeratRoti();
    	return BanyakRotiSatuAdonan;
    }
	// Calculate prices for each ingredient
    private double HargaAdonanRowar() {
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
	public void HargaRotiTawarPCS() {
		adonanRotiTawar(); // Calculate the ingredient quantities first
		BanyakRotiTawar();
		
		// Calculate the price per piece of Roti Tawar
		double HargaRoWarPCS = Math.ceil(HargaAdonanRowar() / BanyakRotiTawar());
		System.out.println("Harga Per-pcs Roti Tawar = " + HargaRoWarPCS);
		//        System.out.println("Harga Tepung Terigu = " + hargaRowarTepung);
	}
}


