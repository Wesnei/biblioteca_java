
public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro() {
        System.out.println("Novo livro criado");
    }

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (temAutor()) {
            System.out.println("Autor:");
            System.out.println("Nome: " + autor.getNome());
            System.out.println("Email: " + autor.getEmail());
            System.out.println("CPF: " + autor.getCpf());
        } else {
            System.out.println("Este livro não tem autor.");
        }
        System.out.println("--");
    }

    void aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor() {
        return this.autor != null;
    }
}
