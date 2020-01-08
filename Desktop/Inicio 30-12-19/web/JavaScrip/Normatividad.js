var pdf=document.getElementById("pdf12");
var ubicacion="Acuerdos"
var linkAcuerdo=[14];
linkAcuerdo[0]="/Acuerdo 345.pdf";
linkAcuerdo[1]="/Acuerdo 442.pdf";
linkAcuerdo[2]="/Acuerdo 444.pdf";
linkAcuerdo[3]="/Acuerdo 445.pdf";
linkAcuerdo[4]="/Acuerdo 447.pdf";
linkAcuerdo[5]="/Acuerdo 449.pdf";
linkAcuerdo[6]="/Acuerdo 450.pdf";
linkAcuerdo[7]="/Acuerdo 480.pdf";
linkAcuerdo[8]="/Acuerdo 484.pdf";
linkAcuerdo[9]="/Acuerdo 486.pdf";
linkAcuerdo[10]="/Acuerdo 488.pdf";
linkAcuerdo[11]="/Acuerdo 653.pdf";
linkAcuerdo[12]="/Acuerdo 656.pdf";
linkAcuerdo[13]="/Acuerdo 657.pdf";
linkAcuerdo[14]="/Acuerdo657-Aclaracion_DOF_16-01-2013.pdf";
	function cambioPdf(numero){
		pdf.src=ubicacion+linkAcuerdo[numero.id];
			};








































