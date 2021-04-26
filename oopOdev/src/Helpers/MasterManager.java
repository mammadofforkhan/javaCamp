package Helpers;

import java.util.ArrayList;

import Models.Master;

public class MasterManager {
	
	ArrayList<Master> masters = new ArrayList<Master>();

	//Ogretmen ekleme
	
	public void add(Master master) {
	System.out.println(master.name+" isimli ogretmen basariyla eklendi");
	}
	//Toplu ogretmen ekleme;
	public void add(Master masters[]) {
		System.out.println("-------------------------");
		for (Master master : masters) {
			this.add(master);
			
		}
		System.out.println("Toplu sekilde Basariyla "+masters.length + " ogretmen eklendi");
	}
//Ogretmen silme
	public void delete(Master master) {
		System.out.println(master.name+" isimli ogretmen basariyla silindi");
	}

	//Tum ogretmenleri listeler
	
	public void getMasterList() {
		for (Master master : masters) {
			System.out.println("Id : " + master.id + " - Isim : " + master.name);
		}
	}

}
