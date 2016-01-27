function UTF8_TO_URL(str){
	
	var result,i,len,tempChar;
	
	result="";
	len=str.length;
	
	for(i=0;i<len;i++){
		
		c=str.charCodeAt(i);
		if ((c >= 0x0001) && (c <= 0x007F)) {
			result += str.charAt(i);
        } else if (c > 0x07FF) {
        	result += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
        	result += String.fromCharCode(0x80 | ((c >> 6) & 0x3F));
            result += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
        } else {
        	result += String.fromCharCode(0xC0 | ((c >> 6) & 0x1F));
        	result += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
        }
		
	}
	
	return result;
}
