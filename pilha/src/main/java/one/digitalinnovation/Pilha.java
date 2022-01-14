package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha=null;

    }

    public void push(No novoNo){
        //guarda a ref de entrada
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha=novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop (){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }

        return false;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "------------------\n";

        No noAuxuliar = refNoEntradaPilha;

        while (true){
            if(noAuxuliar != null){
                stringRetorno += "[No{dado= "+noAuxuliar.getDado()+"}]\n";
                noAuxuliar = noAuxuliar.getRefNo();
            }else{
                break;
            }

        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }


}
