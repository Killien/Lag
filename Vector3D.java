package bonusaufgaben_Vektoren;

public class Vector3D {

	public Vector3D(){}
	
	public Vector3D(double[] vec1, double[] vec2, double[] vec3) {
		super();
		this.vec1 = vec1;
		this.vec2 = vec2;
		this.vec3 = vec3;
	}

	public Vector3D(double[] punkt1, double[] punkt2) {
		super();
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
	}


	double[] vec1 = new double[3];
	double[] vec2 = new double[3];
	double[] vec3 = new double[3];
	
	double[] punkt1 = new double[3];
	double[] punkt2 = new double[3];
	
	public double[] Addition(double[] vec1, double[] vec2) {
		for (int i = 0; i < 3; i++) {
			vec3[i] = vec1[i] + vec2[i];
		}
		return vec3;
	}
	
	public double[] SkalaresVielfaches(double[] vec1, double SkalaresVielfaches1) {
		double SkalaresVielfaches = SkalaresVielfaches1;
		for (int i = 0; i < 3; i++) {
			vec3[i] = vec1[i]*SkalaresVielfaches;
		}
		return vec3;
	}
	
	public double Skalarprodukt(double[] vec1, double[] vec2) {
		double Skalarprodukt;
		Skalarprodukt = vec1[1]*vec2[1]+vec1[2]*vec2[2]+vec1[3]*vec2[3];
		return Skalarprodukt;
	}
	
	public double EuklidischeLaenge(double[] vec1) {
		double EuklidischeLaenge;
		EuklidischeLaenge = Math.sqrt((vec1[1]+vec1[2]+vec1[3]));
		return EuklidischeLaenge;
	}
	
	public double WinkelZwischenZweiVektoren(double[] vec1, double[] vec2) {
		double Skalarprodukt = Skalarprodukt(vec1, vec2);
		double EuklidischeLaengeVec1 = EuklidischeLaenge(vec1);
		double EuklidischeLaengeVec2 = EuklidischeLaenge(vec2);
		double WinkelZwischenZweiVektoren = Skalarprodukt/(EuklidischeLaengeVec1*EuklidischeLaengeVec2);
		return Math.acos(WinkelZwischenZweiVektoren);
	}
	
	public double[] Orthogonalprojektion(double[] vec1, double[] vec2) {
		double Skalarprodukt = Skalarprodukt(vec1, vec2);
		double EuklidischeLaengeVec2 = EuklidischeLaenge(vec2);
		double SkalaresVielfaches = Skalarprodukt/EuklidischeLaengeVec2*EuklidischeLaengeVec2;
		double[] Orthogonalprojektion = SkalaresVielfaches(vec1, SkalaresVielfaches);
		return Orthogonalprojektion;
	}
	
	//fuer Gleichheit bei double
	public static boolean compare(double a, double b) {
	    return Math.abs(a - b) < 0.0000000000001;
	}
	
	public boolean LinearAbhängig(double[] vec1, double[] vec2) {
		double d;
		if(vec1[2] > 0 && vec2[2] > 0)
			 d = (vec1[2]/vec2[2])*-1;
		else if(vec1[2] < 0 && vec2[2] < 0)
			 d = (vec1[2]/vec2[2])*-1;
		else
			 d = (vec1[2]/vec2[2])*-1;
		vec1[1] = vec1[1]*d;
		vec1[2] = vec1[2]*d;
		vec3[1] = vec1[1] + vec2[1];
		vec3[2] = vec2[1] + vec2[2];
		if(compare(vec1[2], 0) == true) {
			vec1[2] = 0;
			return true;
		}
		else
			return false;
		
	}
	
	public double[] Vektorprodukt(double[] vec1, double[] vec2) {
		double[] Vektorprodukt = new double[3];
		Vektorprodukt[1] = vec1[2]*vec2[3]-vec1[3]*vec2[2];
		Vektorprodukt[2] = vec1[3]*vec2[1]-vec1[1]*vec2[3];
		Vektorprodukt[3] = vec1[1]*vec2[2]-vec1[2]*vec2[1];
		return Vektorprodukt;
	}
	
	public double Spatprodukt(double[] vec1, double[] vec2, double[] vec3) {
		double Spatprodukt;
		Spatprodukt = vec1[1]*vec2[2]*vec3[3]
						+vec1[2]*vec2[3]*vec3[1]
						+vec1[3]*vec2[1]*vec3[2]
						-vec1[3]*vec2[2]*vec3[1]
						-vec1[1]*vec2[3]*vec3[2]
						-vec1[2]*vec2[1]*vec3[3];
		return Spatprodukt;
	}
	
	public double AbstandZwischenZweiPunkten(double[] punkt1,double[] punkt2) {
		 return Math.sqrt(Math.pow((punkt2[1] - punkt1[1]), 2) + Math.pow((punkt2[2] - punkt1[2]), 2));
	}

	public double[] PunkteZuVektor(double[] punkt1,double[] punkt2) {
		vec3[1] = punkt2[1]-punkt1[1];
		vec3[2] = punkt2[2]-punkt1[1];
		return vec3;
	}
	//tets
}
