import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> lstPersona = new ArrayList<>();
        List<Perro> lstPerro = new ArrayList<>();


        int opc;
        do{
        System.out.println("""
                1.	Registrar personas (se guardan en una lista).
                2.	Registrar perros (se agregan a la lista de disponibles).
                3.	Ver personas registradas.
                4.	Ver perros disponibles.
                5.	Adoptar perro (una persona puede adoptar hasta 3).
                6.	Consultar el perro más viejo adoptado por una persona.
                7.	Salir del programa
                    Digite su opcion:
                    
                
                """);

        opc = teclado.nextInt();

        switch (opc){
            case 1 ->{
                String nombre;
                String apellido;
                int edad;
                String documento;
                System.out.println("Ingrese su nombre: ");
                nombre = teclado.next();
                System.out.println("Ingrese su apellido: ");
                apellido = teclado.next();
                System.out.println("Ingrese su edad: ");
                edad = teclado.nextInt();
                System.out.println("Ingrese su numero de documento: ");
                documento = teclado.next();
                lstPersona.add(new Persona(nombre,apellido,edad,documento));


            }
            case 2 ->{
                String placa;
                String nombre;
                String raza;
                int edad;
                String medida;
                System.out.println("Ingrese placa del perro: ");
                placa = teclado.next();
                System.out.println("Ingrese nombre del perro: ");
                nombre = teclado.next();
                System.out.println("Ingrese la raza del perro: ");
                raza = teclado.next();
                System.out.println("Ingrese la edad del perro: ");
                edad = teclado.nextInt();
                System.out.println("Ingrese la medida del perro: ");
                medida = teclado.next();
                lstPerro.add(new Perro(placa,nombre,raza,edad,medida));



            }
            case 3 ->{
                for(Persona u : lstPersona){
                    if(u instanceof Persona){
                        System.out.println(u);

                    }


                }


            }
            case 4 ->{
                for(Perro u : lstPerro){
                    if(u instanceof Perro){
                        if(u.isEstado()){
                            System.out.println(u);
                        }


                    }


                }




                }



            case 5 ->{
                String documento1;
                String placa1;
                System.out.println("Digite su documento: ");
                documento1 = teclado.next();
                System.out.println("Digite la placa del perro que desea adoptar: ");
                placa1 = teclado.next();
                for(Persona u : lstPersona){
                    if(u.getDocumento().equalsIgnoreCase(documento1)){
                        for(Perro e : lstPerro){
                            if(e.getPlaca().equalsIgnoreCase(placa1)){
                                u.adoptarPerro(e);
                            }
                        }


                    }

                }



            }
            case 6 ->{
                String documento;
                System.out.println("Digite su documento: ");
                documento = teclado.next();
                for(Persona u : lstPersona){
                    if(u.getDocumento().equalsIgnoreCase(documento)){
                        System.out.println(u.perroMasGrande());
                    }
                }




            }
            case 7 ->{
                System.out.println("BAy");
            }

        }
        }while(opc != 7);
    }
}