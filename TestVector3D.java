package bonusaufgaben_Vektoren;

public class TestVector3D {

	public static void main(String[] args) {
		Vector3D vec3D1 = new Vector3D(1.0, 1.0, 1.0);
		Vector3D vec3D2 = new Vector3D(2.0, 2.0, 2.0);
		Vector3D vec3D3 = new Vector3D();
		Vector3D vec2D1 = new Vector3D(1.0, 1.0);
		Vector3D vec2D2 = new Vector3D(2.0, 2.0);
		
		Vector3D.Addition(vec3D1, vec3D2, vec3D3); //ergebnis: 3.0,3.0,3.0
		
		Vector3D.SkalaresVielfaches(vec3D1, 2.0, vec3D3);//ergebnis: 2.0,2.0,2.0
		
		Vector3D.Skalarprodukt(vec3D1, vec3D2); //ergebnis:6.0
		
		Vector3D.EuklidischeLaenge(vec3D1); //ergebnis: 1.73 (Wurzel 3)
		
		Vector3D.WinkelZwischenZweiVektoren(vec3D1, vec3D2);  //NaN
		
		Vector3D.Orthogonalprojektion(vec3D1, vec3D2); //ergebnis: 6.0,6.0,6.0
		
		Vector3D.LinearAbhängig(vec3D1, vec3D2); //ergebnis: Linear Abhaengig
		
		Vector3D.Vektorprodukt(vec3D1, vec3D2); //ergebis: -3.0,3.0,3.0
		
		Vector3D.Spatprodukt(vec3D1, vec3D2, vec3D3); //ergebnis: 0.0
		
		Vector3D.AbstandZwischenZweiPunkten(vec2D1, vec2D2); //ergebnis: 1.41
		
		Vector3D.PunkteZuVektor(vec2D1, vec2D2); //ergbenis: 1.0,1.0,1.0
	}

}
