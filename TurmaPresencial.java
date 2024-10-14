public class TurmaPresencial extends Turma {
    private int frequencia;

    public TurmaPresencial(String codigo, double nota, int frequencia) {
        super(codigo, nota);
        this.frequencia = frequencia;
    }

    public boolean aprovado() {
        return super.aprovado() && frequencia >= 75; 
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}
