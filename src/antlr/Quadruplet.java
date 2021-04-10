package antlr;

public class Quadruplet {
	//Structure
	public String operation;
	public String operateur1;
	public String operateur2;
	public String resultat;
	
	//getters setters 
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperateur1() {
		return operateur1;
	}

	public void setOperateur1(String operateur1) {
		this.operateur1 = operateur1;
	}

	public String getOperateur2() {
		return operateur2;
	}

	public void setOperateur2(String operateur2) {
		this.operateur2 = operateur2;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

    // 	
	public Quadruplet(String operation, String operateur1, String operateur2,String resultat) {
		this.operation = operation;
		this.operateur1 = operateur1;
		this.operateur2 = operateur2;
		this.resultat = resultat;
	}
	  @Override
	    public String toString() {
		  return "(" + operation + "," + operateur1 + "," + operateur2 + "," + resultat + ")";


	  }}
