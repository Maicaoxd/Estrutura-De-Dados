package view;

import br.edu.fateczl.pilhas.PilhaInt;

public class Exercicio0102 {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		for (int i = 100; i < 115; i++) {
			if (p.isEmpty()) {
				p.push(i + 100);
			} else {
				if (p.size() <= 4) {
					p.push(i + 50);
				} else {
					try {
						p.pop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			try {
				System.out.println(p.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(p.size());
	}
}