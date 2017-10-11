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

import com.neusoft.dao.CateDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.ConnectionFactory;

public class CateDaoImpl implements CateDao {
	QueryRunner qrr = new QueryRunner();
	PageModel<Cate> model=null;
	Connection conn=null;
	PreparedStatement psta=null;
	ResultSet rs= null;
	 List<Cate> list=new ArrayList<Cate>();
	public boolean addCate(Cate cate) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "insert into cate(cname,pid) values(?,?)";
			int count = qrr.update(conn, sql, cate.getCname(),cate.getPid());
			if(count > 0) {
				System.out.println(123);
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
	public boolean deleteCate(int cid) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql= "delete from cate where cid = ?";
			int count = qrr.update(conn, sql,cid);
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
	public boolean upCate(Cate cate ) throws DaoException {
		Connection conn=null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update cate set cname=?,pid=? where cid=? ";
			int count = qrr.update(conn, sql, cate.getCname(),cate.getPid(),cate.getCid());
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
	public Cate readCate(int cid) throws DaoException {
		Connection conn=null;
		Cate cate =null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from cate where cid = ?";
			ResultSetHandler<Cate> rsh = new BeanHandler<Cate>(Cate.class);
			 cate =qrr.query(conn, sql,rsh,cid);
			 System.out.println(cate);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cate;
	}

	@Override
	public List<Cate> getcateList()  throws DaoException {
		Connection conn = null;
		List<Cate> list = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from cate order by cid desc";
			ResultSetHandler<List<Cate>> rsh = new BeanListHandler<Cate>(Cate.class);
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
	public PageModel<Cate> getPageModel(int pageNo, int pageSize) {
		Connection conn=null;
		PageModel<Cate> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//准备sql
		String totalcount_sql="select count(id) from product";
		//查询总的记录 ScalarHandler:第一行第一列的值
		ResultSetHandler<Long> rsh=new ScalarHandler<>();
		
		Integer totalcount=qrr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Cate>();
			model.setTotalcount(totalcount);
			//分页查询
			String sql="select cid,cname,pid from cate order by cid desc limit ?,?";
			Object[] params={(pageNo-1)*pageSize,pageSize};
			List<Cate> cate=qrr.query(conn, sql, new BeanListHandler<Cate>(Cate.class),params);
			model.setDatas(cate);
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
