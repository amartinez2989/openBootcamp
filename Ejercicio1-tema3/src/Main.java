public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        suma(a,b);

        // creacion del objeto auto
        coche miCoche = new coche();
        miCoche.incrementarPuerta();
        System.out.println("Cantitad de puertas del coche: "+miCoche.puerta);
    }


    public static void suma(int a, int b){
        int resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);

    }
}
class coche {
    public int puerta = 4;

    public void incrementarPuerta(){
        this.puerta ++;
    }
}
