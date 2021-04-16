package ateste;

public class Luta {
	 public Lutador desafiado;
	 public Lutador desafiante;
	 private int round;
	 private int one, two;
	 private boolean aprovada;
	 
	 public void  marcarLuta (Lutador l1, Lutador l2) {
	  if (l1.getCategoria().equals(l2.getCategoria()) && l1 !=l2){
		  this.aprovada = true;
		  this.desafiado = l1;
		  this.desafiante = l2;
	  } else {
		   this.aprovada = false;
		   this.desafiado = null;
		   this.desafiante = null;
	   }
	 }
}