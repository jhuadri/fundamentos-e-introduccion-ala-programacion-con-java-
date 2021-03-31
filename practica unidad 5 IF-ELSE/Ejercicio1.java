public class Ejercicio1{
    public String numeroCapicua(int n){
        int num1=n/100;
        int num2=n%10;
        String res;
        if(num1==num2){
            res="si es numCapicua";
        }else{
            res="no es";
        }
        return res;
    }
}
