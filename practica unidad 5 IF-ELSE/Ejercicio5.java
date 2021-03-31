public class Ejercicio5{
    public String numParientes(int a,int b){
       String res;
       if(a%b==0 || b%a==0){
            res="son parientes";
       }else{
            res=" no son parientes";
       }
        return res;
    }
}

