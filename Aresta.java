package grafs;

public class Aresta {
	private Vertice origem;
	private Vertice destino;
	private int segue;

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	public int getSegue() {
		return segue;
	}

	public void setSegue(int segue) {
		this.segue = segue;
	}

}
