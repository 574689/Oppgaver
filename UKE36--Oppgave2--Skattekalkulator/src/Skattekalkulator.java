import static java.lang.Double.*;
import static java.lang.String.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Skattekalkulator {

	public static void main(String[] args) {
		double bruttoL�nn;
		double trinnSkatt = 0;
		String tallTxt = showInputDialog("Oppgi l�nn f�r skatt");
		bruttoL�nn = parseDouble(tallTxt);
		if (bruttoL�nn <= 164100) {
			trinnSkatt = 0;
		} else if (bruttoL�nn <= 230950) {
			trinnSkatt = bruttoL�nn * 0.0093;
		} else if (bruttoL�nn <= 580650) {
			trinnSkatt = bruttoL�nn * 0.0241;
		} else if (bruttoL�nn <= 934050) {
			trinnSkatt = bruttoL�nn * 0.1152;
		} else if (bruttoL�nn > 934050) {
			trinnSkatt = bruttoL�nn * 0.1452;
		}
		String utTxt = "Trinnskatten din er p� " + format("%10.2f", trinnSkatt) + "\n";
		showMessageDialog(null, utTxt);
	}
}