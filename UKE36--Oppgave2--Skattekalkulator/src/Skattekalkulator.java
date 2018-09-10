import static java.lang.Double.*;
import static java.lang.String.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Skattekalkulator {

	public static void main(String[] args) {
		double bruttoLønn;
		double trinnSkatt = 0;
		String tallTxt = showInputDialog("Oppgi lønn før skatt");
		bruttoLønn = parseDouble(tallTxt);
		if (bruttoLønn <= 164100) {
			trinnSkatt = 0;
		} else if (bruttoLønn <= 230950) {
			trinnSkatt = bruttoLønn * 0.0093;
		} else if (bruttoLønn <= 580650) {
			trinnSkatt = bruttoLønn * 0.0241;
		} else if (bruttoLønn <= 934050) {
			trinnSkatt = bruttoLønn * 0.1152;
		} else if (bruttoLønn > 934050) {
			trinnSkatt = bruttoLønn * 0.1452;
		}
		String utTxt = "Trinnskatten din er på " + format("%10.2f", trinnSkatt) + "\n";
		showMessageDialog(null, utTxt);
	}
}