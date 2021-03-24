public class Ejercicio1
{
    public int copiaSeguridad(){
        int infoMaquina=5120;
        int capacidad=700;
        int res=infoMaquina/capacidad;
        if(infoMaquina%700!=0){
            res=res+1;
        }
        return res;
        
    }
}
