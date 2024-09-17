package rest.dtos;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank(message = "Invalid Name: Empty name")
    @NotNull(message = "Invalid Name: Name is NULL")
    @Size(min = 3, max = 30, message = "Invalid Name: Exceeds 30 characters")
    String name;

    @NotBlank(message = "Invalid Email: Empty Email")
    @NotNull(message = "Invalid Email: Email is NULL")
    @Email(message = "Invalid email")
    String email;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    String mobile;
    
    @NotBlank(message = "Invalid End Date: Empty EndDate")
    @NotNull(message = "Invalid End Date: End Date is NULL")
    @Pattern(regexp = "^(?!.*[=@{}<>()*\\\\$])([0-2][0-9]|(3)[0-1])/(0[1-9]|1[0-2])/(\\d{4})$", 
            message = "Invalid endDate format or contains special characters")
    String enddate;

    @NotNull(message = "Age must not be null")
    @Min(value = 0, message = "Age must be greater than or equal to 0")
    @Max(value = 150, message = "Age must be less than or equal to 150")
    Integer age;

}
