public class Ejercicio10{
    public String numerosCrecimiento(int n){
        String res="no esta en crecimiento";
        int n1=n/100;
        int n2 =n%10;
        if(n1<=n2 ){
            res="es un numero en crecimiento";
        }
        return res;
    }
}
