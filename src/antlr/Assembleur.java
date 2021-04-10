package antlr;

import java.util.ArrayList;

public class Assembleur {
    public ArrayList<codeObjet> codeGen;

    public Assembleur(ArrayList<codeObjet> codeGen) {
        this.codeGen = new ArrayList<codeObjet>();
    }
    public void  TraducQuad(Quadruplets quads)
    {
    for (Quadruplet q : quads.quadruplets)
    {
            codeObjet c = new codeObjet("MOV","AX",q.operateur1);
            codeGen.add(c);
        if(q.operation=="*")
        {
            codeObjet c2 = new codeObjet("MUL",q.operateur2);
            codeGen.add(c2);
        }
        if(q.operation=="+")
        {
            codeObjet c2 = new codeObjet("ADD",q.operateur2);
            codeGen.add(c2);
        }
        if(q.operation=="-")
        {
            codeObjet c2 = new codeObjet("SUB",q.operateur2);
            codeGen.add(c2);
        }
        if(q.operation=="/")
        {
            codeObjet c2 = new codeObjet("DIV",q.operateur2);
            codeGen.add(c2);
        }
        if(q.operation=="=")
        {
            codeObjet c2 = new codeObjet("MOV",q.operateur2,"AX");
            codeGen.add(c2);
        }
    }}
}
