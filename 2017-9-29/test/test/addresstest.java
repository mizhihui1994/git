package test;

import java.util.List;

import com.neusoft.dao.AddressDao;
import com.neusoft.dao.impl.AddressDaoImpl;
import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.Daofactory;

public class addresstest {
	public static void main(String[] args) {
//		add();?
//		delete();
//		update();
//		readbyid();
//		list();
		listpage();
	}
	public static void add(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
				boolean b = addao.addaddress(new Address("辽宁省", "铁岭市", "莲花乡"));
				if(b){
					System.out.println("插入成功");
				}else{
					System.out.println("插入失败");
				}
	}
	
	public static void delete(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		addao.deleteaddress(4);
	}
	public static void update(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		addao.upaddress(new Address(1, "北京", "北京", "北京"));
	}
	public static void readbyid(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		Address a = addao.readaddress(2);
		System.out.println(a);
	}
	public static void list(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		List<Address> list = addao.getaddressList();
		System.out.println(list);
	}
	public static void listpage(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		PageModel<Address> pm = addao.getPageModel(1, 1);
		System.out.println(pm);
	}
}
