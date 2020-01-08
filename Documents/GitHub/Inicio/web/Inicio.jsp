<%-- 
    Document   : Inicio
    Created on : 20-oct-2019, 17:39:12
    Author     : JUAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigo_Java.Controlador"%>
<!DOCTYPE html>
<html>
    <head>



        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


        <link href="Css/mi-slider.css" rel="stylesheet" type="text/css"/>
        <link href="Css/Barramenu.css" rel="stylesheet" type="text/css"/>
        <link href="Css/Inicio.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScrip/jquery.nivo.slider.js" type="text/javascript"></script>
        <title>Inicio</title>



    </head>
    <body>
        <div >
            <script src="JavaScrip/barramenu1.js" type="text/javascript"></script>
        </div>

        <div class="slider-wrapper theme-mi-slider" >
            <div id="slider" class="nivoSlider">     
                <%= Controlador.getVistaInicioBanner()%>
            </div>
        </div>




        <div id="convocatorias">   

            <div class="container" style="background: " >
                <section class="card-container"> 
                    <%=Controlador.getVistaInicioConvocatorias()%>
                </section>

                <h3>No te lo pierdas</h3>
                <hr class="red">

                <section class="card-container">
                   <%=Controlador.getVistaInicioavisos()%>
                </section>


                
                
                
                <div class="overlay" id="overlay">
                    <div class="popup" id="popup">
                        <a  class="btn-cerrar-popup" onclick="cerrar();"><i class="fas fa-times" id="eventoclic"> X </i></a>
                        <form action="">
                            <embed  height="450" width="100%" name="embed_content" id="pdf12" src="" type="application/pdf"/>
                        </form>
                    </div>
                </div>

            </div>
        </div>





        <script src="JavaScrip/popup.js" type="text/javascript"></script>
        <script src="https://framework-gb.cdn.gob.mx/qa/gobmx.js"></script>

    </body>


</html>
