package com.projetono;

public class No {

    private int dado;
    private No refNo = null;

    public No(){
    }

    public No(int dado) {
        this.dado = dado;
    }

        public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No noRe) {
        this.refNo = noRe;
    }

    public int getDado() {
            return dado;
        }

        public void setDado(int dado) {
            this.dado = dado;
        }

        public String toString(){
            return "No = [Dado = " + dado +"]";
        }

        public void setReNo(No refAuxiliar) {
        }
}