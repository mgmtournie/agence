package com.formation.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import com.formation.bean.HotelService;
import com.formation.domain.Hotel;

@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Hotel> hotelsCa;
	private List<Hotel> hotelsMex;
	private List<Hotel> hotelsTha;
	private List<Hotel> hotelsEth;
	private List<Hotel> hotelsGre;
	
    private Hotel selectedHotelCa;
    private Hotel selectedHotelMex;
    private Hotel selectedHotelTha;
    private Hotel selectedHotelEth;
    private Hotel selectedHotelGre;
  
    
    @ManagedProperty("#{hotelService}")
    private HotelService service;
     
    @PostConstruct
    public void init() {
        hotelsMex = service.createHostelMex();
        hotelsCa = service.createHostelCa();
        hotelsTha = service.createHostelTha();
        hotelsEth = service.createHostelEth();
        hotelsGre = service.createHostelGre();
    }

    public void bingo(){
    	System.out.println(selectedHotelCa.getNomHotel());
    }
    
    public void bingoMex(){
    	System.out.println(selectedHotelMex.getNomHotel());
    }
    public void bingoTha(){
    	System.out.println(selectedHotelTha.getNomHotel());
    }
    public void bingoEth(){
    	System.out.println(selectedHotelEth.getNomHotel());
    }
    public void bingoGre(){
    	System.out.println(selectedHotelGre.getNomHotel());
    }
   
    public void setService(HotelService service) {
        this.service = service;
    }



	public List<Hotel> getHotelsCa() {
		return hotelsCa;
	}



	public void setHotelsCa(List<Hotel> hotelsCa) {
		this.hotelsCa = hotelsCa;
	}



	public List<Hotel> getHotelsMex() {
		return hotelsMex;
	}



	public void setHotelsMex(List<Hotel> hotelsMex) {
		this.hotelsMex = hotelsMex;
	}



	public List<Hotel> getHotelsTha() {
		return hotelsTha;
	}



	public void setHotelsTha(List<Hotel> hotelsTha) {
		this.hotelsTha = hotelsTha;
	}



	public List<Hotel> getHotelsEth() {
		return hotelsEth;
	}



	public void setHotelsEth(List<Hotel> hotelsEth) {
		this.hotelsEth = hotelsEth;
	}



	public List<Hotel> getHotelsGre() {
		return hotelsGre;
	}



	public void setHotelsGre(List<Hotel> hotelsGre) {
		this.hotelsGre = hotelsGre;
	}



	public Hotel getSelectedHotelCa() {
		return selectedHotelCa;
	}



	public void setSelectedHotelCa(Hotel selectedHotelCa) {
		this.selectedHotelCa = selectedHotelCa;
	}



	public Hotel getSelectedHotelMex() {
		return selectedHotelMex;
	}



	public void setSelectedHotelMex(Hotel selectedHotelMex) {
		this.selectedHotelMex = selectedHotelMex;
	}



	public Hotel getSelectedHotelTha() {
		return selectedHotelTha;
	}



	public void setSelectedHotelTha(Hotel selectedHotelTha) {
		this.selectedHotelTha = selectedHotelTha;
	}



	public Hotel getSelectedHotelEth() {
		return selectedHotelEth;
	}



	public void setSelectedHotelEth(Hotel selectedHotelEth) {
		this.selectedHotelEth = selectedHotelEth;
	}



	public Hotel getSelectedHotelGre() {
		return selectedHotelGre;
	}



	public void setSelectedHotelGre(Hotel selectedHotelGre) {
		this.selectedHotelGre = selectedHotelGre;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public HotelService getService() {
		return service;
	}

 
    
}