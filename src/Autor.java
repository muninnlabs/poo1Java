public class Autor extends Pessoa{
    
    private String genero;
    private String formacao;

    public Autor(String nome, int idade, String cidadeDeNascimento, String genero, String formacao) {
        super(nome, idade, cidadeDeNascimento);
        this.genero = genero;
        this.formacao = formacao;
    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        String formacoes[]={
            "Especialista",
            "Mestre",
            "Doutor",
            ""
        };
        for (int i = 0; i < formacoes.length; i++) {
            if(formacoes[i].equals(formacao)){
                this.formacao = formacao;
            }else{
                this.formacao = "O valor fornecido para formacao é inválido";
            }
        }
    }
    public void showAutor(){
        System.out.println(
            "Nome autor: " + this.nome + 
            " Idade autor: " + this.idade +  
            " Cidade autor: " + this.cidadeDeNascimento +  
            " Genero autor: " + this.genero + 
            " Formacao autor: " + this.formacao);
    }
    
}
