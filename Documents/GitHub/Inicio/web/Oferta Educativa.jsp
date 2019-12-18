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
            <section class="bg-dark btn-container" >
                
                <div class="btn-item coo" id="clic">

                    <%=Controlador.getVistaCatalogoPrograma()%>         
                </div>

            </section>
            
                <button class="btn-ghost red round"> servelet </button>
            </form>

                
            
                
                
               
                
                
            <button class="btn-ghost red round" id="1234"> Consulta </button> 

            <section id="145">

            </section>

            <!-- 
              <input class="btn-ghost red round" type="submit" value="sas">
            
            <section class="bg-dark btn-container">
      <div class="btn-item">
         <a href="#" class="btn-ghost red round" >primario</a>
         <a href="#" class="btn-ghost red secundary round" >secundario</a>
       
         <a href="#" class="btn-ghost blue round" >primario</a>
         <a href="#" class="btn-ghost pink secundary round" >secundario</a>
       </div>
       
        <div class="btn-item">
         <a href="#" class="btn-ghost red round" >primario</a>
         <a href="#" class="btn-ghost red secundary round" >primario</a>
       </div>
       
       <div class="btn-item">
         <a href="#" class="btn-ghost blue round" >primario</a>
         <a href="#" class="btn-ghost blue secundary round" >secundario</a>
       </div>
       
       <div class="btn-item">
         <a href="#" class="btn-ghost purple round" >primario</a>
         <a href="#" class="btn-ghost purple secundary round" >secundario</a>
       </div>
       
       <div class="btn-item">
         <a href="#" class="btn-ghost yellow round" >primario</a>
         <a href="#" class="btn-ghost yellow secundary round" >secundario</a>
       </div>
       
       <div class="btn-item">
         <a href="#" class="btn-ghost green round" >primario</a>
         <a href="#" class="btn-ghost green secundary round" >secundario</a>
       </div>
     
       
     
       
     </section>
            -->
        </div>  




        <script src="JavaScrip/Oferta Educativa.js" type="text/javascript"></script>


        <script src="https://framework-gb.cdn.gob.mx/qa/gobmx.js"></script>
    </body>
</html>
