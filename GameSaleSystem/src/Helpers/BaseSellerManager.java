package Helpers;

import Models.Customer;
import Models.Game;

public abstract class BaseSellerManager implements SellerService {
    @Override
    public void sell(Game game, Customer customer) {
        System.out.println(game.getGameName() + " adlı oyun " + customer.getFirstName() + " adlı kişiye "+game.getPrice() +" TL den satıldı!");
    }

    @Override
    public void createGame(Game game, Customer customer) {
        System.out.println(customer.getFirstName()+" : "+game.getGameName()+" adlı oyunu "+game.getPrice()+ " TL den satışa çıkardı!");
    }
}
