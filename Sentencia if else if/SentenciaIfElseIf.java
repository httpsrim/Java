public class SentenciaIfElseIf {
    public static void main(String [] args){
        int numero = 0;
        if(numero % 2 == 0 && numero != 0){
            System.out.println("Es un numero par");
        }
        else if(numero %2 == 0 && numero == 0){
            System.out.println("Es el numero 0");
        }
        else{
            System.out.println("Es un numero impar");
        }
    }
}
