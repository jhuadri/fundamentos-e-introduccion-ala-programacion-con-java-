public class Ejercicio6{
    public String edades(String a,int n1,String b,int n2,String c,int n3){
        String res="el menor es : ";
        if (n1 > n2) {
            if (n1 > n3) {
                res=("el mayor es: " + a + n1);                                             
            } else {
                res=("el mayor es: " + c + n3);     
            }
        } else if (n2 > n3) {
            res=("el del medio es: " + b + n2);
        } else {
            res=("el del medio es: " + c + n3);
        }
        return res;
    }
}
  