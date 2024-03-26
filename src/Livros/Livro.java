package Livros;

public class Livro {

    private String titulo;

    private  String autor;

    private  int ano;

    private  double preco;

    private  int porcentagemDesconto;



    public Livro(String titulo, String autor, int ano, double preco, int porcentagemDesconto) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public void desconto(double porcentagemDesconto, double preco){
        double valorDoDesconto = (porcentagemDesconto / 100)*preco;
        double valorComDesconto = preco - valorDoDesconto;
        System.out.println("O valor do Desconto é: "+valorDoDesconto);
        System.out.println("O valor total é: "+valorComDesconto);
    }


    public String exibirDetalhes() {
        return
                "titulo: " + titulo +
                ", autor: " + autor +
                ", ano: " + ano +
                ", preco: " + preco ;
    }


    }

