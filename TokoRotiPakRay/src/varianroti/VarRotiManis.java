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
	
	public double RotiManisvar2() {

	double HargaTopFillRedBeanVar2 = (10 / BeratSelairedbean * HargaSelairedbean); 
	double HargaTopFillVanillaVar2 = (5 / BeratKrimvanilla * HargaKrimvanilla);
	
	double HargaVar2RotiManis = HargaRotiManisPCS() + (HargaTopFillRedBeanVar2 + HargaTopFillVanillaVar2);
	double HargaFinalVar2Roman = (Math.ceil((HargaVar2RotiManis * 1.4) /100) *100);

	return HargaFinalVar2Roman;
}
	
}