public class BreakPt2 {
    public static void main(String[] args) {
        int suma = 0;
        do{
            suma = suma + 1;
            System.out.println(suma);
            if(suma == 2){
                break;
            }
        }while(suma < 100);
    }
}
