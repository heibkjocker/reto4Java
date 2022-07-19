package app;
//LA IMPORTACIÓN SIGUIENTE ES
//NECESARIA PARA MANIPULAR EL
//PARÁMETRO DE ENTRADA DE SU
//PROPUESTA DE SOLUCIÓN. NO LA
//DESCARTE
import java.util.ArrayList;

public class Solution {

    public static Object[] reporte(ArrayList<Corredor> carrera) {


        double promedio=0;
        double menor = 1000;
        double mayor = 0;
        String nameMe="";
        String nameMa="";

        for(Corredor c: carrera){
            promedio += c.getTiempoMeta();
            if (c.getTiempoMeta() < menor){
                menor = c.getTiempoMeta();
                nameMe = c.getNombreCompleto();
            }
            if(c.getTiempoMeta() > mayor){
                mayor = c.getTiempoMeta();
                nameMa = c.getNombreCompleto();
            }
        }
        promedio /= carrera.size();
        Object[] resultados = new Object[] {
                promedio,
                nameMe,
                menor,
                nameMa,
                mayor
        };


        return resultados;

    }
}