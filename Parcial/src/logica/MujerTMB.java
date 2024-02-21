package logica;

public class MujerTMB extends calcularTMB{
	public double constante1;
	public double constante2;
	public double constante3;
	public double constante4;
	public MujerTMB(int peso, int estatura, int edad, double constante1,double constante2, double constante3, double constante4) {
		super(peso, estatura, edad );
		this.constante1 = 447.593;
		this.constante2 = 9.247;
		this.constante3 = 3.098;
		this.constante4 = 4.33;
	}
	
	@Override
	public  double Calcular() {
		double TMB;
		TMB = constante1 + (constante2 *  peso) + (constante3 * estatura) - (constante4 * edad);
		return TMB;
		
		
		
	}

}
