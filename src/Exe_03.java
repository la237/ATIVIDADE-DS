public class Exe_03 {

    // Imprimir Mensagem - 1
    public static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    //  Imprimir e Soma 2 numeros - 2
    public  static void somarDois(int num, int num2){
        System.out.println("O resultado da soma é: "+ (num + num2));
    }

    //Imprimir nome e idade -  3
    public static void informacao(String nome, int idade) {
        System.out.println("O nome recebido foi: "+ (nome));
        System.out.println("A idade recebida foi: " + idade);
    }

    // Verificar se é (+ ou -) - 4
    public static void verificarNumero(int numero){
        if (numero >= 0){
            System.out.println("O número apresentado é : Positivo");
        }else {
            System.out.println("O número apresentado é : Negativo");
        }
    }

    // Imprimir nome e saudação personalizada -5
    public static void saudacao(String nome , String pesonalizada){
        System.out.println("Olá "+ (nome) + "te desejo um " + (pesonalizada));

    }

    // EXECUÇÃO

    public static void main(String[] args){
        //Metodo 1

        imprimirMensagem("Olá Paulo, estou aprendendo Java!");

        //Metodo 2
        somarDois(7,19);

        //Metodo 3
        informacao("Laryssa",17);
        informacao("Maria Eduarda",16);

        //Metodo 4
        verificarNumero(5);
        verificarNumero(-5);

        //Metodo 5
        saudacao("Laryssa","Bom Feriado! ");
    }
}
