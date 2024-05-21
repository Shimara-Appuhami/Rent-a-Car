package lk.ijse.cmjd.entity;

import lk.ijse.cmjd.entity.embedded.CustomerName;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity{
    @Id
    @Column(name = "CustId", length = 6, nullable = false)
    private String id;

    @Column(name = "CustTitle", length = 6, nullable = false)
    private String title;

    //    @Column(name = "CustName", length = 30, nullable = false)
    private CustomerName name;
//    private String name;

    @Column(name = "NIC", length = 12, nullable = false)
    private String nic;

    @ElementCollection
    @CollectionTable(
            name="customer_mobile",
            joinColumns = @JoinColumn(name="customer_id")
    )
    private List<String> mobiles;

    @Column(name = "Address", length = 50)
    private String address;

    @OneToMany(mappedBy="customerEntity", targetEntity=RentEntity.class)
    List<RentEntity> rentEntities;


}