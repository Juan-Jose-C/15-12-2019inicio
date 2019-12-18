document.getElementById("1234").addEventListener("click",function(){
$.post("Controlador_OfertaEducativa",$(document.forms[0]).serialize(),function(response){
   
    var li=document.getElementById("145");
   var datos=JSON.parse(response);
   li.innerHTML+= "<p>"+datos.carrera.ca+"</p>";
//li.innerHTML+=response;
});        
},false);    


///Controlador_OfertaEducativa



















