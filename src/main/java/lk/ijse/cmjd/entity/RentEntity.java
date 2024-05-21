package lk.ijse.cmjd.entity;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="rent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentEntity implements SuperEntity {
    @Id
    @Column(name="RentID", length = 6, nullable = false)
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CarId", nullable = false)
    private CarEntity carEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustID", nullable = false)
    private CustomerEntity customerEntity;


    @Column(name="TotPrice", nullable = false)
    private Integer totPrice;

    @Column(name="AdvAmount",  nullable = false)
    private Integer advAmount;

    @Column(name="BalAmount",  nullable = false)
    private Integer balAmount;

    @Column(name="RefDeposit", nullable = false)
    private Integer refDeposit;

    @CreationTimestamp
    @Column(name="OrderDate", nullable = false)
    private Date orderDate;

    @Column(name="FromDate", nullable = false)
    private Date fromDate;

    @Column(name="ToDate", nullable = false)
    private Date toDate;

    @Column(name="IsReturned", length = 5)
    private boolean isReturned;

}