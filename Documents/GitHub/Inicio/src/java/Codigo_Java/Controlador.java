package Codigo_Java;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

//-------------------------------Pagina de Inicio------------------------------------------------------------------
//--------------------------------pagina de Directorio de la coordinacion------------------------------------------
    static int inc = 0;
    static ArrayList<Integer> IdArea = new ArrayList<>();

    public static String getVistaCatalogoArea() throws SQLException {
        Modelo_ConsultaDirectorioCoordinacion modeloD = new Modelo_ConsultaDirectorioCoordinacion();
        String htmlcode = "";
        for (Modelo_ConsultaDirectorioCoordinacion D : modeloD.getSelectConsultaCatalogoArea()) {
            inc++;
            htmlcode += " <li class=\"nav-item\">\n"
                    + "          <a class=\"nav-link\"  id=\"pills-coordinacion-tab\" data-toggle=\"pill\" href=\"#pills-coordinacion" + inc + "\" role=\"tab\" aria-controls=\"pills-coordinacion\" aria-selected=\"false\">" + D.getLonarea() + "</a>\n"
                    + "      </li>\n"
                    + "     ";
            IdArea.add(D.getIdarea());
        }
        return htmlcode;
    }

    public static String getVistaDirectorio() throws SQLException {
        String htmlcode2 = "";
        Modelo_ConsultaDirectorioCoordinacion modeloD = new Modelo_ConsultaDirectorioCoordinacion();
        for (int i = 1; i <= inc; i++) {
            // System.out.println("aaa "+inc+" ++ "+i + "  "+IdArea.get(i-1));
            if (i == 1) {
                htmlcode2 += "<div class=\"tab-pane active\" id=\"pills-coordinacion" + i + "\" role=\"tabpanel\" aria-labelledby=\"pills-coordinacion-tab\">";
            } else {
                htmlcode2 += "<div class=\"tab-pane fade\" id=\"pills-coordinacion" + i + "\" role=\"tabpanel\" aria-labelledby=\"pills-coordinacion-tab\">";
            }
            for (Modelo_ConsultaDirectorioCoordinacion D : modeloD.getSelectConsultaDirectorio(IdArea.get(i - 1))) {
                htmlcode2
                        += "       <p>Nombre :" + D.getNombre() + " </p>\n"
                        + "       <p>Puesto :" + D.getPuesto() + " </p>\n"
                        + "       <p>Ext :" + D.getExt() + " </p>\n"
                        + "       <p>Correo Electrónico :" + D.getEmail() + " </p><hr style=\"color:#000000;\"><hr size=\"10\">\n"
                        + "  ";
            }
            htmlcode2 += "</div>\n";
        }
        inc = 0;
        return htmlcode2;
    }
//--------------------------- Pagina de Oferta Educativa-----------------------------------------------------

    public static String getVistaCatalogoPrograma() throws SQLException {
        String html = "";

        Modelo_ConsultaOfertaEducativa modeloEdu = new Modelo_ConsultaOfertaEducativa();
        for (Modelo_ConsultaOfertaEducativa edu : modeloEdu.getSelectConsultaCatalogoPrograma()) {

            html += 
                     "<button class=\"btn-ghost red secundary round\" >" + edu.getNombreCarrera() + "</button>  \n"
                    ;

        }

        return html;
    }

    public static String getVistaOfertaEducativa() throws SQLException {
        String html = "";
        Modelo_ConsultaOfertaEducativa modeloOfe = new Modelo_ConsultaOfertaEducativa();
        for (Modelo_ConsultaOfertaEducativa edu : modeloOfe.getSelectConsultaOfertaEducativa(1)) {
            html += "<p>" + edu.getCarrera() + "</p>";
        }

        return html;
    }
}
