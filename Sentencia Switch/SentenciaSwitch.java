public class SentenciaSwitch{
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 2;
        switch(numero1+numero2){
            case 5:
                System.out.println("El resultado es 5");
                break;
            case 3:
                System.out.println("El resultado es 3");
                break;
            default:
                System.out.println("No se de que me estas hablando");
                break;
        }
    }
}