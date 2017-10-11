package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.SpecDao;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Spec;
import com.neusoft.utils.ConnectionFactory;

public class SpecDaoImpl implements SpecDao{
	QueryRunner qrr = new QueryRunner();
	Connection conn=null;
	PreparedStatement psta=null;
	ResultSet rs= null;
	@Override
	public boolean addSpec(Spec spec) throws DaoException {
		try {
			Connection conn=null;
			conn=ConnectionFactory.getConnection();
			String sql= "insert into rule(pid,size) values(?,?)";
			int count = qrr.update(conn, sql, spec.getPid(),spec.getSize());
			if(count>0){
				System.out.println("插入成功");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteSpec(int id) throws DaoException {
		try {
			Connection conn=null;
			conn = ConnectionFactory.getConnection();
			String sql = "delete from rule where id = ?";
			int count = qrr.update(conn, sql,id);
			
			if(count>0) {
				System.out.println("删除成功");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean upSpec(Spec spec) throws DaoException {
		try {
			Connection conn=null;
			conn = ConnectionFactory.getConnection();
			String sql = "update rule set pid=?,size=? where id=?";
			int count = qrr.update(conn, sql, spec.getPid(),spec.getSize(),spec.getId());
			if(count>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Spec readSpec(int id) throws DaoException {
		Connection conn=null;
		Spec spec=null;
		try {
			
			conn = ConnectionFactory.getConnection();
			String sql = "select * from rule where id = ?";
			ResultSetHandler<Spec> rsh = new BeanHandler<Spec>(Spec.class);
			spec =(Spec) qrr.query(conn, sql,rsh,id);
			 System.out.println(spec);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spec;
	}
	@Override
	public List<Spec> getcateList() {
		Connection conn = null;
		List<Spec> list = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from rule order by id desc";
			ResultSetHandler<List<Spec>> rsh = new BeanListHandler<Spec>(Spec.class);
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
	public PageModel<Spec> getPageModel(int pageNo, int pagesize) throws DaoException {
		Connection conn=null;
		PageModel<Spec> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//准备sql
		String totalcount_sql="select count(id) from rule";
		//查询总的记录 ScalarHandler:第一行第一列的值
		ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
		
		Integer totalcount=qrr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Spec>();
			model.setTotalcount(totalcount);
			//分页查询
			String sql="select id,pid,size from rule order by id desc limit ?,?";
			Object[] params={(pageNo-1)*pageNo,pagesize};
			List<Spec> cate=qrr.query(conn, sql, new BeanListHandler<Spec>(Spec.class),params);
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
