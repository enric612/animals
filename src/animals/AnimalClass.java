package animals;

public abstract class AnimalClass implements Animal {

	protected Double altura;
	protected Double pes;
	
	public Double getAltura() {
		return this.altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;

	}

	public Double getPes() {
		return this.pes;
	}

	public void setPes(Double pes) {
		this.pes = pes;

	}

	public abstract void menja() ;
	public abstract void mou();
	
}
