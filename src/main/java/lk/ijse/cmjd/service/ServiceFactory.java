package lk.ijse.cmjd.service;

import lk.ijse.cmjd.service.custom.impl.CustomerServiceImpl;
import lk.ijse.cmjd.service.util.ServiceType;
import lk.ijse.cmjd.service.util.exception.ServiceNotImplemented;

public class ServiceFactory {
    private static ServiceFactory instance;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance == null ? instance = new ServiceFactory() : instance;
    }

    public <T extends SuperService> T getService(ServiceType type) {
        switch (type) {
            case Customer_Service:
                return (T) new CustomerServiceImpl();
            default:
                throw new ServiceNotImplemented();
        }
    }
}