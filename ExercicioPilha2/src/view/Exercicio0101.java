package view;

import br.edu.fateczl.pilhas.PilhaInt;

public class Exercicio0101 {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				p.push(i * i);
			} else {
				if (i <= 5) {
					p.push(i);
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
