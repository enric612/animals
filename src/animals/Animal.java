package animals;

public interface Animal {
	
	/*
	 * Mètodes d'acces a paràmetres
	 */
	
	public Double getAltura();
	public void setAltura(Double altura);
	public Double getPes();
	public void setPes(Double pes);
	
	/*
	 * Mètodes d'acció
	 */
	public void menja();
	public void mou();

}
