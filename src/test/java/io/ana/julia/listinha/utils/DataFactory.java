package io.ana.julia.listinha.utils;

import io.ana.julia.listinha.data.dto.UserDTO;
import io.ana.julia.listinha.data.entity.UserEntity;

public class DataFactory {

    public static UserDTO userDTO() {
        return new UserDTO(
                1L,
                "Ana Julia",
                "anajbritos@gmail.com",
                "123456789");
    }

    public static UserEntity userEntity() {
        return new UserEntity(
                1L,
                "Ana Julia",
                "anajbritos@gmail.com",
                "123456789");
    }
}
