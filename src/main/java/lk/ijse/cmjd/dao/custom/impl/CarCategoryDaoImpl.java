package lk.ijse.cmjd.dao.custom.impl;

import lk.ijse.cmjd.dao.custom.CarCategoryDao;
import lk.ijse.cmjd.entity.CarCategoryEntity;
import lk.ijse.cmjd.entity.CustomerEntity;
import org.hibernate.Session;


public class CarCategoryDaoImpl implements CarCategoryDao {

    public Boolean save(CarCategoryEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(CarCategoryEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public CarCategoryEntity view(String id, Session session) {
        return null;
    }
}