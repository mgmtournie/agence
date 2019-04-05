package com.formation.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.domain.Hotel;

@ManagedBean(name = "hotelService")
@ApplicationScoped
public class HotelService {

	public List<Hotel> createHostelEth() {

		List<Hotel> leshotelsEth = new ArrayList<Hotel>();
		Hotel leshotelsEth1 = new Hotel("Le Jafar", 141, 4);
		Hotel leshotelsEth2 = new Hotel("La Cabro d'Or", 155, 5);
		Hotel leshotelsEth3 = new Hotel("Golden Tulip", 122, 4);
		Hotel leshotelsEth4 = new Hotel("le Repair du Geologue", 58, 3);
		Hotel leshotelsEth5 = new Hotel("Hera Addis", 235, 5);
		leshotelsEth.add(leshotelsEth1);
		leshotelsEth.add(leshotelsEth2);
		leshotelsEth.add(leshotelsEth3);
		leshotelsEth.add(leshotelsEth4);
		leshotelsEth.add(leshotelsEth5);

		return leshotelsEth;
	}

	public List<Hotel> createHostelCa() {
		List<Hotel> leshotelsca = new ArrayList<Hotel>();
		Hotel leshotelsca1 = new Hotel("L'hotel de Glace", 100, 5);
		Hotel leshotelsca2 = new Hotel("Yukon", 176, 2);
		Hotel leshotelsca3 = new Hotel("Fairmont Banff Springs", 180, 4);
		Hotel leshotelsca4 = new Hotel("400 Sherbrooke Ouest", 114, 2);
		Hotel leshotelsca5 = new Hotel("Château Frontenac", 460, 5);
		leshotelsca.add(leshotelsca1);
		leshotelsca.add(leshotelsca2);
		leshotelsca.add(leshotelsca3);
		leshotelsca.add(leshotelsca4);
		leshotelsca.add(leshotelsca5);
		return leshotelsca;
	}

	public List<Hotel> createHostelTha() {
		List<Hotel> leshotelstha = new ArrayList<Hotel>();
		Hotel leshotelstha1 = new Hotel("Amanpuri", 106, 3);
		Hotel leshotelstha2 = new Hotel("Royal Cliff Hotels Group", 250, 4);
		Hotel leshotelstha3 = new Hotel("Baiyoke Tower II", 142, 4);
		Hotel leshotelstha4 = new Hotel("Mut Mee Guesthouse", 95, 2);
		Hotel leshotelstha5 = new Hotel("Cape Panwa", 235, 5);
		leshotelstha.add(leshotelstha1);
		leshotelstha.add(leshotelstha2);
		leshotelstha.add(leshotelstha3);
		leshotelstha.add(leshotelstha4);
		leshotelstha.add(leshotelstha5);
		return leshotelstha;
	}

	public List<Hotel> createHostelGre() {
		List<Hotel> leshotelsgre = new ArrayList<Hotel>();
		Hotel leshotelsgre1 = new Hotel("Hôtel Grande-Bretagne", 106, 3);
		Hotel leshotelsgre2 = new Hotel("Chersónissos", 261, 5);
		Hotel leshotelsgre3 = new Hotel("Monastiráki", 245, 2);
		Hotel leshotelsgre4 = new Hotel("Mylopotas", 159, 3);
		Hotel leshotelsgre5 = new Hotel("Lykos", 114, 5);
		leshotelsgre.add(leshotelsgre1);
		leshotelsgre.add(leshotelsgre2);
		leshotelsgre.add(leshotelsgre3);
		leshotelsgre.add(leshotelsgre4);
		leshotelsgre.add(leshotelsgre5);
		return leshotelsgre;
	}

	public List<Hotel> createHostelMex() {
		List<Hotel> leshotelsmex = new ArrayList<Hotel>();
		Hotel leshotelsmex1 = new Hotel("La Casa del Mangle", 320, 3);
		Hotel leshotelsmex2 = new Hotel("The St. Regis Hotel", 548, 5);
		Hotel leshotelsmex3 = new Hotel("Rosewood Mayakoba", 219, 3);
		Hotel leshotelsmex4 = new Hotel("La Siesta", 314, 5);
		Hotel leshotelsmex5 = new Hotel("Speedy Gonzales", 132, 5);
		leshotelsmex.add(leshotelsmex1);
		leshotelsmex.add(leshotelsmex2);
		leshotelsmex.add(leshotelsmex3);
		leshotelsmex.add(leshotelsmex4);
		leshotelsmex.add(leshotelsmex5);
		return leshotelsmex;
	}
}
