package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.PageModel;
import com.neusoft.entity.Spec;

public interface SpecDao {
		//�����Ʒ
		public boolean addSpec(Spec spec) throws DaoException;
		//ɾ����Ʒ
		public boolean deleteSpec(int id) throws DaoException;
		//�޸���Ʒ
		public boolean upSpec(Spec spec) throws DaoException;
		//��ѯ��Ʒbyid
		public Spec readSpec(int id) throws DaoException;
		//��ѯȫ����Ʒ
		public List<Spec> getcateList();
		//��ҳ
		public PageModel<Spec> getPageModel(int pageNo,int pagesize) throws DaoException;
	
}
