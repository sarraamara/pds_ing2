function verifySpace(areaName){

	const number_bi_T1 = document.querySelectorAll("div."+areaName+" input[type=number]")[0].value;
  	const number_bi_T2 = document.querySelectorAll("div."+areaName+" input[type=number]")[1].value;
  	const number_os = document.querySelectorAll("div."+areaName+" input[type=number]")[2].value;
  	const number_sr = document.querySelectorAll("div."+areaName+" input[type=number]")[3].value;

  	let x= number_bi_T1*1 + number_bi_T2*2 + number_os*5 + number_sr*3;

  	if(x==30){
  		alert(areaName+ " est ok!");
  	}
  	else if(x<30){
  		alert("Rajoutez plus de salle ! Il vous reste "+5*(30-x)+"m2 à exploiter!");
  	}
  	else{
  		alert("Espace insuffisant! Veuillez soustraire "+5*(x-30)+"m2");
  	}
}