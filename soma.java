public class Soma {

private int somaUm, somaDois;

public Soma () {
	this.somaUm = 0;
	this.somaDois = 0;
}

public Soma (int prim, int seg){
	this.somaUm = prim;
	this.somaDois = seg;
}

public int somaInterno () {
	return this.somaUm + this.somaDois;
}

public int somaExterno (int um, int dois){
	return um + dois;
}
}
