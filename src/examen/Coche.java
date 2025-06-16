package examen;

public class Coche {
	
	private String matricula;
	private String modelo;
	private int numeroPlazas;
	private double velocidadMedia;
	private TipoDeCombustible tipoCombustible;
	private double consumo;
	
	// Constructores
	public Coche() {
		super();
	}
	
		// Constructor parametrizado
	public Coche(String matricula, String modelo, int numeroPlazas, double velocidadMedia, TipoDeCombustible tipoCombustible,
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

	public TipoDeCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoDeCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	// Método toString (método necesario para poder imprimir el objeto en la clase principal )
	/**
	 * método necesario para poder imprimir el objeto en la clase principal
	 */
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", modelo=" + modelo + ", numeroPlazas=" + numeroPlazas
				+ ", velocidadMedia=" + velocidadMedia + ", tipoCombustible=" + tipoCombustible + ", consumo=" + consumo
				+ "]";
				
	}
	
	

	

	
	
	

	

}
