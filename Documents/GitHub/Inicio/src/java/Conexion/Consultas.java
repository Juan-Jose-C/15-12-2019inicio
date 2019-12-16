package Conexion;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {

    static ResultSet rs;
    CallableStatement procedimiento;
    Conexion DB = new Conexion();

    String Id_Avisos;
    String Nombre_Avisos;
    String Id_Tipo;
    String Ruta_Imagen;
    String Ruta_Url;
    String Fecha_Inicio;
    String Fecha_limite;
    String Id_Lugar;

    public Consultas() {
    }

    public Consultas( String Ruta_Imagen,String Ruta_Url) {
        this.Ruta_Imagen = Ruta_Imagen;
        this.Ruta_Url = Ruta_Url;
        
    }

    public String getId_Tipo(){
        return this.Id_Tipo;
    }

    public String getRuta_Imagen(){
        return this.Ruta_Imagen;
    }

    public String getRuta_Url(){
        return this.Ruta_Url;
    }

    
    public CallableStatement sp_SelectConsultaAvis0sConcocatorias(int seleccion) throws SQLException {
       
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaAvisos ("+seleccion+")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        
        return procedimiento;
    
    }
    public void cerrarconexion(){
    try{
    rs.close();
    procedimiento.close();
    DB.Conexion1().close();
    }catch(SQLException e){}
    }

public CallableStatement sp_SelectConsultaDirectorio(int area) throws SQLException {
       
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaDirectorio ("+area+")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        
        return procedimiento;
    
    }
    

public CallableStatement sp_SelectConsultaCatalogoArea() throws SQLException {
       
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectCountCatalogoArea ()}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        
        return procedimiento;
    
    }

public CallableStatement sp_SelectConsultaCatalogoPrograma() throws SQLException {
       
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaCatalogoPrograma ()}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        
        return procedimiento;
    
    }


public CallableStatement sp_SelectConsultaOfertaEducativa(int programa) throws SQLException {
       
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaOfertaEducativa ("+programa+")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        
        return procedimiento;
    
    }
}
