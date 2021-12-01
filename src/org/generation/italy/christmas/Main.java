package org.generation.italy.christmas;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fine = false;
		String s;
		Scanner in = new Scanner(System.in);
		ArrayList<String> listaD = new ArrayList<String>();

		while (fine == false) {
			System.out.print("Aggiungere elemento alla lista desideri: ");
			listaD.add(in.nextLine());
			if (listaD.size() == 1)
				System.out.println("La tua lista contiene 1 desiderio");
			else
				System.out.println("La tua lista contiene " + listaD.size() + " desideri");

			do {
				System.out.print("Continuare? (s/n)");
				s = in.nextLine();
				if (s.equals("s")) {
					fine = false;
				} else if (s.equals("n")) {
					fine = true;
				} else
					System.out.println("Input non valido");
			} while ((!s.equals("n") && !s.equals("s") && fine == false));
		}
		System.out.println("La tua lista contiene " + listaD.size() + " desideri");
		System.out.println("La tua lista desideri comprende: ");
		Collections.sort(listaD);
		for (String i : listaD) {
			System.out.println(i);
		}

		in.close();
	}

}
