public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String medida;
    private boolean estado;

    public Perro(String placa, String nombre, String raza, int edad, String medida) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.medida = medida;
        this.estado=true;
    }

    public Perro(){


    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;

    }


    @Override
    public String toString() {
        return "Perro{" +
                "placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", medida='" + medida + '\'' +
                '}';
    }
}
