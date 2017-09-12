package RedeDePetri;

public class Marca {
	private int marcas;
	
	public Marca (int m) {
		setMarcas(m);
	}
	
	public int getMarcas() {
		return marcas;
	}

	public void setMarcas(int m) {
		if (m<0) {
			this.marcas=1;
		}
		this.marcas=m;
	}
	
}
