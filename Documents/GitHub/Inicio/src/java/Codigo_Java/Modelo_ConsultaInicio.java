package Codigo_Java;

import Conexion.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Modelo_ConsultaInicio {

    Consultas m = new Consultas();
    ResultSet rs;

    private String Ruta_Imagen;
    private String Ruta_Url;

    public Modelo_ConsultaInicio() {
    }

    public Modelo_ConsultaInicio(String Ruta_Imagen, String Ruta_Url) {
        this.Ruta_Imagen = Ruta_Imagen;
        this.Ruta_Url = Ruta_Url;
    }

    public String getRuta_Imagen() {
        return Ruta_Imagen;
    }

    public String getRuta_Url() {
        return Ruta_Url;
    }

    public ArrayList<Modelo_ConsultaInicio> getSelectConsultaAvis0sConcocatorias(int seleccion) throws SQLException {
        ArrayList<Modelo_ConsultaInicio> getAvisos = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaAvis0sConcocatorias(seleccion).executeQuery();
            while (rs.next()) {
                getAvisos.add(new Modelo_ConsultaInicio(rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getAvisos;
    }


    /*public static void main(String[] args) throws SQLException {
        Modelo_ConsultaInicio Mo = new Modelo_ConsultaInicio();
        int n = 0;
        for (Modelo_ConsultaInicio Con : Mo.getSelectConsultaAvis0sConcocatorias(2)) {
            n++;
            System.out.println(n + " " + Con.getRuta_Imagen());
        }

    }*/
}
