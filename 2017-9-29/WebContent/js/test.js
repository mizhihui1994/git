	var str1 = ["菜单","用户管理","商品管理","店铺管理","运维管理","demo"];
	var str2 = ["用户列表","角色管理","权限管理","权限组管理"];
	var str3 = ["商品名称","商品价格","商品数量","商品日期"];
	var str4 = ["店铺规格","房租","店铺管理"];
	var str5 = ["运输管理","食品管理"];
	var str6 = ["小程序"];
	var arr = [str1,str2,str3,str4,str5,str6];

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
	var _maindiv = document.getElementById("main");
	
	
	
	for (var i = 0;i<str1.length;i++) {
		var _div = document.createElement("div");
//		_div.setAttribute("")
	_div.setAttribute("id","id1");
	_div.setAttribute("style","text-align: center;border-bottom: 1px solid palevioletred; width: 202px;height: 35px;");
	
	var _text =document.createTextNode(arr[0][i]);
	
	_div.onmouseover=function(){
		var _ul=document.createElement("ul");
		for (var j = 0;j<arr[i].length;j++) {
			var _li=document.createElement("li");
			var _litext=document.createTextNode(arr[i+1][j]);
	        _ul.appendChild(_li);
	        _li.appendChild(_litext);
	        	_maindiv.appendChild(_ul);
	        	alert("aaaaaaa")
		}
	};		
			
			
_maindiv.appendChild(_div);
	_div.appendChild(_text);
	

	}

}
