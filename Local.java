package RedeDePetri;

public class Local {
	private Marca oTokens;
	private Arco[] aEntradas;
	private Arco[] oSaidas;

	
	//construtores
	public Local (int tokens) {
		this.oTokens=new Marca(tokens);
	}
	
	
	
	//gets sets especificos
	public Arco getEntradaEspecifica(int i) {
		return aEntradas[i];
	}

	public void setEntradaEspecifica(Arco aEntradas, int i) {
		this.aEntradas[i] = aEntradas;
	}

	public Arco getSaidaEspecifica(int i) {
		return oSaidas[i];
	}

	public void setSaidaEspecifica(Arco oSaidas, int i) {
		this.oSaidas[i] = oSaidas;
	}
	
	
	
	

	public Marca getTokens() {
		return oTokens;
	}

	public void setTokens(Marca oTokens) {
		this.oTokens = oTokens;
	}

	public Arco[] getEntradas() {
		return aEntradas;
	}

	public void setEntradas(Arco[] aEntradas) {
		this.aEntradas = aEntradas;
	}

	public Arco[] getSaidas() {
		return oSaidas;
	}

	public void setSaidas(Arco[] oSaidas) {
		this.oSaidas = oSaidas;
	}
}
