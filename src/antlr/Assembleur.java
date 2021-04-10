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
        if (q.operation =="*" || q.operation =="/" || q.operation=="+" || q.operation=="-" || q.operation=="=") {
            //Operation
            codeObjet c = new codeObjet("MOV", "AX", q.operateur1);
            codeGen.add(c);
            if (q.operation == "*") {
                codeObjet c2 = new codeObjet("MUL", q.operateur2);
                codeGen.add(c2);
            }
            if (q.operation == "+") {
                codeObjet c2 = new codeObjet("ADD", q.operateur2);
                codeGen.add(c2);
            }
            if (q.operation == "-") {
                codeObjet c2 = new codeObjet("SUB", q.operateur2);
                codeGen.add(c2);
            }
            if (q.operation == "/") {
                codeObjet c2 = new codeObjet("DIV", q.operateur2);
                codeGen.add(c2);
            }
            if (q.operation == "=") {
                codeObjet c2 = new codeObjet("MOV", q.operateur2, "AX");
                codeGen.add(c2);
            }
        }
        //Branchement
        if(q.operation=="BE" || q.operation=="BNE" || q.operation=="BLE" || q.operation =="BL" || q.operation=="BGE" || q.operation=="BG")
        {
            /// (Branchement, adresse, opG, opD)
            //Operation
            codeObjet c = new codeObjet("MOV", "AX", q.operateur1);
            codeGen.add(c);
            c = new codeObjet("MOV", "AX", q.operateur2);
            codeGen.add(c);
            codeObjet c2 = new codeObjet("CMP", "AX", q.resultat);
            codeGen.add(c2);
            //branchement
            if(q.operation=="BE") {
                c2 = new codeObjet("JE", "AX", q.operateur1);
                codeGen.add(c2);
            }
            //branchement
            if(q.operation=="BNE") {
                c2 = new codeObjet("JNE", "AX", q.operateur1);
                codeGen.add(c2);
            }
            if(q.operation=="BLE") {
                c2 = new codeObjet("JLE", "AX", q.operateur1);
                codeGen.add(c2);
            }
            if(q.operation=="BL") {
                c2 = new codeObjet("JL", "AX", q.operateur1);
                codeGen.add(c2);
            }
            if(q.operation=="BGE") {
                c2 = new codeObjet("JGE", "AX", q.operateur1);
                codeGen.add(c2);
            }
            if(q.operation=="BG") {
                c2 = new codeObjet("JG", "AX", q.operateur1);
                codeGen.add(c2);
            }
        }
            //Instruction d'écriture ou
            if(q.operation=="READ" || q.operation =="WRITE")
            {
                if(q.operation=="READ")
                {
                   codeObjet c2 = new codeObjet("INPUT", "AX", q.operateur1);
                    codeGen.add(c2);
                }
                if(q.operation=="WRITE")
                {
                  codeObjet  c2 = new codeObjet("OUTPUT", "AX", q.operateur1);
                    codeGen.add(c2);
                }

            }


        }
    }


    }

