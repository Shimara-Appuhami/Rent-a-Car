package lk.ijse.cmjd.dao.custom.impl;

import lk.ijse.cmjd.dao.custom.RentDao;
import lk.ijse.cmjd.entity.CarCategoryEntity;
import lk.ijse.cmjd.entity.CustomerEntity;
import lk.ijse.cmjd.entity.RentEntity;
import org.hibernate.Session;

public class RentDaoImpl implements RentDao {
    public Boolean save(RentEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(RentEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public RentEntity view(String id, Session session) {
        return null;
    }
}
