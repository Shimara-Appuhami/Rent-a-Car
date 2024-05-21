package lk.ijse.cmjd.dao.custom;

import lk.ijse.cmjd.dao.SuperDao;
import lk.ijse.cmjd.entity.SuperEntity;
import org.hibernate.Session;

public interface CrudDao<T extends SuperEntity> extends SuperDao {
    Boolean save(T entity, Session session);

    Boolean update(T entity, Session session);

    Boolean delete(String id, Session session);

    T view(String id, Session session);
}