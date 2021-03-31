public class Ejercicio4{
    public String deducirEstadoSemaforo(int estado,int nVeces){
        int estadoFinal=4;
        if(estado==0){
            if(nVeces%3==0){
                estadoFinal=0;
            }else if(nVeces%3==1){
                estadoFinal=2;
            }else{
                estadoFinal=1;
            }
        }else if(estado==1){
            if(nVeces%3==0){
                estadoFinal=1;
            }else if(nVeces%3==1){
                estadoFinal=0;
            }else{
                estadoFinal=2;
            }
        }else if(estado==2){
            if(nVeces%3==0){
                estadoFinal=2;
            }else if(nVeces%3==1){
                estadoFinal=1;
            }else{
                estadoFinal=0;
            }
        }
        return dimeColor(estadoFinal);
    }
    public String dimeColor(int num){
        String res="";
        if(num==0){
            res="rojo";
        }else if(num==1){
            res="amarillo";
        }else if(num==2){
            res="verde";
        }
        return res;
    }
}
