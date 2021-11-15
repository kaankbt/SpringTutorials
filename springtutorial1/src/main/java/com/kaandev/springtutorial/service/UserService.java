package com.kaandev.springtutorial.service;

import com.kaandev.springtutorial.dto.UserCreateDTO;
import com.kaandev.springtutorial.dto.UserUpdateDTO;
import com.kaandev.springtutorial.dto.UserViewDTO;
import com.kaandev.springtutorial.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    void deleteUser(Long id);

    UserViewDTO getUserById(Long id);

    List<UserViewDTO> getUsers();

    UserViewDTO createUser(UserCreateDTO userCreateDTO);

    UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);


    List<UserViewDTO> slice(Pageable pageable);
}


