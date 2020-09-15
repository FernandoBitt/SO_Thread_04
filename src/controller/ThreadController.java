package controller;

import java.util.Random;

public class ThreadController extends Thread{


	private int chegada;
	private int puloMax;
	private int sapo;

	public static int colocacao;
	
	Random gerador = new Random();
	
	public ThreadController(int chegada, int puloMax, int sapo) {
		this.chegada=chegada;
		this.puloMax=puloMax;
		this.sapo=sapo;

	}

	@Override
	public void run() {
		movimentaSapo();
		podio();
	}





	private void podio() {
		
		try {
			sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		colocacao++;
		System.err.println("Sapo Nº: " + (sapo+1) +"- " +colocacao+" Posição");
	}

	private void movimentaSapo() {
		int pulo=0;
		int percorrido=0;

		while(percorrido<chegada) {
			pulo=gerador.nextInt(puloMax);
			percorrido= percorrido+pulo;
		
			System.out.println("Sapo Nº" + (sapo+1) +" " +"Pulo= " + pulo + "m"+" " +"Percorrido= " + percorrido + "metros");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}

	}


}
