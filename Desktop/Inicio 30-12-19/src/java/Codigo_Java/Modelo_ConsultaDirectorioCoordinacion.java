package Codigo_Java;

import Conexion.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Modelo_ConsultaDirectorioCoordinacion {

     Consultas m = new Consultas();
     ResultSet rs;

    private String nombre;
    private String puesto;
    private String ext;
    private String email;
    private String area;
    private int idarea;
    private String lonarea;
    
    public Modelo_ConsultaDirectorioCoordinacion() { }

public Modelo_ConsultaDirectorioCoordinacion(int idarea,String lonarea) {
    this.idarea=idarea;
    this.lonarea=lonarea;
    }
public int getIdarea() {
        return this.idarea;
    }
public String getLonarea() {
        return this.lonarea;
    }
    public Modelo_ConsultaDirectorioCoordinacion(String nombre, String puesto, String ext, String email,String area) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.ext = ext;
        this.email = email;   
        this.area=area;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public String getExt() {
        return this.ext;
    }

    public String getEmail() {
        return this.email;
    }
    
    public String getArea() {
        return this.area;
    }
        
    public ArrayList<Modelo_ConsultaDirectorioCoordinacion> getSelectConsultaDirectorio(int area) throws SQLException {
        ArrayList<Modelo_ConsultaDirectorioCoordinacion> getDirectorio = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaDirectorio(area).executeQuery();
            while (rs.next()) {getDirectorio.add(new Modelo_ConsultaDirectorioCoordinacion(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(10)));}
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getDirectorio;
    }

    public ArrayList<Modelo_ConsultaDirectorioCoordinacion> getSelectConsultaCatalogoArea() throws SQLException {
        ArrayList<Modelo_ConsultaDirectorioCoordinacion> getCatalogoArea = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaCatalogoArea().executeQuery();
            while (rs.next()) {getCatalogoArea.add(new Modelo_ConsultaDirectorioCoordinacion(rs.getInt(1),rs.getString(2)));}
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getCatalogoArea;
    }
    
    
    
   
    

}
