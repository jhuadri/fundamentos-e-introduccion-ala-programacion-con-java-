public class Ejercicio2{
    public int planificacionEconomica(int a,int b,int c){
        int sumar=a+b+c;
        int res1= a>b? a:b;
        int res2= res1>c? res1:c;
        return sumar-res2;
        }
    }

