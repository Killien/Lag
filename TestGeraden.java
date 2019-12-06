package bonusaufgaben_Vektoren;

public class TestGeraden {

	public static void main(String[] args) {
		Geraden a = new Geraden(5.0, 7.0);
		Geraden b = new Geraden(6.0, 2.0);
		
		Geraden.PunktAufGrade(a, b); // ergebnis: Punkt liegt nicht auf der Graden
		
		Geraden.AbstandPunktZurGrade(a, b); //ergebnis: 29.5
		
		Geraden.OrientierterAbstand(a, b); //ergebnis: 29.5
		
		Geraden.Richtungsvektor(a); //ergebnis: 1.0,1.0
		
		Geraden.Parameterdarstellung(a); //ergebnis: 0.0 -0.0 1.0 1.0	
	
		Geraden.implizitenDarstellung(a); //ergebnsi: 1.0 -0.7142857142857143 0.0
	
		Geraden.Normieren(a); // ergebnis: 1.0 0.08333333333333336
		
		Geraden.HesseschenNormalenform(a, b); //ergebnis: 1.0 3.5
		
		Geraden.Schnittpunkt(a, b); //ergbnis: 1.2222222222222223 11.0 0.0
	}

}
