package varianroti;

import tokoroti.ToppingFilling;
import tokoroti.Pizza;

public class VarPizza extends Pizza implements ToppingFilling {
	public double Pizza() {

	double HargaTopFillKeju = (30/BeratKeju * HargaKeju);
	double HargaTopFillSosis = (50/BeratSosis * HargaSosis);
    double HargaSmokedbeef = (50/BeratSmokedbeef *HargaSmokedbeef);
    double HargaBawangbombay = (30/BeratBawangbombay * HargaBawangbombay);
	
	double HargaVarPizza = HargaRomanPCSBulat + (HargaTopFillKeju + HargaTopFillSosis + HargaSmokedbeef + HargaBawangbombay);
	return HargaVarPizza;