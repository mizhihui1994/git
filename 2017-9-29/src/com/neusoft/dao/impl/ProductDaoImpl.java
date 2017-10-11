package com.neusoft.dao.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.ProductDao;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;
import com.neusoft.utils.ConnectionFactory;

public class ProductDaoImpl  implements ProductDao{
	
	QueryRunner qr = new QueryRunner();
	
	/**
	 * �����Ʒ
	 */
	@Override
	public boolean insert(Product pro) {
		Connection conn = null;
		try {
			
		conn = ConnectionFactory.getConnection();
		String sql = "insert into product(pname,cid,pno,pic,price,online,pdetail,tuijian,tejia) values(?,?,?,?,?,?,?,?,?) ";
			int i = qr.update(conn,sql,pro.getPname(),pro.getCid(),pro.getPno(),pro.getPic(),pro.getPrice(),pro.getOnline(),pro.getPdetaul(),pro.getTuijian(),pro.getTejia());
			if (i>0) {
				System.out.println("��ӳɹ�");
				return true;
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		
		return false;
	}
	/**
	 * ����id��ѯ��Ʒ��Ϣ
	 */
	@Override
	public Product getproductById(Integer i) {
		Connection conn = null;
		Product dd = null;
		try {
		conn = ConnectionFactory.getConnection();
		String str = "select * from product where id = ?";
		ResultSetHandler<Product> bh = new BeanHandler<Product>(Product.class);
		
			dd =qr.query(conn, str, bh, i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dd;
	}
	/**
	 * ��ȡ������Ʒ��Ϣ
	 */
	@Override
	public List<Product> getproductList() {
		Connection conn = null;
		List<Product> list = null;
		try {
		conn = ConnectionFactory.getConnection();
		String sql = "select id,pname,cid from product order by id desc ";
		ResultSetHandler<List<Product>> rs = new BeanListHandler<Product>(Product.class);
			list = qr.query(conn, sql ,rs);
//			System.out.println("list=========="+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		
		return list;
	}
	/**
	 * ������Ʒ���ƻ�ȡ��Ʒ��Ϣ
	 */
	@Override
	public List<Product> getproductByName(String name) {
		Connection conn = null;
		List<Product> list = null;
		try {
		conn = ConnectionFactory.getConnection();
		String sql = "select id,pname,cid,pno,pic,price,online,pdetail from product where pname = ?";
		ResultSetHandler<List<Product>> rs = new BeanListHandler<Product>(Product.class);
			Object[] objs = {name};
			list = qr.query(conn, sql ,rs, objs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		
		return list;
	}
	/**
	 * �޸���Ʒ��Ϣ
	 * */
	@Override
	public boolean updateproduct(Product pro) {
		Connection conn = null;
		try {
		conn = ConnectionFactory.getConnection();
		String sql="update product set id=?, pname=?, cid=?,pno=?,pic=?,price=?,online=?,pdetail=? where id = ?";
		int i =qr.update(conn,sql,pro.getId(),pro.getPname(),pro.getCid(),pro.getPno(),pro.getPic(),pro.getPrice(),pro.getOnline(),pro.getPdetaul(),pro.getId());
		if(i>0){
			System.out.println("�޸ĳɹ�");
			return true;
		}else {
			System.out.println("�޸�sgubauhjh");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		
		return false;
	}
	/**
	 * ������Ʒidɾ����Ʒ��Ϣ
	 */
	@Override
	public boolean deleteById(Integer id) {
		Connection conn = null;
		try {
		conn = ConnectionFactory.getConnection();
		String sql = "delete from product where id = ?";
			int i =qr.update(conn,sql,id);
			if (i>0) {
				System.out.println("ɾ���ɹ�");
				return true;
			}else{
				System.out.println("ɾ��ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
		
	}
	@Override
public PageModel<Product> getPageModel(int pageNo, int pageSize) {
		Connection conn=null;
		PageModel<Product> model=null;
		try {
			conn=ConnectionFactory.getConnection();
		
		//׼��sql
		String totalcount_sql="select count(id) from product";
		//��ѯ�ܵļ�¼ ScalarHandler:��һ�е�һ�е�ֵ
		ResultSetHandler<Long> rsh=new ScalarHandler<>();
		
		Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
		if(totalcount>0){
			model=new PageModel<Product>();
			model.setTotalcount(totalcount);
			//��ҳ��ѯ
			String sql="select id,pname,cid,pno,pic,price,online,pdetail from product order by id desc limit ?,?";
			Object[] params={(pageNo-1)*pageSize,pageSize};
			List<Product> products=qr.query(conn, sql, new BeanListHandler<Product>(Product.class),params);
			model.setDatas(products);
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

	

