package RedeDePetri;

public class Transicao {
	private Arco[] oEntradas;
	private Arco[] oSaidas;
	
	
	//construtores
	public Transicao(Arco[] entradas) {
		this.oEntradas=entradas;
	}
	public Transicao() {
	}
	
	
	
	
	//gets sets especificos
	public void setEntradaEspecifica(Arco oEntradas, int i) {
		this.oEntradas[i] = oEntradas;
	}
	
	public void setSaidaEspecifica(Arco oSaidas, int i) {
		this.oSaidas[i] = oSaidas;
	}
	
	public Arco getEntradaEspecifica(int i) {
		return oEntradas[i];
	}
	
	public Arco getSaidaEspecifica(int i) {
		return oSaidas[i];
	}
	
	
	
	
	public Arco[] getEntradas() {
		return oEntradas;
	}

	public void setEntradas(Arco[] oEntradas) {
		this.oEntradas = oEntradas;
	}
	
	public Arco[] getSaidas() {
		return oSaidas;
	}

	public void setSaidas(Arco[] oSaidas) {
		this.oSaidas = oSaidas;
	}
	

}
