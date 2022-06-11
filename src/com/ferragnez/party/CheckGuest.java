package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "BebeVio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic",};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Il suo nome?");
		String nome = scan.nextLine();
		boolean flag = false;
		
		/*for (int i=0; i < invitati.length; i++) {
			if (nome.equalsIgnoreCase(invitati[i])) {
				flag=true;
				System.out.println("Prego, da questa parte.");
			}
			
		}
		if (flag == false) {
			System.out.println("Non e' sulla lista, non posso farla entrare.");
		} 
		*/
		int i=0;
		
		do {
			if (nome.equalsIgnoreCase(invitati[i])) {
				flag=true;
				System.out.println("Prego, da questa parte.");
			}
		    i++;
			
		} while (i < invitati.length);
		
		if (flag == false) {
			System.out.println("Non e' sulla lista, non posso farla entrare.");
		} 
		
		scan.close();
	}

}
