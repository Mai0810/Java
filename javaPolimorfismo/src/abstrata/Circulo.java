package abstrata;

public class Circulo extends Figura {
	private float raio;

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public Circulo() {
	}

	@Override
	public float area() {

		return 3.14f * raio * raio;
	}

}
