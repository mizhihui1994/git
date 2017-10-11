package test;

import com.neusoft.dao.Account_productDao;
import com.neusoft.dao.impl.Account_productDaoImpl;
import com.neusoft.entity.Account_product;
import com.neusoft.utils.Daofactory;

public class AccountproductTest {
	public static void main(String[] args) {
		Account_productDao apd = Daofactory.getInstance("Account_productDao", Account_productDaoImpl.class);
		//apd.addAccount(new Account_product("hh", "kk", 12, 22, 112));
		apd.deleteAccount(4);
		//apd.upAccount(new Account_product(2, "200", "1000", 2017, 1, 1));
		//System.out.println(apd.getAccountList());
		//System.out.println(apd.readAccount(2));
		//System.out.println(apd.getPageModel(1,2));
	}
}
