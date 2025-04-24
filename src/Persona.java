import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    List<Perro> lstAdoptados = new ArrayList<>();

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }


    public void adoptarPerro(Perro perro){
        if(lstAdoptados.size() < 3){
            lstAdoptados.add(perro);
            perro.setEstado(false);
            System.out.println("Adopto a " + perro.getNombre());
        }else{
            System.out.println("Ya adopto al maximo de perros posibles");
        }

    }

    public String perroMasGrande(){
        Perro cachorroMasViejo = lstAdoptados.get(0);
        for(Perro e : lstAdoptados){
            if(e.getEdad() > cachorroMasViejo.getEdad()){
                cachorroMasViejo = e;
            }
        }
        return "El perro mas viejo es : " + cachorroMasViejo.getNombre();

    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Perro> getLstAdoptados() {
        return lstAdoptados;
    }

    public void setLstAdoptados(List<Perro> lstAdoptados) {
        this.lstAdoptados = lstAdoptados;
    }

    @Override
    public String toString() {
        String perros = " ";
        for(Perro p : lstAdoptados){
            perros = perros + p.getNombre() + " ,  ";


        }
        return "Persona{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", perros adoptados=" + perros +
                '}';
    }
}

