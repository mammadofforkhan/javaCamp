package Helpers;

import Models.Customer;
import Models.Game;

public interface CampaignService {
    void create(Game game, Customer customer) throws Exception;
    void update(Game game, Customer customer);
    void delete(Game game,Customer customer);
}
