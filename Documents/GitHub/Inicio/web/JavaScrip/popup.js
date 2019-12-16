

/* global overlay, popup, vars */
var pdf=document.getElementById('pdf12');


function abrir(aaa){
	overlay.classList.add('active');
	popup.classList.add('active');
        document.getElementById('pdf12').src=aaa;
        
    };


function ss(as){
    alert(as);
    
};
function cerrar( ){
	
	overlay.classList.remove('active');
	popup.classList.remove('active');
       
}















