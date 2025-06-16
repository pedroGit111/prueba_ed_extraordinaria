package examen;

public enum TipoDeCombustible {
	
	GASOLINA(1.60),
	DIESEL(1.45),
	ELECTRICO(0.20);
	
	private final double  precioPorLitro;
	
	TipoDeCombustible(double precioPorLitro){
		this.precioPorLitro= precioPorLitro;
	}

	public double getPrecioPorLitro() {
		return precioPorLitro;
	}
}
