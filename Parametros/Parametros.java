public class Parametros {
    String coche;
    String matricula;
    String modelo;
    double tarifa;
    double porcentajeDescuento;

    public Parametros(String coche,String matricula,String modelo,double tarifa,double porcentajeDescuento){
        this.coche = coche;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.porcentajeDescuento = porcentajeDescuento;
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

    public double getTarifa(double tarifa){
        return this.tarifa;
    }

    public String getAtributos(){
        return "Coche: " + getCoche() + " " + "Matricula: " + getMatricula() + " "+ "Modelo: " + getModelo() + " " + "Tarifa: "  + (100.0 - porcentajeDescuento)/100*tarifa; 
    }

    public static void main(String[] args){
        Parametros vehiculo = new Parametros("Seat","146216BIZ","Leon",345, 15.00);
        System.out.println(vehiculo.getAtributos());
    }
}