package lk.ijse.cmjd.dao;

import lk.ijse.cmjd.dao.custom.impl.*;
import lk.ijse.cmjd.dao.util.DaoType;
import lk.ijse.cmjd.dao.util.exception.DaoNotImplemented;

import static lk.ijse.cmjd.dao.util.DaoType.Customer_Dao;
import static lk.ijse.cmjd.dao.util.DaoType.User_Dao;

public class DaoFactory {
    private static DaoFactory instance;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance == null ? instance = new DaoFactory() : instance;

    }

    public <T extends SuperDao> T getDao(DaoType type) {
        switch (type) {
            case Customer_Dao: {
                return (T) new CustomerDaoImpl();
            }
            case User_Dao: {
                return (T) new UserDaoImpl();
            }
            case Car_Dao: {
                return (T) new CarDaoImpl();
            }
            case CarCategory_Dao: {
                return (T) new CarCategoryDaoImpl();
            }
            case Rent_Dao:{
                return (T) new RentDaoImpl();
            }
            default:
                throw new DaoNotImplemented();
        }
    }
}