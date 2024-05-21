package lk.ijse.cmjd.dto;

import lk.ijse.cmjd.entity.RentEntity;
import lk.ijse.cmjd.entity.embedded.CustomerName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String id;
    private String title;
    private CustomerName name;
    private String nic;
    private List<String> mobiles;
    private String address;



}