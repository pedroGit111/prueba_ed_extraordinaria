package examen;

public class Moto {
	
	private String matricula;
	private String modelo;
	private int numeroPlazas;
	private double velocidadMedia;
	private String tipoCombustible;
	private double consumo;
	
	// Constructores
	
	// Constructor por defecto
	public Moto() {
		super();
	}

	//Constructor parametrizado
	public Moto(String matricula, String modelo, int numeroPlazas, double velocidadMedia, String tipoCombustible,
			double consumo) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.numeroPlazas = numeroPlazas;
		this.velocidadMedia = velocidadMedia;
		this.tipoCombustible = tipoCombustible;
		this.consumo = consumo;
	}
	
	// Getters & Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public double getVelocidadMedia() {
		return velocidadMedia;
	}

	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	// Método toString
	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", modelo=" + modelo + ", numeroPlazas=" + numeroPlazas
				+ ", velocidadMedia=" + velocidadMedia + ", tipoCombustible=" + tipoCombustible + ", consumo=" + consumo
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
