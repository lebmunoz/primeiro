public class Subtracao {

private int subUm, subDois;

public Subtracao () {
	this.subUm = 1;
	this.subDois = 1;
}

public Subtracao (int prim, int seg){
	this.subUm = prim;
	this.subDois = seg;
}

public int subInterno () {
	return this.subUm - this.subDois;
}

public int subExterno (int um, int dois) {
	return um - dois;
}
}
