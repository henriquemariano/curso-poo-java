package ateste;

public void lutar() {
	  if (this.aprovada) {
	   System.out.println("###DESAFIADO##");
	   this.desafiado.apresentar();
	   System.out.println("##DESAFIANTE###");
	   this.desafiante.apresentar();

	   if (desafiante.getPeso() > desafiado.getPeso()) {
	    one = one + 35;
	   }else {
	    two = one + 35;
	   }
	   if (desafiante.getAltura() > desafiado.getAltura()) {
	    one = one + 22;
	   }else {
	    two = two + 22;
	   }
	   if (desafiante.getIdade() < desafiado.getIdade()) {
	    one = one + 13;
	   }else {
	    two = two +13;
	   }
	   if (desafiante.getVitorias() > desafiado.getVitorias()) {
	    one = one + 27;
	   }else {
	    two = two + 27;
	   }
	   Random aleatorio = new Random ();
	   one = one + aleatorio.nextInt(40);
	   two = two + aleatorio.nextInt(40);
	   System.out.println(" ROUND 1 " + desafiante.getNome() + " esta com " + one + " pontos e " + desafiado.getNome() + " esta com " + two + " pontos");
	   one = one + aleatorio.nextInt(40);
	   two = two + aleatorio.nextInt(40);
	   System.out.println(" ROUND 2 " + desafiante.getNome() + " esta com " + one + " pontos e " + desafiado.getNome() + " esta com " + two + " pontos");
	   one = one + aleatorio.nextInt(40);
	   two = two + aleatorio.nextInt(40);
	   System.out.println(" ROUND 3 " + desafiante.getNome() + " esta com " + one + " pontos e " + desafiado.getNome() + " esta com " + two + " pontos");
	   one = one + aleatorio.nextInt(40);
	   two = two + aleatorio.nextInt(40);
	   if (one > two) {
	    System.out.println("O VENCEDOR É " + this.desafiante.getNome() + " por " + one + " pontos " + " a " + two + " pontos do " + this.desafiado.getNome());
	   }else {
	    System.out.println("O VENCEDOR É " + this.desafiado.getNome() + " por " + two + " pontos " + " a " + one + " pontos do  " + this.desafiante.getNome());
	   }

	  } else {
	   System.out.println("A LUTA NAO PODE ACONTECERT!");
	  }
	 
