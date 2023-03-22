public class App {
    public static void main(String[] args) throws Exception {
        Livro LOTR = new Livro();
        
        LOTR.setNome("Lord of The Rings");
        LOTR.setAutor("J. R. R. Tolkien");
        LOTR.setEditora("Bilbo Baggins");
        LOTR.setCidade("The Shire");
        LOTR.setAnoPublicacao(1954);
        LOTR.setNumeroEdicao(123456789);

        // LOTR.imprimir();

        System.out.println("Nome: " + LOTR.getNome());
        System.out.println("Autor: " + LOTR.getAutor());
        System.out.println("Editora: " + LOTR.getEditora());
        System.out.println("Cidade: " + LOTR.getCidade());
        System.out.println("Ano pub: " + LOTR.getAnoPublicacao());
        System.out.println("Num Edicao: " + LOTR.getNumeroEdicao());
        
        
    }
}
