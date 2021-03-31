public class Ejercicio8{
    public String fechaLiteral(int d,int m,int a){
        String res;
        switch(m){
            case 1:res=d+" de enero de"+a;break;
            case 2:res=d+" de febrero de"+a;break;
            case 3:res=d+"de marzo de"+a;break;
            case 4:res=d+"de abril de"+a;break;
            case 5:res=d+"de mayo de"+a;break;
            case 6:res=d+"de junio de"+a;break;
            case 7:res=d+"de julio de"+a;break;
            case 8:res=d+"de agosto de"+a;break;
            case 9:res=d+"de septiembre de"+a;break;
            case 10:res=d+"de octubre de"+a;break;
            case 11:res=d+"de noviembre de"+a;break;
            case 12:res=d+"de diciembre de"+a;break;
            default :res="el mes indicado o corresponde a nada";
        }
        return res;
    }
}
