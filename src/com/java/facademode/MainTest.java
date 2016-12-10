package com.java.facademode;

import com.java.facademode.hometheater.HomeTheaterFacade;



public class MainTest {
	public static void main(String[] args) {
		HomeTheaterFacade mHomeTheaterFacade=new HomeTheaterFacade();
		mHomeTheaterFacade.ready();
		mHomeTheaterFacade.play();
		mHomeTheaterFacade.end(); 
	}
}
