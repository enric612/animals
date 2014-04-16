package animals;

public class Gos extends AnimalClass {

	protected Double coordX;
	protected Double coordY;
	
	
	/*
	 * Mètodes obligatoris de la classe pare.
	 */
	
	public void menja() {
		this.setPes((this.getPes())+1);

	}

	public void mou() {
		this.coordX += 1;
		this.coordY += 1;

	}

}
