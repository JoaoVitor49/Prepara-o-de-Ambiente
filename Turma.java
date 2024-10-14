public class Turma {
    private String codigo;
    private double nota;

    public Turma(String codigo, double nota) {
        this.codigo = codigo;
        this.nota = nota;
    }

    public boolean aprovado() {
        return nota >= 6.0;  
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}