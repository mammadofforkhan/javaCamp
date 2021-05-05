package Statics;

import Models.Customer;
import Models.Game;

public class Utils {

	public static boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalIdentity().length() == 11;
	}
	public static double priceAfterDiscount(Game game) {
		// TODO Auto-generated method stub
		return game.getPrice() - (game.getPrice() * game.getDiscount()) / 100;
	}
}
