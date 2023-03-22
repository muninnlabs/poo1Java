public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cidadeDeNascimento;
    
    public Pessoa(String nome, int idade, String cidadeDeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeDeNascimento = cidadeDeNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCidadeDeNascimento() {
        return cidadeDeNascimento;
    }
    public void setCidadeDeNascimento(String cidadeDeNascimento) {
        this.cidadeDeNascimento = cidadeDeNascimento;
    }
    

    
}