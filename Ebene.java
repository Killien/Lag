package bonusaufgaben_Vektoren;

public class Ebene extends Geraden{

	public Ebene() {}
	
	public Ebene(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static double AbstandPunktZurEbene(Ebene a, Geraden b, Ebene c) {
		Ebene HesseschenNormalenform = HesseschenNormalenform(b, a, c);
		double AbstandPunktZurEbene = HesseschenNormalenform.x*a.x+HesseschenNormalenform.y*a.y+HesseschenNormalenform.z*a.z;
		System.out.println(AbstandPunktZurEbene);
		return AbstandPunktZurEbene;
	}
	
	public static double OrientierterAbstand(Ebene a, Geraden b, Ebene c) {
		double OrientierterAbstand = AbstandPunktZurEbene(a, b, c);
		if(OrientierterAbstand < 0)
			OrientierterAbstand = OrientierterAbstand*(-1);
		System.out.println(OrientierterAbstand);
		return OrientierterAbstand;
	}
	
	public static Ebene Richtungsvektor(Geraden a, Ebene b, Ebene c) {
		Ebene implizitenDarstellung = implizitenDarstellung(a, b, c);
		Ebene Richtungsvektor = new Ebene();
		Richtungsvektor.x = 1;
		Richtungsvektor.y = implizitenDarstellung.x;
		Richtungsvektor.z = implizitenDarstellung.y;
		System.out.println(Richtungsvektor.x + " " + Richtungsvektor.y + " " + Richtungsvektor.z);
		return Richtungsvektor;
	}
	
	public static Vector3D Normalenvektor(Ebene b, Ebene c) {
		Vector3D Normalenvektor = Vektorprodukt(b, c);
		System.out.println(Normalenvektor.x + " " + Normalenvektor.y + " " + Normalenvektor.z);
		return Normalenvektor;
	}
	
	//?
//	public static Ebene Parameterdarstellung(Ebene b, Ebene c) {
		//TODO
//	}
	
	public static Ebene implizitenDarstellung(Geraden a, Ebene b, Ebene c) {
		Ebene implizitenDarstellung = new Ebene();
		implizitenDarstellung.x = b.y*c.z-b.z*c.y;
		implizitenDarstellung.y = b.z*c.x-b.x*c.z;
		implizitenDarstellung.z = b.x*c.y-b.y*c.x;
		implizitenDarstellung.x4 = (implizitenDarstellung.x*a.x+implizitenDarstellung.y*a.y+implizitenDarstellung.z*a.z)*(-1);
		System.out.println(implizitenDarstellung.x + " " + implizitenDarstellung.y + " " + implizitenDarstellung.z + " " + implizitenDarstellung.x4);
		return implizitenDarstellung;
	}
	
	public static Ebene Normieren(Vector3D normalenvektor) {
		Ebene NormienierterVektor = new Ebene();
		double a = Math.sqrt(normalenvektor.x + normalenvektor.y + normalenvektor.z);
		double b = 1/a;
		NormienierterVektor.x = normalenvektor.x*b;
		NormienierterVektor.y = normalenvektor.y*b;
		NormienierterVektor.z = normalenvektor.z*b;
		System.out.println(NormienierterVektor.x + " " + NormienierterVektor.y + " " + NormienierterVektor.z);
		return NormienierterVektor;
	}

	public static Ebene HesseschenNormalenform(Geraden a, Ebene b, Ebene c) {
		Vector3D Normalenvektor = Normalenvektor(b, c);
		Ebene NormienierterVektor = Normieren(Normalenvektor);
		System.out.println(NormienierterVektor.x + " " + NormienierterVektor.y + " " + NormienierterVektor.z);
		return NormienierterVektor;	}
	
	//?
//	public static double Schnittpunkt(Geraden a,Ebene b, Ebene c, Ebene punkt2, Ebene vec3, Ebene vec4) {
		//TODO
//	}
}
