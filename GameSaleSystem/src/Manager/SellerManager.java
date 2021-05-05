package Manager;

import Helpers.BaseSellerManager;
import Models.Customer;
import Models.Game;
import Statics.SellerServiceStatic;

public class SellerManager extends BaseSellerManager  {
	 SellerServiceStatic sellerServiceStatic;

	public SellerManager(SellerServiceStatic sellerServiceStatic) {
	this.sellerServiceStatic = sellerServiceStatic;
	}

	@Override
	public void sell(Game game, Customer customer) {
		game.setPrice(this.sellerServiceStatic.priceAfterDiscount(game));
		super.sell(game, customer);
	}
}
