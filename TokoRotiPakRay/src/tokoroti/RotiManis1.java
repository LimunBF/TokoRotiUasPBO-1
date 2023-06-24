package tokoroti;

	public class RotiManis1 extends HargaBahan {

	    // Variables for 1 batch of Roti Tawar ingredients
	    private float Tepungterigu = 1000;
	    private float Gulapasir = 125;
	    private float Butter = 100;
	    private float Ragi = 20;
	    private float Susububuk = 250;
	    private float Susucair = 200;
	    private float Telur = 70;
	    private float Esbatu = 300;

	    // Variables for purchasing RotiTawar ingredients
	    private float pcsTepungterigu = 0;
	    private float pcsGulapasir = 0;
	    private float pcsButter = 0;
	    private float pcsRagi = 0;
	    private float pcsSusububuk = 0;
	    private float pcsSusucair = 0;
	    private float pcsTelur = 0;
	    private float pcsEsbatu = 0;

	    // Variables for prices
	    private float hargaRowarTepung;
	    private float hargaRowargula;
	    private float hargaRowarbutter;
	    private float hargaRowarragi;
	    private float hargaRowarsusububuk;
	    private float hargaRowarsusucair;
	    private float hargaRowartelur;
	    private float hargaRowaresbatu;
	    private int BanyakRotiSatuAdonan = 50;
	    public float HargaRoWarPCS;

	    public void adonanRotiTawar() {
	        pcsTepungterigu = Tepungterigu / beratTepungterigu();
	        pcsGulapasir = Gulapasir / beratGulapasir();
	        pcsButter = Butter / beratButter();
	        pcsRagi = Ragi / beratRagi();
	        pcsSusububuk = Susububuk / beratSusububuk();
	        pcsSusucair = Susucair / beratSusucair();
	        pcsTelur = Telur / beratTelur();
	        pcsEsbatu = Esbatu / beratEsbatu();
	    }

	    // Calculate prices for each ingredient
	    private float HargaTepung() {
	        hargaRowarTepung = pcsTepungterigu * hargaTepungterigu();
	        return hargaRowarTepung;
	    }

	    private float HargaGula() {
	        hargaRowargula = pcsGulapasir * hargaGulapasir();
	        return hargaRowargula;
	    }

	    private float HargaButter() {
	        hargaRowarbutter = pcsButter * hargaButter();
	        return hargaRowarbutter;
	    }

	    private float HargaRagi() {
	        hargaRowarragi = pcsRagi * hargaRagi();
	        return hargaRowarragi;
	    }

	    private float HargaSusububuk() {
	        hargaRowarsusububuk = pcsSusububuk * hargaSusububuk();
	        return hargaRowarsusububuk;
	    }

	    private float HargaSusucair() {
	        hargaRowarsusucair = pcsSusucair * hargaSusucair();
	        return hargaRowarsusucair;
	    }

	    private float HargaTelur() {
	        hargaRowartelur = pcsTelur * hargaTelur();
	        return hargaRowartelur;
	    }

	    private float HargaEsbatu() {
	        hargaRowaresbatu = pcsEsbatu * hargaEsbatu();
	        return hargaRowaresbatu;
	    }

	    // Calculate price per piece of Roti Tawar
	    public void HargaRotiTawarPCS() {
	        adonanRotiTawar(); // Calculate the ingredient quantities first
	        HargaTepung();
	        HargaGula();
	        HargaButter();
	        HargaRagi();
	        HargaSusububuk();
	        HargaSusucair();
	        HargaTelur();
	        HargaEsbatu();

	        // Calculate the price per piece of Roti Tawar
	        float HargaAdonanRowar = hargaRowarTepung + hargaRowargula + hargaRowarragi + hargaRowarbutter + hargaRowarsusububuk + hargaRowarsusucair + hargaRowartelur + hargaRowaresbatu;
	        float HargaRoWarPCS = HargaAdonanRowar / BanyakRotiSatuAdonan;
	        System.out.println("Harga Per-pcs Roti Tawar = " + HargaRoWarPCS);
	    }

	    public float getHargaRowarPCS() {
	        return HargaRoWarPCS; // Use the correct variable name
	    }

	    // Placeholder methods for hargaTepungterigu(), hargaGulapasir(), and other similar methods
	    public float hargaTepungterigu() {
	        // Replace with the actual implementation of hargaTepungterigu()
	        return 40000;
	    }

	    public float hargaGulapasir() {
	        // Replace with the actual implementation of hargaGulapasir()
	        return 25000;
	    }

	    public float hargaButter() {
	        // Replace with the actual implementation of hargaButter()
	        return 23000;
	    }

	    public float hargaRagi() {
	        // Replace with the actual implementation of hargaRagi()
	        return 5000;
	    }

	    public float hargaSusububuk() {
	        // Replace with the actual implementation of hargaSusububuk()
	        return 39000;
	    }

	    public float hargaSusucair() {
	        // Replace with the actual implementation of hargaSusucair()
	        return 24000;
	    }

	    public float hargaTelur() {
	        // Replace with the actual implementation of hargaTelur()
	        return 23000;
	    }

	    public float hargaEsbatu() {
	        // Replace with the actual implementation of hargaEsbatu()
	        return 2000;
	    }
	}

