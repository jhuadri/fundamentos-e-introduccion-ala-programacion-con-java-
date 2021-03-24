public class Ejercicio3{
   public String Autobus(int dias){
       int presupuesto=45;
       double pasajeNormal=1.80*dias;
       String res="no son los dias correctos";
       if(presupuesto==pasajeNormal){
          res="dias encontrados";
        }
        return res;
   }
}
