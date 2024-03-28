package Avaliacao.Pet;

public class Pet {

    String nome;
    String especie;
    int idade;

    @Override
    public String toString() {
        return " Especie: " + especie +
                ", nome: " + nome +
                ", idade: " + idade ;
    }
}
