package Dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Entity.Bus;

public class BusDao {

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insertData(Bus bus) {
		Integer r = (Integer) this.hibernateTemplate.save(bus);
		return r;
	}

}
