package Codigo_Java;

import Conexion.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 
public class Modelo_ConsultaOfertaEducativa {

  static  Consultas m = new Consultas();
    static ResultSet rs;
    
     private int id_carrera;
     private String NombreCarrera;  
     private String Carrera;
     private String Pdf_informacion;
     private String Pdf_programa;
     
    public Modelo_ConsultaOfertaEducativa(){}
    
    public Modelo_ConsultaOfertaEducativa(int id_carrera,String NombreCarrera) {
       this.id_carrera=id_carrera;
        this.NombreCarrera = NombreCarrera;
       
    }

    public int getId_carrera() {
        return id_carrera;
    }
    public String getNombreCarrera() {
        return this.NombreCarrera;
    }

   public ArrayList<Modelo_ConsultaOfertaEducativa> getSelectConsultaCatalogoPrograma() throws SQLException {
        ArrayList<Modelo_ConsultaOfertaEducativa> getPrograma = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaCatalogoPrograma().executeQuery();
            while (rs.next()) {getPrograma.add(new Modelo_ConsultaOfertaEducativa(rs.getInt(1),rs.getString(2)));}
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getPrograma;
    }
   public Modelo_ConsultaOfertaEducativa(String Carrera,String Pdf_informacion,String Pdf_programa){
   this.Carrera=Carrera;
   this.Pdf_informacion=Pdf_informacion;
   this.Pdf_programa=Pdf_programa;
   }
   
   public String getCarrera() {
        return Carrera;
    }
   public String getPdf_informacion() {
        return Pdf_informacion;
    }
    public String getPdf_programa() {
        return Pdf_programa;
    }
   public ArrayList<Modelo_ConsultaOfertaEducativa> getSelectConsultaOfertaEducativa(int programa) throws SQLException {
        ArrayList<Modelo_ConsultaOfertaEducativa> getOferta = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaOfertaEducativa(programa).executeQuery();
            while (rs.next()) {getOferta.add(new Modelo_ConsultaOfertaEducativa(rs.getString(1),rs.getString(2),rs.getString(3)));}
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getOferta;
    }
   
   
   public static void main(String[] args) throws SQLException {
        Modelo_ConsultaOfertaEducativa Mo=new Modelo_ConsultaOfertaEducativa();
        int n=0;
        for (Modelo_ConsultaOfertaEducativa Con:Mo.getSelectConsultaOfertaEducativa(1)) {
         n++;
            System.out.println(n+" "+Con.getCarrera()+" "+Con.getPdf_informacion());
        }
   
    }

    

    
    
}
