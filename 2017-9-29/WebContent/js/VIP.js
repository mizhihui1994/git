group=[{"name":"操作","id":"会员","type":"用户类型","username":"用户名","almoney":"金额","numbers":"订单","jifen":"积分","pay":"最近消费"},
		{"name":"操作","id":"979","type":"黄金会员","username":"赵丽颖","almoney":"+10k","numbers":"323","jifen":"+70","pay":"1k"},
		{"name":"操作","id":"980","type":"白金会员","username":"张娜拉","almoney":"+20k","numbers":"434","jifen":"+90","pay":"1.5k"}]

function add(){
	var str = document.getElementById("nav");
	var _div1 = document.createElement("div");
	_div1.setAttribute("id","add_vip_1");
	_div1.setAttribute("class","add_vip_1");
	var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div1.appendChild(_a);
	str.appendChild(_div1);
	
	var _div2 = document.createElement("div");
	_div2.setAttribute("id","add_vip_2");
	_div2.setAttribute("class","add_vip_2");
	var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div2.appendChild(_a);
	str.appendChild(_div2);
	
	var _div3 = document.createElement("div");
	_div3.setAttribute("id","add_vip_3");
	_div3.setAttribute("class","add_vip_3");
		var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div3.appendChild(_a);
	str.appendChild(_div3);
	for (var i=0;i<group.length;i++) {
		var _div4 = document.createElement("div");
		_div4.setAttribute("class","hengtiao");
		_div4.setAttribute("id","hengtiao"+i);
		
		
		var _a1 = document.createElement("a");
		_a1.setAttribute("class","zi1");
		var _node1 = document.createTextNode(group[i].name);
		_a1.appendChild(_node1);
		_div4.appendChild(_a1);
		
		var _a2 = document.createElement("a");
		_a2.setAttribute("class","zi2");
		var _node2 = document.createTextNode(group[i].id);
		_a2.appendChild(_node2);
		_div4.appendChild(_a2);
		
		
		var _a3 = document.createElement("a");
		_a3.setAttribute("class","zi3");
		var _node3 = document.createTextNode(group[i].type);
		_a3.appendChild(_node3);
		_div4.appendChild(_a3);
		
		var _a4 = document.createElement("a");
		_a4.setAttribute("class","zi4");
		var _node4 = document.createTextNode(group[i].username);
		_a4.appendChild(_node4);
		_div4.appendChild(_a4);
		
		var _a5 = document.createElement("a");
		_a5.setAttribute("class","zi5");
		var _node5 = document.createTextNode(group[i].almoney);
		_a5.appendChild(_node5);
		_div4.appendChild(_a5);
		
		var _a6 = document.createElement("a");
		_a6.setAttribute("class","zi6");
		var _node6 = document.createTextNode(group[i].numbers);
		_a6.appendChild(_node6);
		_div4.appendChild(_a6);
		
		var _a7 = document.createElement("a");
		_a7.setAttribute("class","zi7");
		var _node7 = document.createTextNode(group[i].jifen);
		_a7.appendChild(_node7);
		_div4.appendChild(_a7);
		
		var _a8 = document.createElement("a");
		_a8.setAttribute("class","zi8");
		var _node8= document.createTextNode(group[i].pay);
		_a8.appendChild(_node8);
		_div4.appendChild(_a8);
		
		
		
		str.appendChild(_div4);
	}
}
function deletel(){
	var str = document.getElementById("nav");
	var _div1 = document.createElement("div");
	_div1.setAttribute("id","add_vip_1");
	_div1.setAttribute("class","add_vip_1");
	var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div1.appendChild(_a);
	str.appendChild(_div1);
	
	var _div2 = document.createElement("div");
	_div2.setAttribute("id","add_vip_2");
	_div2.setAttribute("class","add_vip_2");
	var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div2.appendChild(_a);
	str.appendChild(_div2);
	
	var _div3 = document.createElement("div");
	_div3.setAttribute("id","add_vip_3");
	_div3.setAttribute("class","add_vip_3");
		var _a = document.createElement("a");
	_a.setAttribute("id","_a1");
	var _node=document.createTextNode("按消费金额排序");
	_a.appendChild(_node);
	_div3.appendChild(_a);
	str.appendChild(_div3);
	for (var i=0;i<group.length;i++) {
		var _div4 = document.createElement("div");
		_div4.setAttribute("class","hengtiao");
		_div4.setAttribute("id","hengtiao"+i);
		
		
		var _a1 = document.createElement("a");
		_a1.setAttribute("class","zi1");
		var _node1 = document.createTextNode(group[i].name);
		_a1.appendChild(_node1);
		_div4.appendChild(_a1);
		
		var _a2 = document.createElement("a");
		_a2.setAttribute("class","zi2");
		var _node2 = document.createTextNode(group[i].id);
		_a2.appendChild(_node2);
		_div4.appendChild(_a2);
		
		
		var _a3 = document.createElement("a");
		_a3.setAttribute("class","zi3");
		var _node3 = document.createTextNode(group[i].type);
		_a3.appendChild(_node3);
		_div4.appendChild(_a3);
		

		var _node8= document.createTextNode(group[i].pay);
		_a8.appendChild(_node8);
		_div4.appendChild(_a8);
		
		
		
		str.appendChild(_div4);
	}
}