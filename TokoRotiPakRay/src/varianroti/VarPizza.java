package varianroti;

import tokoroti.ToppingFilling;
import tokoroti.Pizza;

public class VarPizza extends Pizza implements ToppingFilling {
	
	public double HargaPizzaVar1() {

		double HargaTopFillKejuPizzaVar1 = (30/BeratKeju * HargaKeju);
		double HargaTopFillSosisPizzaVar1 = (50/BeratSosis * HargaSosis);
		double HargaSmokedbeefPizzaVar1 = (50/BeratSmokedbeef *HargaSmokedbeef);
		double HargaBawangbombayPizzaVar1 = (30/BeratBawangbombay * HargaBawangbombay);
	
		double HargaVar1Pizza = Math.ceil( (HargaPizzaPCS() + (HargaTopFillKejuPizzaVar1 + HargaTopFillSosisPizzaVar1 + HargaSmokedbeefPizzaVar1 + HargaBawangbombayPizzaVar1)) /100)*100;
		return HargaVar1Pizza;
	}
}