package bonusaufgaben_Vektoren;

public class TestEbene {

	public static void main(String[]args) {
		Ebene a = new Ebene(5.0, 7.0, 3.0);
		Geraden b = new Geraden(6.0, 2.0);
		Ebene c = new Ebene(6.0, 2.0, 3.0);
		
		Ebene.AbstandPunktZurEbene(a, b, c); //ergebnis: 29.5
		
//		Ebene.OrientierterAbstand(a, b, c); //ergebnis: 29.5
//		
//		Ebene.Richtungsvektor(b, a, c); //ergebnis: 1.0,1.0
//		
//		Ebene.Normalenvektor(a, c);
//	
//		Ebene.implizitenDarstellung(b, a, c); //ergebnsi: 15.0 3.0 -32.0 -96.0
	
//		Ebene.Normieren(a); // ergebnis: 1.0 0.08333333333333336
		
//		Ebene.HesseschenNormalenform(a, b); //ergebnis: 1.0 3.5
	}
}
