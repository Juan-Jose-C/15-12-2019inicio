package Codigo_Java;

import Conexion.Consultas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class Proceso_de_consulta {

    Calendar calendario = Calendar.getInstance();
    static Consultas m = new Consultas();
    static ResultSet rs;

     static ArrayList<Consultas> vector = new ArrayList<Consultas>();
   // public static int finalbanner=0,finalconvocatorias=0;
    
    
    public static void InsertandoDatos(int tipo) throws SQLException {
        rs = m.sp_SelectConsultaAvis0sConcocatorias(tipo).executeQuery();
        while (rs.next()) {
            vector.add(new Consultas(rs.getString(4), rs.getString(5)));   
        }
       m.cerrarconexion();
    }
    
     public static int longitud(int tipo) throws SQLException{
        int tamaño=0; 
        rs = m.sp_SelectConsultaAvis0sConcocatorias(tipo).executeQuery();
         while (rs.next()) {
           tamaño++;
        }
      m.cerrarconexion();
    return tamaño; 
    }
    
    public static String ImagenPrincipal(int posicion) throws SQLException {
        return "Imagenes/" + vector.get(posicion).getRuta_Imagen();
        //return ""+vector.size();
    }
    public static String ru(int posicion) throws SQLException {
        return "Url/" + vector.get(posicion).getRuta_Url();
    }
}