package lk.ijse.cmjd.dto;

import lk.ijse.cmjd.entity.embedded.UserName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private UserName name;
    private String username;
    private String password;
    private String email;
    private String mobile;
}