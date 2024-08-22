package com.apiexamples.payload;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class RegistrationDto {

    private Long id;

    @Size(min = 2, message = "Should be more than 2 character")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Size(min = 10 , max = 10 ,  message ="Should be 10 digits" )
    private String mobile;


    private String message;

    private int pageNo;

}