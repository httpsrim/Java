public class Clases {
    String coche;
    String matricula;
    String modelo;

    public Clases(String coche,String matricula,String modelo){
        this.coche = coche;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getCoche(){
        return this.coche;
    }

    public String getMatricula(){
        return this.matricula; 
    }

    public String getModelo(){
        return this.modelo;
    }

    public static void main(String[] args){
        Clases clases = new Clases("Seat","146216BIZ","Leon");
        System.out.println("Coche: " + clases.getCoche());
        System.out.println("Matricula: " + clases.getMatricula());
        System.out.println("Modelo: " + clases.getModelo());
    }
}