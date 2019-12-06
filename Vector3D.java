package bonusaufgaben_Vektoren;

public class Vector3D extends Object {

	public Vector3D(){}
	
	public Vector3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Vector3D(Vector3D orig) {
		this(orig.x, orig.y, orig.z);
	}
	
	double x;
	double y;
	double z;
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + "," + this.z + ")";
	}

	
	public static Vector3D Addition(Vector3D a, Vector3D b, Vector3D erg) {
		erg.x = a.x + b.x;
		erg.y = a.y + b.y;
		erg.z = a.z + b.z;
		System.out.println(erg);
		return erg;
	}
	
	public static Vector3D SkalaresVielfaches(Vector3D a, double SkalaresVielfaches1, Vector3D erg) {
		double SkalaresVielfaches = SkalaresVielfaches1;
		erg.x = a.x*SkalaresVielfaches;
		erg.y = a.y*SkalaresVielfaches;
		erg.z = a.z*SkalaresVielfaches;
		System.out.println(erg);
		return erg;
	}
	
	public static double Skalarprodukt(Vector3D a, Vector3D b) {
		double Skalarprodukt;
		Skalarprodukt = a.x*b.x+a.y*b.y+a.z*b.z;
		System.out.println(Skalarprodukt);
		return Skalarprodukt;
	}
	
	public static double EuklidischeLaenge(Vector3D a) {
		double EuklidischeLaenge;
		EuklidischeLaenge = Math.sqrt((a.x+a.y+a.z));
		System.out.println(EuklidischeLaenge);
		return EuklidischeLaenge;
	}
	
	public static double WinkelZwischenZweiVektoren(Vector3D a, Vector3D b) {
		double Skalarprodukt = Skalarprodukt(a,b);
		double EuklidischeLaengeVec1 = EuklidischeLaenge(a);
		double EuklidischeLaengeVec2 = EuklidischeLaenge(b);
		double WinkelZwischenZweiVektoren = Skalarprodukt/(EuklidischeLaengeVec1*EuklidischeLaengeVec2);
		System.out.println(Math.acos(WinkelZwischenZweiVektoren));
		return Math.acos(WinkelZwischenZweiVektoren);
	}
	
	public static Vector3D Orthogonalprojektion(Vector3D a, Vector3D b) {
		double Skalarprodukt = Skalarprodukt(a,b);
		double EuklidischeLaengeVec2 = EuklidischeLaenge(b);
		double SkalaresVielfaches = Skalarprodukt/EuklidischeLaengeVec2*EuklidischeLaengeVec2;
		Vector3D Orthogonalprojektion = new Vector3D();
		Vector3D Orthogonalprojektion1 = SkalaresVielfaches(a, SkalaresVielfaches, Orthogonalprojektion);
		System.out.println(Orthogonalprojektion1);
		return Orthogonalprojektion1;
	}
	
	//fuer Gleichheit bei double
	public static boolean compare(double a, double b) {
	    return Math.abs(a - b) < 0.0000000000001;
	}
	
	public static boolean LinearAbhängig(Vector3D a, Vector3D b) {
		double d;
		if(a.y > 0 && b.y > 0) 
			 d = (a.y/b.y)*(-1);
		else if(a.y < 0 && b.y < 0)
			 d = (a.y/b.y)*-1;
		else
			 d = (a.y/b.y)*-1;
		a.x = a.x*d;
		a.y = a.y*d;
		Vector3D c = new Vector3D();
		c.x = a.x - a.y;
		if(compare(c.x, 0) == true) {
			System.out.println("Linear Abhängig");
			return true;
		}
		else
			System.out.println("Linear Unabhängig");
			return false;
		
	}
	
	public static Vector3D Vektorprodukt(Vector3D a, Vector3D b) {
		Vector3D Vektorprodukt = new Vector3D();
		Vektorprodukt.x = a.y*b.z-a.z*b.y;
		Vektorprodukt.y = a.z*b.x-a.x*b.z;
		Vektorprodukt.z = a.x*b.y-a.y*b.x;
		System.out.println(Vektorprodukt);
		return Vektorprodukt;
	}
	
	public static double Spatprodukt(Vector3D a, Vector3D b, Vector3D c) {
		double Spatprodukt;
		Spatprodukt = a.x*b.y*c.z
						+a.y*b.z*c.x
						+a.z*b.x*c.y
						-a.z*b.y*c.x
						-a.x*b.z*c.y
						-a.y*b.x*c.z;
		System.out.println(Spatprodukt);
		return Spatprodukt;
	}
	
	public static double AbstandZwischenZweiPunkten(Vector3D a, Vector3D b) {
		 System.out.println(Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2)));
		 return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	}

	public static Vector3D PunkteZuVektor(Vector3D a, Vector3D b) {
		Vector3D c = new Vector3D();
		c.x = b.x-a.x;
		c.y = b.y-a.y;
		System.out.println(c);
		return c;
	}
	
}
