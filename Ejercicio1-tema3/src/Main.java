public class Main {
    public static void main(String[] args) {
    int numeroIf= -9;
    if (numeroIf==0){
        System.out.println("numero igual a 0");
    }else if (numeroIf>0){
        System.out.println("numero mayor a 0");
    }else{
        System.out.println("numero negativo");
    }

        // segunda parte
        int numeroWhile = 0;
        while(numeroWhile < 3 ) {
            numeroWhile = numeroWhile +1;
            System.out.println("numeroWhile es: "+numeroWhile);

        }

        // tercera parte
        int numeroDoWile = 2;
        do {
            System.out.println("numeroDoWile: "+numeroDoWile);
            numeroDoWile = numeroWhile +1;
        } while (numeroDoWile < 3 );

        // cuarta parte
        int numeroFor = 0;
        for (int i = 0; i < 3; i++){
            numeroFor = numeroFor +1;
            System.out.println("numeroFor: "+numeroFor);
        }

        // quinta parte
        String estacion = "verano";
        switch(estacion) {
            case "verano":
                System.out.println("estacion es verano");
                break;
            case "invierno":
                System.out.println("la estacion es inviertno");
                break;
            case "otoño":
                System.out.println("la estacion es otoño");
                break;
            case "primavera":
                System.out.println("la estacion es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }




}