package app;
//LA IMPORTACIÓN SIGUIENTE ES
//NECESARIA PARA MANIPULAR EL
//PARÁMETRO DE ENTRADA DE SU
//PROPUESTA DE SOLUCIÓN. NO LA
//DESCARTE
import java.util.ArrayList;

public class Solution{

    double promedioMeta;
    String nombreMenorTiempo;
    double menorTiempo;
    String nombreMayorTiempo;
    double mayorTiempo;

    public Solution(double promedioMeta, String nombreMenorTiempo, double menorTiempo, String nombreMayorTiempo, double mayorTiempo){
        this.promedioMeta=promedioMeta;
        this.nombreMenorTiempo=nombreMenorTiempo;
        this.menorTiempo=menorTiempo;
        this.nombreMayorTiempo=nombreMayorTiempo;
        this.mayorTiempo=mayorTiempo;
    }

    public static Object [] reporte(ArrayList <Corredor> carrera){
        
        //ESCRIBA LA LÓGICA DE SU PROPUESTA
        //DE SOLUCIÓN. NO OLVIDE INDICAR EL
        //OBJETO QUE ESTA VA A RETORNAR
        double promedioMeta;
        String nombreMenorTiempo;
        double menorTiempo = 1000;
        String nombreMayorTiempo;
        double mayorTiempo = 0;


        for (Corredor c : carrera){
            promedioMeta =+ Double.parseDouble(c.getTiempoMeta());
            if(Double.parseDouble(c.getTiempoMeta()) < menorTiempo){
                menorTiempo = Double.parseDouble(c.getTiempoMeta());
                nombreMenorTiempo = c.getNombreCompleto();
            }
            if(Double.parseDouble(c.getTiempoMeta()) > mayorTiempo){
                mayorTiempo = Double.parseDouble(c.getTiempoMeta());
                nombreMayorTiempo = c.getNombreCompleto();
            }
        }
        promedioMeta /= carrera.size();
        Solution resultados = new Solution(promedioMeta, nombreMenorTiempo, menorTiempo, nombreMayorTiempo, mayorTiempo);

        return resultados;
    }

    public double getPromedioMeta() {
        return promedioMeta;
    }

    public void setPromedioMeta(double promedioMeta) {
        this.promedioMeta = promedioMeta;
    }

    public String getNombreMenorTiempo() {
        return nombreMenorTiempo;
    }

    public void setNombreMenorTiempo(String nombreMenorTiempo) {
        this.nombreMenorTiempo = nombreMenorTiempo;
    }

    public double getMenorTiempo() {
        return menorTiempo;
    }

    public void setMenorTiempo(double menorTiempo) {
        this.menorTiempo = menorTiempo;
    }

    public String getNombreMayorTiempo() {
        return nombreMayorTiempo;
    }

    public void setNombreMayorTiempo(String nombreMayorTiempo) {
        this.nombreMayorTiempo = nombreMayorTiempo;
    }

    public double getMayorTiempo() {
        return mayorTiempo;
    }

    public void setMayorTiempo(double mayorTiempo) {
        this.mayorTiempo = mayorTiempo;
    }

    

}