package logica;

public  class HombreTMB extends calcularTMB{
	public double constante1;
	public double constante2;
	public double constante3;
	public double constante4;
	public HombreTMB(int peso, int estatura, int edad,double constante1,double constante2, double constante3, double constante4) {
		super(peso, estatura, edad );
		this.constante1 = 88.362;
		this.constante2 = 13.397;
		this.constante3 = 4.799;
		this.constante4 = 5.677;
	}
	
	@Override
	public  double Calcular() {
		double TMB;
		TMB = constante1 + (constante2 *  peso) + (constante3 * estatura) - (constante4 * edad);
		return TMB;
		
		
		
	}

	
	

}
