import interfaces.CSVGenerator;

public class Livro implements CSVGenerator{
    
    private String nome;
    private Autor autor;
    private String editora;
    private String cidade;
    private int anoPublicacao;
    private int numeroEdicao;
    
    public Livro(String nome, Autor autor, String editora, String cidade, int anoPublicacao, int numeroEdicao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public String generateCSV(){
        return this.nome+";"+autor.nome+";"+this.cidade+";"+this.editora+";"+this.anoPublicacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumeroEdicao(int numeroEdicao){
        this.numeroEdicao = numeroEdicao;
    }
    
    public String getNome(){
        return nome;
    }

    public Autor getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public String getCidade(){
        return cidade;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public int getNumeroEdicao(){
        return numeroEdicao;
    }

    public void imprimir() {
        System.out.println( "Nome: " + this.getNome());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Ano Publicacao: " + this.getAnoPublicacao());
        System.out.println("Numero edicao: " + this.getNumeroEdicao());
        this.getAutor().showAutor();
    }
}
