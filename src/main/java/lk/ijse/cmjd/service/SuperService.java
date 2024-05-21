package lk.ijse.cmjd.service;

import org.hibernate.Session;

public interface SuperService<T> {
    Boolean save(T dto);

}