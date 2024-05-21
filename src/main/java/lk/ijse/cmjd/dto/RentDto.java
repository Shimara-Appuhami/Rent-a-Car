package lk.ijse.cmjd.dto;

import lk.ijse.cmjd.entity.CarEntity;
import lk.ijse.cmjd.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentDto {
    private String id;
    private CarEntity carEntity;
    private CustomerEntity customerEntity;
    private Integer totPrice;
    private Integer advAmount;
    private Integer balAmount;
    private Integer refDeposit;
    private Date orderDate;
    private Date fromDate;
    private Date toDate;
    private boolean isReturned;

}