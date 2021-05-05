package Manager;

import Helpers.BaseCampaignManager;
import Models.Customer;
import Models.Game;
import Statics.SellerServiceStatic;

public class CampaignManager extends BaseCampaignManager {
SellerServiceStatic sellerServiceStatic;
public CampaignManager(SellerServiceStatic sellerServiceStatic) {
	
	this.sellerServiceStatic = sellerServiceStatic;
}

@Override
public void update(Game game, Customer customer) {
	// TODO Auto-generated method stub
	super.update(game, customer);
}


}
