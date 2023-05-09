package view;

import br.edu.fateczl.lista.ListaInt;

public class Exercicio3 {

	public static void main(String[] args) {
		ListaInt l = new ListaInt();
		int[] v = { 3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16 };

		for (int dado : v) {
			if (l.isEmpty()) {
				l.addFirst(dado);
			} else {
				try {
					l.addLast(dado);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("A lista foi carregada!\n" + l.toString());

		int size = l.size() - 1;
		while (size >= 0) {

			try {
				System.out.print("[ " + l.get(size) + " ][]->");
			} catch (Exception e) {
				e.printStackTrace();
			}
			size--;
		}
		System.out.println("NULL");
	}
}
