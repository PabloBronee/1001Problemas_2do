public class Problema618 {
    public static void main(String[] args) {
        class Empleado{
            //Atributos
            String nombre;
            double salario;
            int edad;

            //Constructor
            Empleado(String nombre, double salario, int edad){
                this.nombre = nombre;
                this.salario = salario;
                this.edad = edad;
            }

            public boolean esElegible(){
                if (edad > 17 && salario > 0.0){
                    System.out.println(nombre + " es mayor de edad y tiene salario asignado, es elegible");
                    return true;
                }
                else{
                    System.out.println(nombre + " es menor de edad, o NO tiene salario asignado, no es elegible");
                    return false;
                }

            }
        }
        //Creamos dos objetos diferentes, para dar los dos resultados del metodo "esElegible"
        Empleado empleado1 = new Empleado("Pablo",23.000,21);
        Empleado empleado2 = new Empleado("Lucas",0.0,15);

        //Comprobamos el metodo con ambos objetos
        empleado1.esElegible();
        empleado2.esElegible();

    }
}

