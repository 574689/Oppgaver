import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String args[]) {
		int i, fak = 1;
		int nr;

		String tallTxt = showInputDialog("Skriv inn et heltall:");
		nr = parseInt(tallTxt);

		for (i = 1; i <= nr; i++) {
			fak = fak * i;

		}

		showMessageDialog(null, "Fakultetet av " + nr + " = " + fak);

	}
}
