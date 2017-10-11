package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.ConsumerDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.ConnectionFactory;

public class ConsumerDaoImpl implements ConsumerDao{
	Connection conn=null;
	QueryRunner qr=new QueryRunner();
	Consumer consumer=null;
	Statement st=null;
	PreparedStatement pstmt = null;
    ResultSet rs = null;
    List<Consumer> consumerList=new ArrayList<Consumer>();
	@Override
	public List<Consumer> getConsumerList() {
		try {
			conn = ConnectionFactory.getConnection();
//			String sql = "select r.id,p.pname,p.id,r.size from rule r right outer join product p on r.pid=p.id ";
//			String sql="select * from account_consumer order by id";
//			ResultSetHandler<List<Consumer>> rs = new BeanListHandler<Consumer>(Consumer.class);
//			consumerList= qr.query(conn, sql ,rs);
			
			//step3:��ȡstatment
			st=conn.createStatement();
			//step4:׼��sql
			String sql="select ac.id,ac.loginname,ac.password,ac.registertime,ac.lastlogintime,ac.ip,sc.nickname,sc.money,sc.lasttime from account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid";
			//step5:����sql
			rs=st.executeQuery(sql);
			//step6:�����ؽ��
			 while(rs.next()){
				Consumer consumer=new Consumer();	
				consumer.setId(rs.getInt("ac.id"));
				consumer.setLoginname(rs.getString("ac.loginname"));
				consumer.setPassword(rs.getString("ac.password"));
				consumer.setRegistertime(rs.getLong("ac.registertime"));
				consumer.setLastlogintime(rs.getLong("ac.lastlogintime"));
				consumer.setIp(rs.getString("ac.ip"));
				consumer.setNickname(rs.getString("sc.nickname"));
				consumer.setMoney(rs.getDouble("sc.money"));
				consumer.setLasttime(rs.getLong("sc.lasttime"));
				consumerList.add(consumer);
			 }	
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DbUtils.closeQuietly(st);
				DbUtils.closeQuietly(conn);
			}
			
			return consumerList;
	}

	@Override
	public boolean addConsumer(Consumer consumer) throws DaoException {
		try {
			conn=ConnectionFactory.getConnection();
			String sql= "insert into account_consumer(loginname,password,registertime,lastlogintime,ip) values(?,?,?,?,?)";
			int count = qr.update(conn, sql, consumer.getLoginname(),consumer.getPassword(),consumer.getRegistertime(),consumer.getLastlogintime(),consumer.getIp());
			if(count>0){
//				System.out.println("����ɹ�");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteConsumer(Integer id) throws DaoException {
//		try {
//			conn = ConnectionFactory.getConnection();
//			//"delete from (account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid) where ac.id = ?";
//			//delete tb_level3 where level2Id in (SELECT level2Id FROM DELETED)
//			String sql = "delete account_consumer where shoppinginfo_consumer in(from account_consumer from deleted)";
//			int count = qr.update(conn, sql,id);
//			if(count>0) {
////				System.out.println("ɾ���ɹ�");
//				return true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
     	return false;
	}

	@Override
	public boolean updateConsumer(Consumer consumer) throws DaoException {
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update (account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid) set ac.loginname=?,ac.password=?,ac.registertime=?,ac.lastlogintime=?,ac.ip=?,sc.nickname=?,sc.money=?,sc.lasttime=? where ac.id=?";
			int count = qr.update(conn, sql, consumer.getLoginname(),consumer.getPassword(),consumer.getRegistertime(),consumer.getLastlogintime(),consumer.getIp(),consumer.getNickname(),consumer.getMoney(),consumer.getLasttime(),consumer.getId());
			if(count>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Consumer getConsumer(Integer id) throws DaoException {
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select ac.id,ac.loginname,ac.password,ac.registertime,ac.lastlogintime,ac.ip,sc.nickname,sc.money,sc.lasttime from account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid where ac.id = ?";
			ResultSetHandler<Consumer> rsh = new BeanHandler<Consumer>(Consumer.class);
			consumer=(Consumer)qr.query(conn, sql,rsh,id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return consumer;
	}

	@Override
	public PageModel<Consumer> getPageModel(int pageNo, int pageSize) throws DaoException {
		PageModel<Consumer> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//׼��sql
		String totalcount_sql="select count(ac.id) from account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid";
		//��ѯ�ܵļ�¼ ScalarHandler:��һ�е�һ�е�ֵ
		ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
		
		Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Consumer>();
			model.setTotalcount(totalcount);
			//��ҳ��ѯ
			String sql="select ac.id,ac.loginname,ac.password,ac.registertime,ac.lastlogintime,ac.ip,sc.nickname,sc.money,sc.lasttime from account_consumer ac right outer join shoppinginfo_consumer sc on ac.id=sc.aid order by ac.id desc limit ?,?";
			Object[] params={(pageNo-1)*pageSize,pageSize};
			List<Consumer> consumers=qr.query(conn, sql, new BeanListHandler<Consumer>(Consumer.class),params);
			model.setDatas(consumers);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("��ҳ��ѯ����",e);
		}finally{
			DbUtils.closeQuietly(conn);
		}
		return model;
	}
}
