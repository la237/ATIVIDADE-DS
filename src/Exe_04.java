public class Exe_04 {

    //Metodo de multiplicação 2 numeros - 1
    public static int multiplicar(int num, int num2){
        return num * num2;
    }

    //Metodo gerar nome e saudação
    public static String gerarBoasVindas(String nome) {
        return "Olá, " + nome + "! Seja Bem-vindo ao nosso time!";
    }

    //Metodo retornar dobro - 3
    public static int calcularDobro(int numero){
        return numero * 2 ;
    }

    //Metodo concatenadas - 4
    public static String escrituras(String palavra1 , String palavra2){
        return palavra1.concat(palavra2);
    }

    //Metodo maior de idade - 5
    public static boolean maiorIdade(int idade){
        return idade >= 18;
    }


    // EXECUÇÃO

    public static void main(String[] args) {

        //Metodo 1
        int resultado = multiplicar(5, 6);
        System.out.println("A multiplicação é: " + resultado);

        //Metodo 2
        String mensagemBoasVindas = gerarBoasVindas("Marcos");
        System.out.println(mensagemBoasVindas);

        //Metodo 3
       int dobro=calcularDobro(6);
        System.out.println("O dobro é: " + (dobro));

        //Metodo 4
        String concatenar = escrituras("Java", " não é dificil!");
        System.out.println(concatenar);

        // Metodo 5
        System.out.println("É maior de idade ? "+ (maiorIdade(30)));
        System.out.println("É maior de idade ? "+ (maiorIdade(15)));
    }
}



