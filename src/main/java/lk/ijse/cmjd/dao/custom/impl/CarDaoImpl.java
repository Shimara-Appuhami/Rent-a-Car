package lk.ijse.cmjd.dao.custom.impl;

import lk.ijse.cmjd.dao.custom.CarDao;
import lk.ijse.cmjd.entity.CarEntity;

import org.hibernate.Session;

public class CarDaoImpl implements CarDao {
    public Boolean save(CarEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(CarEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public CarEntity view(String id, Session session) {
        return null;
    }
}