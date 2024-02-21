package logica;

public abstract class calcularTMB {
	protected double peso;
	protected double estatura;
	protected int edad;
	public calcularTMB(int peso, int estatura, int edad) {
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract double Calcular();
	
	
	

}
