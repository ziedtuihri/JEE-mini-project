package iset.modele;


public class Personne {
private String nom;
private String preNom;
private String sexe;
private String codeP;

public Personne() {
	
}

public Personne(String ch1,String ch2,String ch3,String code){
	nom=ch1;
	preNom=ch2;
	sexe=ch3;
	codeP=code;
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

public String getCodeP() {
	return codeP;
}

public void setCodeP(String codeP) {
	this.codeP = codeP;
}

}
