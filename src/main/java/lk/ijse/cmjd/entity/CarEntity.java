package lk.ijse.cmjd.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CarEntity implements SuperEntity{

    @Id
    @Column(name = "CarId", length = 6, nullable = false)
    private String id;

    @Column(name = "BRAND", length = 15, nullable = false)
    private String brand;

    @Column(name = "MODEL", length = 15, nullable = false)
    private String model;

    @Column(name = "YOM", nullable = false)
    private Integer yom;

    @Column(name = "RegNo", length = 8, nullable = false)
    private String regNo;

    @Column(name = "Price", nullable = false)
    private Integer price;


    @OneToMany(mappedBy="carEntity", targetEntity=RentEntity.class)
    List<RentEntity> rentEntities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CarCatId", nullable = false)
    private CarCategoryEntity carCategoryEntity;
}