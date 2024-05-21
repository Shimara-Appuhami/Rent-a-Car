package lk.ijse.cmjd.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="carcategory")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarCategoryEntity implements SuperEntity{

    @Id
    @Column(name = "CarCatID", length = 6, nullable = false)
    private String id;

    @Column(name = "CarCatName", length = 30, nullable = false)
    private String name;

    @OneToMany(mappedBy="carCategoryEntity", targetEntity=CarEntity.class)
    List<CarEntity> carEntities;
}