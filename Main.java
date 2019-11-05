import java.util.*;
import TrabajoMapa.MapaCoordenada;

class Main {

  public static void TrabajoMapa() {
    ArrayList<MapaCoordenada> lista = new ArrayList<MapaCoordenada>();
    
    double Latitud, Longitud;
    int numLados;
    Scanner input = new Scanner(System.in);
   
    System.out.println("Cuantas coordenadas desea ingresar??");
    numLados = input.nextInt();
        
    for (int x = 0; x < numLados; x++) {
      // Aqui ingresamos los datos para las coordenadas
      System.out.println("Ingrese las coordenadas " + (x + 1));
      System.out.println("Ingrese latitud ");
      Latitud = input.nextDouble();
      System.out.println("Ingrese  longitud " );
      Longitud = input.nextDouble();

      MapaCoordenada o = new MapaCoordenada();
      o.lat = Latitud;
      o.lonj = Longitud;

      lista.add(x, o);

    }
    System.out.println("======================================");

    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");
    for (int x = 0; x <= numLados; x++) {
      if (x != numLados) {
        System.out.print(lista.get(x).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(x).lonj);
        System.out.print("%0A");
      } else {
        System.out.print(lista.get(0).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(0).lonj);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("");
    System.out.println("Formemos un Polígono!!!!");
    System.out.println("");
    TrabajoMapa();

  }
}