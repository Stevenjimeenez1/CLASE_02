import java.util.Scanner;/*traemos la erramienta scaner a nuestro prolleto  */
/**archivos que quieren ser ejecutables nesecitan estas lineas de codigo */
/** el nombre del archivo debe ser igual al de la clase ojo */
public class HolaMundo{

    public static void main(String[] args){
        System.out.println("Hola Mundo!");
        System.out.println("Systemout te puede colocar plantiña salida del sistema imprima algo");
        /*las {} significa que es un bloque */
        /*javac = ejecuta el compilador el cual va a pasar el archivo a binario un archivo .class es binario
          java  = jvm va a ejecutar el compilado java virtual machine
        java compailador y colo camos el nombre del archivo  */
        /* archivo baircode archivo binario lengua maquina  */
        /*print imprime en al misma linea con println coloca salto de linea  */
        /* al lado del % va para formato %n va para cambio de lines  */
        /*plantilla o formato es la primera parte y los valores es la segunda parte  */
        System.out.printf("aqui va una cadena %s", "Cesar");
        System.out.printf("aqui va un entero %d%n", "10");
        System.out.printf("Mi nombre es %s y tengo %d años%n", "jaider", 20);
        /*me permite leer cosas del teclado cosas que escriba el usuario  */
        var entrada = new Scanner(System.in);
        System.out.print( "por favor escriba un numero entero: ");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();


    }
}