import java.util.*; //import faz importação de pacotes java, voce pode coloca tambem * para informa que voce vai usar todo pacote
//voce tambem pode criar seus proprios pacotes seguindo a convenção, que seria o nome do pacote ao contrario
public class MainClassPrincipal {//esse e o metodo que define sua classe java
   String welcomeMensege = "bem vindo" ;  //Declaração de variavel no escopo global
    public static void main(String[] args){//este e o metodo principal que vai receber os outros metodos
       Scanner entrada = new Scanner(System.in);// para entrada de dados nos usamo scanner nome  = new Scanner(System.in)
       System.out.println("Ola meu nome e : ");
       String name = entrada .next();//Aqui declaramos a variavel name com tipo String = variavel entrada do scanner com parametro.netx()
       System.out.println("Quantos anos : ");
       Integer age = entrada.nextInt();//o .netInt pede a entrada de dados inteiros e com declaraçaõ de tipo Integer
       System.out.printf("Ola meu nome e %s e sua idade e  %s\n ", name , age );// utilize o print f para formatar a concatenação
    }
}
//Java e uma tipagem estatica e deve ser declarada de forma correta