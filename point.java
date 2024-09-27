class point {
	private int abscisse;
	private int ordonnee;
	private String nom;

public point(String n , int a,int o){
	nom= n;
	abscisse=a;
	ordonnee=o;
	}

public point(String n , int a) {
	nom=n;
	abscisse=a;
	
}
public point(String n) {
	nom=n;
}


public void affiche(){
	System.out.println(nom + "(" + abscisse +","+ ordonnee + ")");
	
}
public void TranLHoriz(int a) {
	abscisse=abscisse+a;
	
}
public void TranLVert(int a) {
	ordonnee=ordonnee+a;
	
}
public void Translation(int a, int b) {
	abscisse=abscisse+a;
	ordonnee=ordonnee+b;
}

public String getNom() {
	return nom;
}
public int getAbscisse() {
	return abscisse;
}
public int getOrdonnee() {
	return ordonnee;
}
public void setNom(String ch) {
	nom=ch;
	
}
public void setAbscisse(int a) {
	abscisse=a;
}
public void setOrdonnee(int a) {
	ordonnee=a;
}
public static void main(String[] args) {
	point p1;
    p1 = new point("P1", 3, 5);
    point p2 = new point("P2", 3);
    point p3 = new point("P3", 3, 5);

    System.out.println("\n ---------------------------\n");
    System.out.println("Les points créés sont :");
    p1.affiche();
    p2.affiche();
    p3.affiche();

    System.out.println("\n ---------------------------\n");
   

    System.out.println("\n ---------------------------\n");
    System.out.println("Translation des points :");
    p1.TranLHoriz(4);
    p2.TranLVert(3);
    p3.Translation(5, 2);

    p1.affiche();
    p2.affiche();
    p3.affiche();

    System.out.println("\n ---------------------------\n");
    System.out.println("Modification des attributs des points :");
    p1.setNom("SRI21");
    p2.setAbscisse(25);
    p3.setOrdonnee(50);

    p1.affiche();
    p2.affiche();
    p3.affiche();

    System.out.println("\n ---------------------------\n");
    System.out.println("Utilisation des méthodes get :");
    String x = p1.getNom();
    int y = p1.getAbscisse();
    int z = p1.getOrdonnee();

    System.out.println("Le nom du point p1 est : " + x);
    System.out.println("Son abscisse est : " + y);
    System.out.println("Son ordonnée est : " + z);
}
}
