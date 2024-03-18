public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1);
        pessoa1.nome = "Filipe";
        pessoa1.sobrenome= "Da Cas";
        pessoa1.idade = 38;
        pessoa1.exibirDetalhes();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2);
        pessoa2.nome = "Euclides";
        pessoa2.sobrenome= "Dolllário";
        pessoa2.idade = 78;
        pessoa2.exibirDetalhes();

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();

        pessoaFisica1.nome = "Bento";
        pessoaFisica1.sobrenome = "Silva";
        pessoaFisica1.idade = 22;
        pessoaFisica1.cpf = "123.456.789-20";
        pessoaFisica1.exibirDetalhes();
    }
}