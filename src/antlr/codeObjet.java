package antlr;

public class codeObjet {
    public String codeOp;
    public String op1;
    public String op2;

    public codeObjet(String codeOp, String op1, String op2) {
        this.codeOp = codeOp;
        this.op1 = op1;
        this.op2 = op2;
    }

    public codeObjet(String codeOp, String op1) {
        this.codeOp = codeOp;
        this.op1 = op1;
    }
}
