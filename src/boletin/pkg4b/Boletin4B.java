
package boletin.pkg4b;


public class Boletin4B {

   
    public static void main(String[] args) {
     Consumo coche1 = new Consumo();
         coche1.setLitros(50);
         coche1.setPGas(1.57);
   
     System.out.println("litros= "+coche1.getLitros());
                      
        Consumo coche2 = new Consumo(500,43,80,1.57);
         coche2.getLitros();
         coche2.getKm();
        System.out.println("consumo medio:" +((coche2.getLitros()/coche2.getKm())*100)+" litros por cada 100 km");
         coche2.getPGas();
         coche2.getKm();
    
        System.out.println("consumo euros" +(((coche2.getPGas()/coche2.getKm()))*100)+" euros por cada 100 km");    
    }
    
}