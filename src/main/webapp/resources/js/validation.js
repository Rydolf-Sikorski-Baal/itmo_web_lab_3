function validateNumber(obj){
    if (isNaN(obj.value)){alert("invalid"); obj.value= ''; return false;}
    if (obj.value.length > 9){alert("number is too long"); obj.value = ''; return false;}
    if (obj.value.indexOf("e") !== -1){alert("e is still not a number - change my mind"); obj.value = ''; return false;}
    if (obj.value < -3 || obj.value > 3){alert("invalid"); obj.value= ''; return false;}
    return true;
}