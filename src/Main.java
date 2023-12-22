public class Main {
    public static void main(String[] args) {
        
     System.out.println("PRESTAMOS A SOLA FIRMA EN U$S");

       // La moneda de monto, cuota e interesesTotales es U$S
        float monto = 500.16f;
      //cantidadCuotas es la cantidad de meses que voy a demorar en pagar el préstamo
        int cantidadCuotas = 8;

       

        float intereses = 0.13f ;
        
      //cuota es lo que tengo que pagar este mes si no pagué todo el préstamo
       float cuota = (monto / cantidadCuotas) * (1.00f+0.13f) ;


        float interesTotal =  monto * intereses * cantidadCuotas;

        System.out.println("La cuota de este mes es de: "+ cuota + " U$S");

        System.out.println("El pago total es de: "+interesTotal+" U$S");
    }
    
}
