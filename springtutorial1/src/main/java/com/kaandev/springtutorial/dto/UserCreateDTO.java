package com.kaandev.springtutorial.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserCreateDTO {

    @Size(min = 2, max = 32)
    private String firstName;
    @Size(min = 2, max = 32)
    private String lastName;

}
