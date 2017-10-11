package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;

public interface ConsumerDao {
	//��ѯȫ����Ա
	public List<Consumer> getConsumerList();
	//�����Ʒ
	public boolean addConsumer(Consumer consumer) throws DaoException;
	//ɾ����Ʒ
	public boolean deleteConsumer(Integer id) throws DaoException;
	//�޸���Ʒ
	public boolean updateConsumer(Consumer consumer) throws DaoException;
	//��ѯ��Ʒ
	public Consumer getConsumer(Integer id) throws DaoException;
	//��ҳ
	public PageModel<Consumer> getPageModel(int pageNo,int pageSize) throws DaoException;
}