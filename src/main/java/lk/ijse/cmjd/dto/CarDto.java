package lk.ijse.cmjd.dto;

import lk.ijse.cmjd.entity.CarCategoryEntity;
import lk.ijse.cmjd.entity.RentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private String id;
    private String brand;
    private String model;
    private Integer yom;
    private String regNo;
    private Integer price;
    List<RentEntity> rentEntities;
    private CarCategoryEntity carCategoryEntity;
}