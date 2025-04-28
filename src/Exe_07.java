public class Exe_07 {

    //Metodo estatico de imprimir - 1
    public static class MetodosEstaticos{
        public static void mensagem(){
            System.out.println("Estou aprendendo Metodos Estáticos!");
        }
    }
    //Metodo  soma dois numeros - 2
    public static class Calculadora{
        public static int somar(int a,int b){
            return a + b;
        }
    }
    //Metodo dobro - 3
    public class Dobro{
        public static int dobrar(int numero ){
           return numero * 2;
        }
    }
    //Metodo imprimir 3 vezes - 4
    public class LacoRepeticao{
        public static void imprimirLaco(String mensagem){
            for (int i = 0; i < 3; i++){
                System.out.println(mensagem);
            }
        }
    }
    //Metodo para saber se é par
    public class Par{
        public static boolean ehPar(int Num){
            return Num % 2 == 0;
        }
    }

    // EXECUÇÃO

    public static void main(String[] args) {
        //Metodo 1
        MetodosEstaticos.mensagem();

        //Metodo 2
        int resultado = Calculadora.somar(7,10);
        System.out.println("O resultado da soma é : "+ resultado);

        //Metodo 3
        System.out.println("O dobro do número é :" + Dobro.dobrar (9));

        //Metodo 4
        LacoRepeticao.imprimirLaco("Aprendi Java e metodos estáticos!");

        //Metodo 5
        int numero1 = 10;
        int numero2 = 15;
        System.out.println(numero1 + " é um numero par? " + Par.ehPar(numero1));
        System.out.println(numero2 + " é um numero par? " + Par.ehPar(numero2));
    }
}
