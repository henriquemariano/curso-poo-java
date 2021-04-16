package aula06a;
/*
	Essa classe vai receber os métodos abstratos da Interface.
	
	Também é preciso colocar alguns métodos adicionais.
*/
public class ClasseRemoto {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private int getVolume() {
		return this.volume;
	}
	
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private boolean getLigado() {
		return this.ligado;
	}
	
	private void setTocando(boolean t) {
		this.tocando = t;
	}
	
	private boolean getTocando() {
		return this.tocando;
	}
}
