package Helpers;

import Models.Customer;
import Models.Game;

public interface SellerService {
    void sell(Game game, Customer customer);
    void createGame(Game game,Customer customer);
}