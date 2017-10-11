package test;

import com.neusoft.dao.ConsumerDao;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.utils.Daofactory;

public class ConsumerTest {
	public static void main(String[] args) {
		 ConsumerDao cd = Daofactory.getInstance("consumerDao", ConsumerDaoImpl.class);
		// cd.addConsumer(new Consumer("10", "123", 1, 1, "www"));
		 //cd.deleteConsumer(6);
//		boolean b =  cd.updateConsumer(new Consumer(7, "zz", "zz", 1, 1, "zz", "zz", 22.00, 2));
//		if(b){
//			System.out.println("修改成功");
//		}else{
//			System.out.println("修改shibai ");
//		}
//		 System.out.println(cd.getConsumer(7));
//		 System.out.println(cd.getConsumerList());
		 System.out.println(cd.getPageModel(1, 1));
	}
	
}
