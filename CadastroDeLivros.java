public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123.456.789.10");
        Autor autor2 = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br", "123.456.789.10");
        Autor autor3 = new Autor("Wesnei Paiva", "wesneipaiva@gmail.com", "123.456.789.10");

        Livro livro1 = new Livro();
        livro1.nome = "Java 8 Prático";
        livro1.descricao = "Novos recursos da linguagem";
        livro1.valor = 59.90;
        livro1.isbn = "978-85-66250-46-6";
        livro1.autor = autor1;

        livro1.mostrarDetalhes();

        Livro livro2 = new Livro();
        livro2.nome = "Lógica de Programação";
        livro2.descricao = "Crie seus primeiros programas";
        livro2.valor = 59.90;
        livro2.isbn = "978-85-66250-22-0";
        livro2.autor = autor2;

        livro2.mostrarDetalhes();

        Livro livro3 = new Livro();
        livro3.nome = "Código de ouro";
        livro3.descricao = "Programação aplicada em projetos reais";
        livro3.valor = 99.90;
        livro3.isbn = "978-85-66250-22-0";
        livro3.autor = autor3;

        livro3.mostrarDetalhes();

    }
}


