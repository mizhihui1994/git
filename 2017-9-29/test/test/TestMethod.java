package test;

import java.util.List;

import com.neusoft.dao.OederinfoDao;
import com.neusoft.dao.ProductDao;
import com.neusoft.dao.SpecDao;
import com.neusoft.dao.impl.OrderinfoDaoImpl;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.dao.impl.SpecDaoImpl;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;
import com.neusoft.entity.Spec;
import com.neusoft.utils.Daofactory;

public class TestMethod {

	public static void main(String[] args) {
//		testGetPageModel();
//		insert();
//		update();
//		readbyid();
//		list();
//		delete();
//		pagemodel();
		OederinfoDao pd =  Daofactory.getInstance("OederinfoDao",OrderinfoDaoImpl.class);
//		System.out.println(pd.getPageModel(1,1 ));
		System.out.println(pd.getByid(1));
//		System.out.println(pd.getyifukuan());
		
		
;
	}
	public static void testGetPageModel(){
		ProductDao pd=Daofactory.getInstance("Product",ProductDaoImpl.class);
		PageModel<Product> pageModel=pd.getPageModel(1,3);
		System.out.println(pageModel);
	}
	public static void insert(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		sd.addSpec(new Spec(001, "MENGBANG"));
	}
	public static void delete(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		sd.deleteSpec(1);
	}
	public static void update(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		boolean b =  sd.upSpec(new Spec(2, 5, "yikexin"));
		System.out.println(b);
		if(b){
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败=========");
		}
	}
	public static void readbyid(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		Spec s= sd.readSpec(3);
//		System.out.println(s);
	}	
	
	public static void list(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		List<Spec> list= sd.getcateList();
		System.out.println(list);
	}
	public static void pagemodel(){
		SpecDao sd=Daofactory.getInstance("specdao", SpecDaoImpl.class);
		PageModel<Spec> pageModel=sd.getPageModel(1, 2);
		System.out.println(pageModel);
	}
	
}
