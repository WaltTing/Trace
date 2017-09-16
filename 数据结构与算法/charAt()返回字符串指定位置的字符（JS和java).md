# charAt(index)返回字符串中指定位置的字符

	function sum(str){
	    var count=0;
	    for(var i=0; i<str.length; i++){
	       if(str.charAt(i)=='a'){
	           count++;
	       }
	    }
	    console.log(count);
	}
	
	var string = "i am a student,my name is heynew";
	sum(string);

注意：该方法同样用于Java语言。