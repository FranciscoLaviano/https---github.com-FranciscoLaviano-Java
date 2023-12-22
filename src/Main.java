public class Main {
    public static void main(String[] args) {
        
     float number = 22.176f;
     int unit = 1;

     float modulo = number % unit;

     int parteEntera = (int)number / unit;

     System.out.println(number);
     System.out.println("El modulo es: "+modulo);
     System.out.println("Su parte entera es: "+parteEntera);
    }
    
}
