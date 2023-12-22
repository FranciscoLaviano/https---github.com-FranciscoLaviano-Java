public class Main {
    public static void main(String[] args) {
        
     System.out.println("PRESTAMOS A SOLA FIRMA EN U$S");

       // La moneda es U$S
        float monto = 500.16f;

        int cantidadCuotas = 8;

        float intereses = 0.13f ;


       float cuota = (monto / cantidadCuotas) * (1.00f+0.13f) ;


        float interesTotal =  monto * intereses * cantidadCuotas;

        System.out.println("La cuota de este mes es de: "+ cuota + " U$S");

        System.out.println("El pago total es de: "+interesTotal+" U$S");
    }
    
}
