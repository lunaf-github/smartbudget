package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.UserDto;
import com.smartbudget.entity.User;
import com.smartbudget.mapper.UserMapper;
import com.smartbudget.repository.UserRepository;
import com.smartbudget.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);

        return UserMapper.mapToTransactionDto(savedUser);
    }
}
