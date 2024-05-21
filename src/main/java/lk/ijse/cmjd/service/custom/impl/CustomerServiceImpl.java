package lk.ijse.cmjd.service.custom.impl;

import lk.ijse.cmjd.dao.DaoFactory;
import lk.ijse.cmjd.dao.custom.CustomerDao;
import lk.ijse.cmjd.dao.util.DaoType;
import lk.ijse.cmjd.dto.CustomerDto;
import lk.ijse.cmjd.entity.CustomerEntity;
import lk.ijse.cmjd.service.ServiceFactory;
import lk.ijse.cmjd.service.custom.CustomerService;
import lk.ijse.cmjd.service.util.ServiceType;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerServiceImpl() {
        customerDao = DaoFactory.getInstance().getDao(DaoType.Customer_Dao);
    }

    @Override
    public Boolean save(CustomerDto dto) {
//        create customer entity, set values in dto to the entity and save it using customerDao
        return null;
    }
}