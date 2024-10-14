public class Aluno {

    private String nome;
    private String login;
    private String RA;

    public Aluno(String nome, String login, String RA){
        this.nome = nome;
        this.login = login;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    
}