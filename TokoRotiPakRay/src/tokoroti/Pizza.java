package tokoroti;

public class Pizza {
	
	
	//Variabel Untuk Bahan 1 adonan Roti tawar
	protected int Tepungterigu = 1000;
	protected int Gulapasir = 100;
	protected int Butter = 100;
	protected int Ragi = 20;
	protected int Susububuk = 200;
	protected int Susucair = 180;
	protected int Telur = 50;
	protected int Esbatu = 300;
	
	//Variabel Untuk Pembelian Bahan RotiTawar
	protected int pcsTepungterigu = 0;
	protected int pcsGulapasir = 0;
	protected int pcsButter = 0;
	protected int pcsRagi = 0;
	protected int pcsSusububuk = 0;
	protected int pcsSusucair = 0;
	protected int pcsTelur = 0;
	protected int pcsEsbatu = 0;

	public void adonanRotiManis()
	{
		if (Tepungterigu == 1000) 
		{
			pcsTepungterigu =1;
		}
		if (Tepungterigu > 1000)
		{
			this.pcsTepungterigu = (this.Tepungterigu / 1000) *1; 
		}
		if (Gulapasir == 1000)  
		{
			pcsGulapasir = (1);
		}
		if (Gulapasir > 1000)
		{
			this.pcsGulapasir = (Gulapasir / 1000) *1;
		}
		if (Butter == 500) 
		{
			pcsButter = (1);
		}
		if (Butter > 500)
		{
			this.pcsButter = (Butter / 500) *1;
		}
		if (Ragi == 11) 
		{
			pcsRagi = 1;
		}
		if (Ragi > 11)
		{
			this.pcsRagi = (this.Ragi / 11 ) *1;
		}
		if (Susububuk == 1000) 
		{
			pcsSusububuk = 1;
		}
		if (Susububuk > 1000)
		{
			this.pcsSusububuk = (Susububuk / 1000) *1;
		}
		if (Susucair == 1000) 
		{
			pcsSusucair = (1);
		}
		if (Susucair > 1000)
		{
			this.pcsSusucair = Susucair / 500 *1;
		}
		if (Telur == 1000) 
		{
			pcsTelur = (1);
		}
		if (Telur > 1000)
		{
			this.pcsTelur = Telur / 1000 *1;
		}
		if (Esbatu == 1000) 
		{
			pcsEsbatu = (1);
		}
		if (Telur > 1000)
		{
			this.pcsEsbatu = Esbatu / 1000 *1;
		}
		
	}
}
