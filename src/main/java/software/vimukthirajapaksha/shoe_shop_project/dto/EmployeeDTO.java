package software.vimukthirajapaksha.shoe_shop_project.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.vimukthirajapaksha.shoe_shop_project.entity.enums.Branch;
import software.vimukthirajapaksha.shoe_shop_project.entity.enums.Gender;
import software.vimukthirajapaksha.shoe_shop_project.entity.enums.Role;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    @Null
    private String employeeId;
    @NotBlank(message = "Customer name cannot be blank")
    private String name;
    @Null
    private String profilePic;
    @NotNull(message = "Gender cannot be null")
    private Gender gender;
    @NotBlank(message = "Civil State cannot be blank")
    private String civilState;
    @NotBlank(message = "Designation cannot be blank")
    private String designation;
    @Past(message = "Date of birth should be in the past")
    @NotNull(message = "Date of birth cannot be null")
    private Date dob;
    @NotNull(message = "Join date cannot be null")
    @PastOrPresent(message = "Join date must be in the past or present")
    private Date joinedDate;
    @NotBlank(message = "Address cannot be blank")
    private String address;
    @Pattern(regexp = "^\\+?[0-9\\-\\s]+$", message = "Invalid contact number format")
    @NotBlank(message = "Contact cannot be blank")
    private String contact;
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotBlank(message = "Email cannot be blank")
    private String guardian;
    @NotBlank(message = "Emergency contact cannot be blank")
    private String emergencyContact;
    @NotNull(message = "Branch cannot be null")
    private Branch branch;
    @NotNull(message = "Access role cannot be null")
    private Role accessRole;
}

