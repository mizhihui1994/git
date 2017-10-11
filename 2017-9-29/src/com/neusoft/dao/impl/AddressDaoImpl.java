package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.AddressDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.ConnectionFactory;

public class AddressDaoImpl implements AddressDao{
	QueryRunner qrr = new QueryRunner();
	PageModel<Address> model=null;
	Connection conn=null;
	PreparedStatement psta=null;
	ResultSet rs= null;
	 List<Address> list=new ArrayList<Address>();
	@Override
	public boolean addaddress(Address address) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "insert into address(province,city,area) values(?,?,?)";
			int count = qrr.update(conn, sql, address.getProvince(),address.getCity(),address.getArea());
			if(count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("�������ʧ��...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
		
	}

	@Override
	public boolean deleteaddress(int id) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "delete from address where id = ?";
			int count = qrr.update(conn, sql,id);
			if(count>0) {
				System.out.println("ɾ���ɹ�");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("ɾ������ʧ��...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
	}

	@Override
	public boolean upaddress(Address address) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update address set province=?,city=?,area=? where id=? ";
			int count = qrr.update(conn, sql, address.getProvince(),address.getCity(),address.getArea(),address.getId());
			if(count>0) {
				System.out.println("�޸ĳɹ�");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Address readaddress(int id) throws DaoException {
		Connection conn=null;
		Address address =null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from address where id = ?";
			ResultSetHandler<Address> rsh = new BeanHandler<Address>(Address.class);
			address =qrr.query(conn, sql,rsh,id);
			System.out.println(address);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return address;
	}

	@Override
	public List<Address> getaddressList() {
		Connection conn = null;
		List<Address> list = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from address order by id desc";
			ResultSetHandler<List<Address>> rsh = new BeanListHandler<Address>(Address.class);
			list = qrr.query(conn, sql, rsh);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("�������ʧ��...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return list;
	}

	@Override
	public PageModel<Address> getPageModel(int pageNo, int pagesize) throws DaoException {
		Connection conn=null;
		PageModel<Address> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//׼��sql
		String totalcount_sql="select count(id) from address";
		//��ѯ�ܵļ�¼ ScalarHandler:��һ�е�һ�е�ֵ
		ResultSetHandler<Long> rsh=new ScalarHandler<>();
		
		Integer totalcount=qrr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Address>();
			model.setTotalcount(totalcount);
			//��ҳ��ѯ
			String sql="select id,province,city,area from address order by id desc limit ?,?";
			Object[] params={(pageNo-1)*pagesize,pagesize};
			List<Address> address=qrr.query(conn, sql, new BeanListHandler<Address>(Address.class),params);
			model.setDatas(address);
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
