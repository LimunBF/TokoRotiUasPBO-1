package varianroti;

import tokoroti.ToppingFilling;
import tokoroti.RotiManis;

public class VarRotiManis extends RotiManis implements ToppingFilling {
	public double RotiManisvar1() {

	double HargaTopFillKejuVar1 = (5 / BeratKeju * HargaKeju);
	double HargaTopFillCoklatVar1 = (10 / BeratCoklat * HargaCoklat);
	
	double HargaVar1RotiManis = HargaRotiManisPCS() + (HargaTopFillCoklatVar1 + HargaTopFillKejuVar1);
	double HargaFinalVar1Roman = (Math.ceil((HargaVar1RotiManis * 1.4) /100 ) * 100);
//	System.out.println("Harga Topfill " + HargaTopFillCoklatVar1);
//	System.out.println("Harga Topfill " + HargaRotiManisPCS());
	return HargaFinalVar1Roman;
	}
	
	
}