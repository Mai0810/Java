package abstrata;

public class Quadrado extends Figura {
	private float lado;

	public void setLado(float lado) {
		this.lado = lado;
	}

	public Quadrado() {
	}

	@Override
	public float area() {

		return lado * lado;
	}

}
