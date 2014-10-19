
package boletin.pkg4b;

public class Consumo {
      int km;
    double Litros;
    double vMedia;
    double pGas;

    public Consumo() {
    }

    public Consumo(int km, double litros, double vMedia, double pGas) {
        this.km = km;
        this.Litros= litros;
        this.vMedia = vMedia;
        this.pGas = pGas;
    
        
    }
     public void setKm(int km){
         this.km=km;
     }
     public int getKm(){
         return km;
     }
    
     public void setLitros(double Litros){
          this.Litros=Litros;
     }
     public double getLitros(){
        return Litros;
     }
     
     public void setVMedia(double vMedia){
             this.vMedia= vMedia;
     }
      
     public void setPGas(double pGas){
           this.pGas=pGas;
     }
     public double getPGas()     {
        return pGas;
         
     }   
      
      
} 
