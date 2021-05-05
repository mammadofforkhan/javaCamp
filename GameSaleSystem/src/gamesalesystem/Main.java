package gamesalesystem;

import java.sql.Date;

import Helpers.BaseCampaignManager;
import Helpers.BaseCustomerManager;
import Helpers.BaseSellerManager;
import Manager.CampaignManager;
import Manager.GamerManager;
import Manager.SellerManager;
import Models.Game;
import Models.Gamer;
import Models.Seller;
import Statics.EdevletServiceStatic;
import Statics.SellerServiceStatic;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager gamerManager = new GamerManager(new EdevletServiceStatic());

        BaseSellerManager sellerManager = new SellerManager(new SellerServiceStatic());

        BaseCampaignManager campaignManager = new CampaignManager(new SellerServiceStatic());

        Gamer gamer = new Gamer(
                1,
                "Orkhan",
                "Mammadov",
                new Date(1990, 07, 24),
                "orkhan@vox.az",
                "123321qq",
                "+99428273722"
        );

        Seller seller = new Seller(
                2,
                "Resul",
                "Babayev",
                new Date(1991, 06, 06),
                "babayev@vox.az",
                "123321qq",
                "+994503129312",
                "5555"
        );

        Game breathedge = new Game(
                1,
                "Breathedge",
                "Uzayda hayatta kalın! Ölümsüz tavuğunuzla birlikte, ani uzay gemisi kazanızın ardındaki gerçeği keşfedin. Enkazda hayatta kalmak ve keşfetmek için aletler, pilot araçlar ve hatta uzay istasyonlarını kontrol edin.",
                150,
                30
        );
        Game greedfall = new Game(
                2,
                "GreedFall",
                "Temel bir rol yapma deneyimine katılın ve sihirle dolu, zenginlikler, kayıp sırlar ve fantastik yaratıklarla dolu yeni bir dünyanın kaderini oluşturun. Diplomasi, aldatma ve güç kullanarak, yaşayan, gelişen bir dünyanın parçası olun - gidişatını etkileyin ve hikayenizi şekillendirin.",
                550,
                70
        );

        gamerManager.create(gamer);
        gamerManager.update(gamer);
        gamerManager.delete(gamer);

        System.out.println("\n--------------\n");

        sellerManager.sell(breathedge, gamer);
        sellerManager.createGame(greedfall, seller);

        System.out.println("\n--------------\n");

        campaignManager.create(greedfall,seller);
        campaignManager.update(greedfall,seller);
        campaignManager.delete(greedfall,seller);


	}

}
