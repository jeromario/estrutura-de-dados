package org.example;

public class Pilha {

    private No refEntradaPilha;

    public Pilha() {
        this.refEntradaPilha = null;
    }

    public No pop(){
        if (!isEmpty()){
            No poped = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getRefNo();
            return poped;
        }
        return null;
    }

    public void push(No novoNo){
        No noAuxiliar = refEntradaPilha;
        refEntradaPilha = novoNo;
        refEntradaPilha.setRefNo(noAuxiliar);
    }

    public No top(){
        return refEntradaPilha;
    }

    public boolean isEmpty(){
        return this.refEntradaPilha == null;
    }

    @Override
    public String toString() {
       String strRetorno = "-------------\n";
       strRetorno += "   Pilha\n";
       strRetorno += "-------------\n";
       No noAuxiliar = refEntradaPilha;

       while (true){
           if (noAuxiliar != null){
               strRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
               noAuxiliar = noAuxiliar.getRefNo();

           }else {
               break;
           }
       }
       strRetorno += "============\n";
       return strRetorno;
    }
}
