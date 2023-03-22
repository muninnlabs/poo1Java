public class App {
    public static void main(String[] args) throws Exception {
        Autor tolkien = new Autor("J. R. R. Tolkien", 132, "Bloemfontein", "Masculino", "Doutor");
        Livro lotr = new Livro("Lord of The Rings", tolkien, "Bilbo Baggins", "The Shire", 1954, 123456789);

        System.out.println("Nome: " + lotr.getNome());
        System.out.println("Editora: " + lotr.getEditora());
        System.out.println("Cidade: " + lotr.getCidade());
        System.out.println("Ano pub: " + lotr.getAnoPublicacao());
        System.out.println("Num Edicao: " + lotr.getNumeroEdicao());
        lotr.getAutor().showAutor();
        
        
    }
}
