package model;

public class Model {
double taux ;
double duree;
double montant;
double mensualite;

public Model() {
	super();
	// TODO Auto-generated constructor stub
}

public Model(double Taux, double Duree, double Montant, double Mensualite) {
	super();
	this.taux = Taux;
	this.duree = Duree;
	this.montant = Montant;
	this.mensualite = Mensualite;
}

public double getTaux() {
	return taux;
}
public void setTaux(double taux) {
	this.taux = taux;
}
public double getDuree() {
	return duree;
}


public void setDuree(double duree) {
	this.duree = duree;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public double getMensualite() {
	return mensualite;
}
public void setMensualite(double mensualite) {
	this.mensualite = mensualite;
}


}
