public class Main {
    public static void main(String[] args) {
        
     System.out.println("PRESTAMOS A SOLA FIRMA EN U$S");

       // La moneda de monto, cuota e interesesTotales es U$S
        float monto = 500.16f;
      //cantidadCuotas es la cantidad de meses que voy a demorar en pagar el préstamo
        int cantidadCuotas = 29;

       System.out.println("El monto solicitado es: "+ monto + " U$S");

        float intereses  ;
        if(cantidadCuotas<=6) {intereses = 1.00f;} else if(cantidadCuotas>6 && cantidadCuotas<24) {intereses = 1.13f;} else {intereses=1.28f;}
        
      //cuota es lo que tengo que pagar este mes si no pagué todo el préstamo
       float cuota = (monto / cantidadCuotas)  ;


        float interesTotal =  cuota * intereses * cantidadCuotas;

        System.out.println("La cuota de este mes es de: "+ cuota + " U$S");

        System.out.println("El pago total es de: "+interesTotal+" U$S");
    }
    
}
