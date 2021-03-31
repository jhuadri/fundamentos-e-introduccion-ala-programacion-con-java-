public class Ejercicio9{
    public String anioBisiesto(int anio){
        String res="no es bisiesto";
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            res="es bisiesto";
        }
        return res;
    }
}

