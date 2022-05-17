function Require(){
	 var elements = document.forms["guiform"].elements;
  for (i=0; i<elements.length; i++){
	var id = elements[i]['id'];
	var data = elements[i]['value'];
	if(data.trim() == ""){
		document.getElementById(id).style.borderColor = "red";
		return false;
	} 
  }
}

function DoNormal(id){
	document.getElementById(id).style.borderColor = "black";
}