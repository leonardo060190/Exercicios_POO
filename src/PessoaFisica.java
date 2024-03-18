public class PessoaFisica extends Pessoa{
    //PessoaFisica é uma extensão de Pessoa
    String cpf;

    @Override
    public void exibirDetalhes(){
        //super.exibirDetalhes();
        System.out.println("Nome:"+this.nome);
        System.out.println("Sobrenome:"+this.sobrenome);
        System.out.println("Idade:"+this.idade);
        System.out.println("CPF:"+this.cpf);
    }

}