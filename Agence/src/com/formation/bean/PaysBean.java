package com.formation.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.formation.domain.Pays;
import com.formation.domain.Hotel;

@ManagedBean
public class PaysBean {

	@PostConstruct
	public void init() {
		Pays eth = new Pays();
		eth.setNom("Ethiopie");
		List<Hotel> leshotelsEth = new ArrayList<Hotel>();
		leshotelsEth.add(new Hotel("Le JAfar", 58, 3));
		leshotelsEth.add(new Hotel(" La Cabro d'Or", 250, 5));
		leshotelsEth.add(new Hotel("Golden Tulip", 180, 4));
		leshotelsEth.add(new Hotel("le Repair du Geologue", 58, 3));
		leshotelsEth.add(new Hotel("Hera Addis", 235, 5));
		eth.setHostels(leshotelsEth);

		Pays ca = new Pays();
		ca.setNom("Canada");
		List<Hotel> leshotelsca = new ArrayList<Hotel>();
		leshotelsca.add(new Hotel("L'hotel de Glace", 58, 3));
		leshotelsca.add(new Hotel("Yukon", 250, 5));
		leshotelsca.add(new Hotel("Fairmont Banff Springs", 180, 4));
		leshotelsca.add(new Hotel("400 Sherbrooke Ouest", 58, 3));
		leshotelsca.add(new Hotel("Château Frontenac", 235, 5));
		ca.setHostels(leshotelsca);
		
		
		Pays tha = new Pays();
		tha.setNom("Thailande");
		List<Hotel> leshotelstha = new ArrayList<Hotel>();
		leshotelstha.add(new Hotel("Amanpuri", 58, 3));
		leshotelstha.add(new Hotel("Royal Cliff Hotels Group", 250, 5));
		leshotelstha.add(new Hotel("Baiyoke Tower II", 280, 4));
		leshotelstha.add(new Hotel("Mut Mee Guesthouse", 58, 3));
		leshotelstha.add(new Hotel("Cape Panwa", 235, 5));
		tha.setHostels(leshotelstha);
		
		
		Pays gre = new Pays();
		gre.setNom("Grèce");
		List<Hotel> leshotelsgre = new ArrayList<Hotel>();
		leshotelsgre.add(new Hotel("Hôtel Grande-Bretagne", 58, 3));
		leshotelsgre.add(new Hotel("Chersónissos", 250, 5));
		leshotelsgre.add(new Hotel("Monastiráki", 180, 4));
		leshotelsgre.add(new Hotel("Mylopotas", 58, 3));
		leshotelsgre.add(new Hotel("bisou", 235, 5));
		gre.setHostels(leshotelsgre);

		Pays mex = new Pays();
		mex.setNom("Mexique");
		List<Hotel> leshotelsmex = new ArrayList<Hotel>();
		leshotelsmex.add(new Hotel("Le JAfar", 58, 3));
		leshotelsmex.add(new Hotel(" La Cabro d'Or", 250, 5));
		leshotelsmex.add(new Hotel("Golden Tulip", 180, 4));
		leshotelsmex.add(new Hotel("le Repair du Geologue", 58, 3));
		leshotelsmex.add(new Hotel("Hera Addis", 235, 5));
		mex.setHostels(leshotelsmex);
	}

	public void selection (){
	   ArrayList<String> hotels = new ArrayList<String>();
        for (int i = 1; i <= 14; i++) {
            hotels.add("voyage" + i + ".jpg");
        
        }
	}
}
