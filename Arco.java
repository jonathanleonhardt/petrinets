package RedeDePetri;

public class Arco {
	private Marca oCusto;
	private Local oLocal;
	private Transicao oTransicao;

	public Arco( Local l, Transicao t) {
		this.oLocal=l;
		this.oTransicao=t;
	}
	public Arco(Transicao t) {
		this.oTransicao=t;
	}
	public Arco(Local l) {
		this.oLocal=l;
	}
	
	
	
	public Marca getCusto() {
		return oCusto;
	}

	public void setCusto(int c) {
		this.oCusto = new Marca(c);
	}

	public Local getLocal() {
		return oLocal;
	}

	public void setLocal(Local oLocal) {
		this.oLocal = oLocal;
	}

	public Transicao getTransicao() {
		return oTransicao;
	}

	public boolean setTransicao(Transicao oTransition) {
		if(oTransition!=null && !(oTransicao instanceof Transicao)) { 
		this.oTransicao = oTransition;
		return true;
		}
		return false;
	}
}
