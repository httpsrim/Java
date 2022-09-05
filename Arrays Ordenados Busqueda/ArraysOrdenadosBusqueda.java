//Método de búsqueda binaria de arrays ordenados

public class ArraysOrdenadosBusqueda{
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,6,7,8,9,10,15,17,20,45,60,68,74,75};
       
        int buscar = 68;
        int mitad;
        int limit_sup = numeros.length - 1;
        int limit_inf = 0;
        boolean encontrado = false;
        while((!encontrado) && (limit_sup >=limit_inf)){
       
            mitad = (limit_sup + limit_inf)/2;
            if(numeros[mitad] > buscar){
                limit_sup = mitad - 1; 
                System.out.println("mitad arriba");
            }
            else if(numeros[mitad] == buscar){
                encontrado = true;
                System.out.println("encontrao");
            }
            else{
                limit_inf = mitad + 1;
                System.out.println("mitad abajo");
            }
        }
        if(encontrado){
            System.out.println("Numero encontrado, el numero era " + buscar);
        }
        else{
            System.out.println("Numero no encontrado");
        }
    }
}