public class Exe_05 {

    //Metodo de nuemros inteiro e reias - 1
    public static void casaNumericas(int num, double num2) {
        System.out.println("Inteiro: " + (num) + " e " + " Reais: " + (num2));
    }

    //Metodo quadrado e retangulo - 2
    public static double contarLados(double lado) {
        return lado * 4;
    }

    public static double contarLados(double base, double altura) {
        return base * altura;
    }

    //Metodo exibir texto simples e exibir varias vezes -3
    public static void exibirTexto(String texto) {
        System.out.println(texto);
    }

    public static void exibirTexto(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);
        }
    }

    //Metodos de soma 2,3,4 numeros - 4
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static int somar(int num1,int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int somar(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    //Metodo de exibir caracter e strings
    public static void  exibir(char carct){
        System.out.println("Caracter: " + carct);
    }
    public static void  exibir(String strings){
        System.out.println("Strings: "+ strings);
    }




    public static void main(String[] args) {

        //Metodo 1
        casaNumericas(15, 7.5);

        //Metodo 2
        System.out.println("Área do quadrado: " + contarLados(10));
        System.out.println("Área do retângulo: " + contarLados(3, 5));

        //Metodo 3
        exibirTexto("Olá Mundo!");
        exibirTexto("Programando em Java!",5);

        //Metodo 4
        System.out.println("Soma de 2: "+ somar(3,9));
        System.out.println("Soma de 3: "+ somar(7,8,9));
        System.out.println("Soma de 4: "+ somar(1,2,3,4));

        //Metodo 5
        exibir("Lala");
        exibir('/');




    }

}
