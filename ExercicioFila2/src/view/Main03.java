package view;

import br.edu.fateczl.fila.FilaObj;
import controller.EscalonadorController;

public class Main03 {

	public static void main(String[] args) {
		FilaObj f = new FilaObj();
		EscalonadorController esc = new EscalonadorController();

		Object[] vet = { "notepad.exe;14", "write.exe;35", "chrome.exe;27", "acrobat.exe;52", "firefox.exe;18",
				"word.exe;25" };

		for (Object processo : vet) {
			f.insert(processo);
		}

		esc.escalonador(f);

	}

}
