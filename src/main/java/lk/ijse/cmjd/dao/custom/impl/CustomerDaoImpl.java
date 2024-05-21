package lk.ijse.cmjd.dao.custom.impl;

import lk.ijse.cmjd.dao.custom.CustomerDao;
import lk.ijse.cmjd.entity.CustomerEntity;
import org.hibernate.Session;

public class CustomerDaoImpl implements CustomerDao {
    public Boolean save(CustomerEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(CustomerEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public CustomerEntity view(String id, Session session) {
        return null;
    }
}