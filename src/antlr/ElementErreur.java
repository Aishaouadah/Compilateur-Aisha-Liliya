package antlr;

public class ElementErreur {
	public String type_erreur;
	public int ligne;
	public int colonne;
	public ElementErreur(String type_erreur, int ligne, int colonne) {
		this.type_erreur = type_erreur;
		this.ligne = ligne;
		this.colonne = colonne;
	}
	@Override
	public String toString() {
		return "ElementErreur [type_erreur=" + type_erreur + ", ligne=" + ligne + ", colonne=" + colonne + "]";
	}
}
