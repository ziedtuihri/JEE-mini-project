package iset.modele;


public class Personne {
private String nom;
private String preNom;
private String sexe;
private int codeP;

Personne(){
	
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPreNom() {
	return preNom;
}

public void setPreNom(String preNom) {
	this.preNom = preNom;
}

public String getSexe() {
	return sexe;
}

public void setSexe(String sexe) {
	this.sexe = sexe;
}

public int getCodeP() {
	return codeP;
}

public void setCodeP(int codeP) {
	this.codeP = codeP;
}

}
