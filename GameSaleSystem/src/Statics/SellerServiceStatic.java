package Statics;

import Helpers.SellerCampaignService;
import Models.Game;

public class SellerServiceStatic implements SellerCampaignService {

	@Override
	public double priceAfterDiscount(Game game) {
		// TODO Auto-generated method stub
		return game.getPrice() - (game.getPrice() * game.getDiscount()) / 100;
	}

}
