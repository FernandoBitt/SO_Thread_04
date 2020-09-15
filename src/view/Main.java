package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args) {
		
		int chegada=12;
		int puloMax=3;

		
		for(int sapo=0; sapo<5; sapo++) {
			ThreadController tController = new ThreadController(chegada, puloMax, sapo);
			tController.start();

		}
		
	}

}
