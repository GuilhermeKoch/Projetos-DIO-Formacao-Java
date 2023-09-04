package pilha;

public class NoPilha {

    private int dado;
    private NoPilha refNo = null;

    public NoPilha(){
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

        public NoPilha getRefNo() {
        return refNo;
    }

    public void setRefNo(NoPilha noRe) {
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

        public void setReNo(NoPilha refAuxiliar) {
        }
}