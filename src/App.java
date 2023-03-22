import javax.sound.midi.Synthesizer;

public class App {
    public static void main(String[] args) throws Exception {
        Autor tolkien = new Autor("J. R. R. Tolkien", 132, "Bloemfontein", "Masculino", "Doutor");
        Livro lotr = new Livro("Lord of The Rings", tolkien, "Bilbo Baggins", "The Shire", 1954, 123456789);
        System.out.println("Versao CSV: " + lotr.generateCSV()); 
        // lotr.imprimir();  
    }
}
