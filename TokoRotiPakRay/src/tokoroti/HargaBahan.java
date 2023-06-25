package tokoroti;

abstract public class HargaBahan extends BeratBahanRoti{
	
	public float hargaTepungterigu() 
	{
		return 40_000;
	}
	public float hargaGulapasir() 
	{
		return 25_000;
	}
	public float hargaButter() 
	{
		return 23_000;
	}
	public float hargaRagi() 
	{
		return 5_000;
	}
	public float hargaSusububuk() 
	{
		return 39_000;
	}
	public float hargaSusucair() 
	{
		return 24_000;
	}
	public float hargaTelur() 
	{
		return 23_000;
	}
	public float hargaEsbatu() 
	{
		return 2_000;
	}
	
    abstract protected double Tepungterigu();
    abstract protected double Gulapasir();
    abstract protected double Butter();
    abstract protected double Ragi();
    abstract protected double Susububuk();
    abstract protected double Susucair();
    abstract protected double Telur();
    abstract protected double Esbatu();
    abstract protected double TotalAdonan();
    abstract protected double BeratRoti();
    
	

}
