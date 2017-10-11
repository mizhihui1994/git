function _onload(){
	var _p = document.getElementById("a1-1")
	setInterval(
		function(){
			var date =new Date();
			var second = date.getSeconds();
			if(second<10){
				second="0"+second;
			}
			var  _date = date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"号"+date.getHours()+"时"+date.getMinutes()+"分"+second+"秒";
			_p.innerHTML= "欢迎您，admin"+"  "+"今天是:"+_date;		
		}
	,1000);
}
/*function xianshi(){
	var str = document.getElementById("a2-1");
	
}*/
