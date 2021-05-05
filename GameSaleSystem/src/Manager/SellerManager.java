package Manager;

import Helpers.BaseSellerManager;
import Models.Customer;
import Models.Game;
import Statics.Utils;

public class SellerManager extends BaseSellerManager  {
	
	@Override
	public void sell(Game game, Customer customer) {
		game.setPrice(Utils.priceAfterDiscount(game));
		super.sell(game, customer);
	}
}
