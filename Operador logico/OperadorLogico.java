public class OperadorLogico {
    public static void main(String[] args) {
        int edad = 19;
        String salida;
        salida = edad >= 18 ? "Mayor de edad" : "Menor de edad";
        System.out.println(salida);
        salida = (3+3 == 8) ? "El valor es 8" : "El valor es otro"; 
        System.out.print(salida);
    }
}
