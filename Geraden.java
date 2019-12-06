package bonusaufgaben_Vektoren;

public class Geraden extends Vector3D {

	public Geraden() {}
	
	double x;
	double y;
	double x4;
	
	public Geraden(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public static boolean PunktAufGrade(Geraden a, Geraden b) {
		if(compare((a.x*b.x - a.y*b.y), 0)) {
			System.out.println("Der Punkt liegt auf der Graden");
			return true;
		}
		System.out.println("Der Punkt liegt nicht auf der Graden");
		return false;
	}
	
	public static double AbstandPunktZurGrade(Geraden a, Geraden b) {
		Geraden HesseschenNormalenform = HesseschenNormalenform(a, b);
		double AbstandPunktZurGrade = HesseschenNormalenform.x*a.x+HesseschenNormalenform.y*a.y;
		System.out.println(AbstandPunktZurGrade);
		return AbstandPunktZurGrade;
	}
	
	public static double OrientierterAbstand(Geraden a, Geraden b) {
		double OrientierterAbstand = AbstandPunktZurGrade(a, b);
		if(OrientierterAbstand < 0)
			OrientierterAbstand = OrientierterAbstand*(-1);
		System.out.println(OrientierterAbstand);
		return OrientierterAbstand;
	}
	
	public static Geraden Richtungsvektor(Geraden a) {
		Geraden implizitenDarstellung = implizitenDarstellung(a);
		Geraden Richtungsvektor  = new Geraden();
		Richtungsvektor.x = 1.0;
		Richtungsvektor.y = implizitenDarstellung.x;
		System.out.println(Richtungsvektor.x + " " + Richtungsvektor.y );
		return Richtungsvektor;
	}
	
	public static Geraden Normalenvektor(Geraden a) {
		Geraden implizitenDarstellung = implizitenDarstellung(a);
		Geraden Normalenvektor = new Geraden();
		Normalenvektor.x = implizitenDarstellung.x;
		Normalenvektor.y = implizitenDarstellung.y;
		System.out.println(Normalenvektor.x + " " + Normalenvektor.y);
		return Normalenvektor;
	}
	
	public static Geraden Parameterdarstellung(Geraden a) {
		Geraden implizitenDarstellung = implizitenDarstellung(a);
		implizitenDarstellung.x = implizitenDarstellung.x/implizitenDarstellung.y;
		implizitenDarstellung.z = implizitenDarstellung.z/implizitenDarstellung.y;
		Geraden Parameterdarstellung = new Geraden();
		Parameterdarstellung.x = implizitenDarstellung.x;
		Geraden Richtungsvektor = Richtungsvektor(a);
		double y = implizitenDarstellung.z;
		Geraden d  = new Geraden();
		d.x = 0;
		d.y = y;
		d.z = Richtungsvektor.x;
		d.x4 = Richtungsvektor.y;
		System.out.println(d.x + " " + d.y + " " + d.z + " " + d.x4);
		return d;
	}
	
	public static Geraden implizitenDarstellung(Geraden a) {
		Geraden implizitenDarstellung  = new Geraden();
		if(a.y != 0) {
		implizitenDarstellung.x = 1;
		implizitenDarstellung.y = (a.x/a.y)*(-1);
		implizitenDarstellung.z = (a.x/a.y)*a.y-a.x;
		} else {
		implizitenDarstellung.x = 0;
		implizitenDarstellung.y = 1;
		implizitenDarstellung.z = a.y*(-1);
		}
		System.out.println(implizitenDarstellung.x + " " + implizitenDarstellung.y + " " + implizitenDarstellung.z);
		return implizitenDarstellung;
	}
	
	public static Geraden Normieren(Geraden a) {
		Geraden NormienierterVektor = new Geraden();
		a.x = Math.sqrt(a.x + a.y);
		a.y = 1/a.x;
		NormienierterVektor.x = a.x*a.y;
		NormienierterVektor.y = a.y*a.y;
		System.out.println(NormienierterVektor.x + " " + NormienierterVektor.y );
		return NormienierterVektor;
	}
	
	public static Geraden HesseschenNormalenform(Geraden a, Geraden b) {
		Geraden Normalenvektor = Normalenvektor(a);
		Geraden NormienierterVektor = Normieren(Normalenvektor);
		System.out.println(NormienierterVektor.x + " " + NormienierterVektor.y );
		return NormienierterVektor;
	}
	
	public static Geraden Schnittpunkt(Geraden a, Geraden b) {
		Geraden Schnittpunkt  = new Geraden();
		if(a.x == b.x) {
			System.out.println("Die graden sind Parallel");
			return null;
		}
		else if(a.y == b.y) {
			Schnittpunkt.x = 0;
			Schnittpunkt.y = a.y;
			System.out.println(Schnittpunkt);
			return Schnittpunkt;
		} else {
			Schnittpunkt.x = a.x + b.x;
			b.x = 0;
			Schnittpunkt.y = a.y + b.y;
			Schnittpunkt.y = Schnittpunkt.x/Schnittpunkt.y;
			Schnittpunkt.z = Schnittpunkt.x;
			Schnittpunkt.x = Schnittpunkt.y;
			Schnittpunkt.y = Schnittpunkt.z;
			Schnittpunkt.z = 0;
			System.out.println(Schnittpunkt.x + " " + Schnittpunkt.y + " " + Schnittpunkt.z);
			return Schnittpunkt;
		}
	}
}
