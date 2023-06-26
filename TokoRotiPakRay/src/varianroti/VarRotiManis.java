package varianroti;

import tokoroti.ToppingFilling;
import tokoroti.RotiManis;

public class VarRotiManis extends RotiManis implements ToppingFilling {
	public double RotiManisvar1() {

	double HargaTopFillKejuVar1 = (BeratKeju/5 * HargaKeju);
	double HargaTopFillCoklatVar1 = (BeratCoklat/10 * HargaCoklat);
	
	double HargaVar1RotiManis = HargaRomanPCSBulat + (HargaTopFillCoklatVar1 + HargaTopFillKejuVar1);
	return HargaVar1RotiManis;

	}
}