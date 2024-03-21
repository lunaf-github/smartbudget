package com.smartbudget.mapper;

import com.smartbudget.dto.UserDto;
import com.smartbudget.entity.User;

public class UserMapper {
    public static UserDto mapToTransactionDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getPassword());
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getUsername(),
                userDto.getPassword());
    }
}
