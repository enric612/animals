package animals;

public class Persona extends AnimalClass {

	protected Double coordX;
	protected Double coordY;
	protected Double coordZ;
	
	
	/*
	 * M�todes obligatoris de la classe pare.
	 */
	
	public void menja() {
		this.setPes((this.getPes())+2);

	}

	public void mou() {
		this.coordX += 1;
		this.coordY += 1;
		this.coordZ += 1;

	}

}
