public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = {4,6,2,1};
        int tmp;
        for(int i = 0; i < numeros.length-1;i++){
            for(int j = i+1; j < numeros.length;j++){
                if(numeros[i] > numeros[j]){
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.println(numeros[i]);
        }
    }
}

//Para que sea de forma descendente se utiliza el símbolo <
