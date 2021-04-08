package antlr;

public class Element {
	public String id;
	public String type;
	public String valeur ;
	public boolean declare;
	
	
	public Element(String id, String type, boolean declare) {
		this.id = id;
		this.type = type;
		this.declare = declare;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public boolean isDeclare() {
		return declare;
	}
	public void setDeclare(boolean declare) {
		this.declare = declare;
	}
	@Override
	public String toString() {
		return "Element [id=" + id + ", type=" + type + ", valeur=" + valeur + ", declare=" + declare + "]";
	}

}
