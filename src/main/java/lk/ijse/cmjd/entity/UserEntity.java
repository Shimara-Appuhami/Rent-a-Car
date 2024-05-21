package lk.ijse.cmjd.entity;

import lk.ijse.cmjd.entity.embedded.UserName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity implements SuperEntity {

    @Id
    @Column(name = "UserID", length = 6, nullable = false)
    private String id;

    private UserName name;

    @Column(name = "UserName", length = 10, nullable = false)
    private String username;

    @Column(name = "PassWord", length = 20, nullable = false)
    private String password;

    @Column(name = "Email", length = 30)
    private String email;

    @Column(name = "Mobile", length = 12)
    private String mobile;

}