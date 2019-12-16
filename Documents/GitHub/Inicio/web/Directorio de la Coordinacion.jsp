<%-- 
Document   : Directorio de la Coordinacion
Created on : 05-dic-2019, 20:23:14
Author     : JUAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigo_Java.Controlador"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css">
<link href="Css/Direc.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
    </head>
    <body>
        <div id="espacioherencia">
            <script language="javascript" type="text/javascript" src="JavaScrip/barramenu1.js"></script>
        </div>
    <center><h3 >Directorio de la Coordinación Nacional</h3></center>

    <div class="container">

        <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">

            <!-- <li class="nav-item">
                 <a class="nav-link"  id="pills-coordinacion-tab" data-toggle="pill" href="#pills-coordinacion" role="tab" aria-controls="pills-coordinacion" aria-selected="true">Coordinación</a>
             </li>-->
            <%=Controlador.getVistaCatalogoArea()%>
        </ul>        
        <div class="tab-content" id="pills-tabContent">
            <!-- <div class="tab-pane active" id="pills-coordinacion"+i+1+"" role="tabpanel" aria-labelledby="pills-coordinacion-tab">
                 <p>Nombre: </p>
                 <p>Puesto: </p>
                 <p>Ext: </p>
                 <p>Correo Electrónico: </p><hr style="color:#000000;"><hr size="10">
                </div>-->
            <%=Controlador.getVistaDirectorio()%>

        </div>
    </div>     
    <script src="https://framework-gb.cdn.gob.mx/qa/gobmx.js"></script> 
</body>
</html>
