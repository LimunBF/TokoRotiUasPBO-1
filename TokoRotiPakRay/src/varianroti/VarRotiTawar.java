package varianroti;

import tokoroti.ToppingFilling;
import tokoroti.RotiTawar;

public class VarRotiTawar extends RotiTawar implements ToppingFilling {
	public double RotiTawarvar1() {
		double HargaTopFillKeju = (80/BeratKeju* HargaKeju);
		double HargaVar1Rowar = (Math.ceil((HargaRotiTawarPCS() + HargaTopFillKeju) /100) *100) ;
		return HargaVar1Rowar;
	}
	
	public double RotiTawarVar2() {
		double HargaTopfillCoklat = (80 / BeratCoklat * HargaCoklat);
		double HargaVar2Rowar = (Math.ceil((HargaRotiTawarPCS() + HargaTopfillCoklat) /100) * 100);
		return HargaVar2Rowar;
	}
}