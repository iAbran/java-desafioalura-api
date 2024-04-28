import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consultar = new ConsultaPelicula();
        System.out.println("Escriba el numero de la pelicula de Star Wars que quieres consultar");
        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consultar.buscarPelicula(1);
            System.out.println(pelicula);
            GeneradorDeArchivos generador = new GeneradorDeArchivos();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Numero no encontrado " +e.getMessage());
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizo la aplicacion.");
        }
    }
}