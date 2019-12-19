/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;

import Codigo_Java.Modelo_ConsultaOfertaEducativa;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Codigo_Java.Controlador;

/**
 *
 * @author JUAN
 */
public class Controlador_OfertaEducativa2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Oferta Educativa</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css\">");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
            out.println("<link href=\"Css/Oferta Educativa.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("<link href=\"Css/Inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=\"espacioherencia\">\n"
                    + "            <script language=\"javascript\" type=\"text/javascript\" src=\"JavaScrip/barramenu1.js\"></script>\n"
                    + "        </div>");
            out.println("<div class=\"container\">");
            String noms = request.getParameter("nombre");
            int tipo = Integer.parseInt(noms);

            out.println("<div class=\"btn-item coo\" >");
            out.println(Controlador.getVistaOfertaEducativa(tipo));
            out.println("</div>");

            out.println("<br><br><br><br>");
            out.println(" <a href=\"Oferta Educativa.jsp\" class=\"btn-ghost red round\">Regresar</a>");
            out.println("</div>");

            out.println("<div class=\"overlay\" id=\"overlay\">\n"
                    + "                    <div class=\"popup\" id=\"popup\">\n"
                    + "                        <a  class=\"btn-cerrar-popup\" onclick=\"cerrar();\"><i class=\"fas fa-times\" id=\"eventoclic\"> X </i></a>\n"
                    + "                        <form action=\"\">\n"
                    + "                            <embed  height=\"450\" width=\"100%\" name=\"embed_content\" id=\"pdf12\" src=\"\" type=\"application/pdf\"/>\n"
                    + "                        </form>\n"
                    + "                    </div>\n"
                    + "                </div>");

            out.println("<br><br><br><br>");
            
            out.println("<script src=\"https://framework-gb.cdn.gob.mx/qa/gobmx.js\"></script>");
            out.println(" <script src=\"JavaScrip/popup.js\" type=\"text/javascript\"></script>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_OfertaEducativa2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
