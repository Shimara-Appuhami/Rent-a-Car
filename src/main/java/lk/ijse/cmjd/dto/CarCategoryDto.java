package lk.ijse.cmjd.dto;

import lk.ijse.cmjd.entity.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarCategoryDto {
    private String id;
    private String name;
    List<CarEntity> carEntities;
}