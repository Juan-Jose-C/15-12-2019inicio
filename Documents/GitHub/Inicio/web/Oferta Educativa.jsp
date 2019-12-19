<%-- 
    Document   : Oferta Educativa
    Created on : 15-dic-2019, 11:29:14
    Author     : JUAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigo_Java.Controlador"%>
<%@page import="Servelet.Controlador_OfertaEducativa"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 


        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <link rel="stylesheet" href="https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="Css/Oferta Educativa.css" rel="stylesheet" type="text/css"/>

        <title>Oferta Educativa</title>
    </head>
    <body>
        <div id="espacioherencia">
            <script language="javascript" type="text/javascript" src="JavaScrip/barramenu1.js"></script>
        </div>
        <div class="contenedor">
            <center><h2>Oferta Educativa</h2></center>
        </div>
        <div class="container">




            <form action="Controlador_OfertaEducativa2" method="post">

                <div class="btn-item coo" id="clic">
                    <%=Controlador.getVistaCatalogoPrograma()%>         

                </div>
            </form>



            <!--<button class="btn-ghost red round"> servelet </button>--> 



        </div>  

        <script src="JavaScrip/Oferta Educativa.js" type="text/javascript"></script>


        <script src="https://framework-gb.cdn.gob.mx/qa/gobmx.js"></script>
    </body>
</html>
