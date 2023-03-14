package edu.feliphe.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Feliphe";
        String segundoNome = "Mickael";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        // retorna uma String contatenada com o valor da variável primeiroNome, um espaço em branco
        // e então o segundoNome.
    }
}
