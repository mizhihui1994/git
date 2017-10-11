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

import com.neusoft.dao.Account_productDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Account_product;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.ConnectionFactory;

public class Account_productDaoImpl implements Account_productDao {
	QueryRunner qrr = new QueryRunner();
	PageModel<Account_product> model=null;
	Connection conn=null;
	PreparedStatement psta=null;
	ResultSet rs= null;
	 List<Account_product> list=new ArrayList<Account_product>();
	@Override
	public boolean addAccount(Account_product Account) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "insert into account_product(loginname,password,registertime,lastlogintime,ip ) values(?,?,?,?,?)";
			int count = qrr.update(conn, sql, Account.getLoginname(),Account.getPassword(),Account.getRegistertime(),Account.getLastlogintime(),Account.getIp());
			if(count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("添加数据失败...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
		
	}

	@Override
	public boolean deleteAccount(int id) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "delete from account_product where id = ?";
			int count = qrr.update(conn, sql,id);
			System.out.println(count);
			if(count>0) {
				System.out.println("删除成功");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("删除数据失败...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
	}

	@Override
	public boolean upAccount(Account_product Account) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update account_product set loginname=?,password=?,registertime=?, lastlogintime=? ,ip=? where id=?";
			int count = qrr.update(conn, sql,Account.getLoginname(),Account.getPassword(),Account.getRegistertime(),Account.getLastlogintime(),Account.getIp(),Account.getId());
			
			if(count>0) {
				System.out.println("修改成功");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Account_product readAccount(int id) throws DaoException {
		Connection conn=null;
		Account_product account =null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from account_product where id = ?";
			ResultSetHandler<Account_product> rsh = new BeanHandler<Account_product>(Account_product.class);
			account =qrr.query(conn, sql,rsh,id);
			System.out.println(account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public List<Account_product> getAccountList() {
		Connection conn = null;
		List<Account_product> list = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from account_product order by id desc";
			ResultSetHandler<List<Account_product>> rsh = new BeanListHandler<Account_product>(Account_product.class);
			list = qrr.query(conn, sql, rsh);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("添加数据失败...",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return list;
	}

	@Override
	public PageModel<Account_product> getPageModel(int pageNo, int pagesize) throws DaoException {
		Connection conn=null;
		PageModel<Account_product> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//准备sql
		String totalcount_sql="select count(id) from account_product";
		//查询总的记录 ScalarHandler:第一行第一列的值
		ResultSetHandler<Long> rsh=new ScalarHandler<>();
		
		Integer totalcount=qrr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Account_product>();
			model.setTotalcount(totalcount);
			//分页查询
			String sql="select id,loginname,password,registertime,lastlogintime,ip from account_product order by id desc limit ?,?";
			Object[] params={(pageNo-1)*pagesize,pagesize};
			List<Account_product> account=qrr.query(conn, sql, new BeanListHandler<Account_product>(Account_product.class),params);
			model.setDatas(account);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("分页查询出错",e);
		}finally{
			DbUtils.closeQuietly(conn);
		}
		return model;
	}

}
