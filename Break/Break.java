public class Break {
    public static void main(String[] args) {
        switch (3+3){
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            default:
                System.out.println("No es ninguna de las respuestas");
                break;
        }
    }
}
