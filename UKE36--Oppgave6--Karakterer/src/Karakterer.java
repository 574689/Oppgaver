import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterer {
	public static void main(String[] args) {

		String tallTxt = showInputDialog("Skriv inn din poengsum:");
		int poengSum = parseInt(tallTxt);

		if (poengSum > 100 || poengSum < 0) {
			showMessageDialog(null, "Ugyldig poengsum - Poengsummen skal være mellom 0 og 100");
		} else if (poengSum <= 39) {
			showMessageDialog(null, "Du fikk karakteren F");
		} else if (poengSum <= 49) {
			showMessageDialog(null, "Du fikk karakteren E");

		} else if (poengSum <= 59) {
			showMessageDialog(null, "Du fikk karakteren D.");

		} else if (poengSum <= 79) {
			showMessageDialog(null, "Du fikk karakteren C.");

		} else if (poengSum <= 89) {
			showMessageDialog(null, "Du fikk karakteren B.");

		} else if (poengSum <= 100) {
			showMessageDialog(null, "Du fikk karakteren A!");

		}
	}

}

