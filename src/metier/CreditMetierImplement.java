package metier;

public class CreditMetierImplement {

	public static void main(String[] args) {

	
}
	public double CalculerMensualiteCredit(double Montant,double Duree, double Taux) {
		double t=Taux/100 ;
		double t1= Montant*t/12 ;
		double t2=1-Math.pow(1+t/12, -Duree);
		
		
		return t1/t2;

}
	


}

	
