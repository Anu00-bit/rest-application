package com.project.store.mappers;

import com.project.store.dtos.RegisterUserRequest;
import com.project.store.dtos.UpdateUserRequest;
import com.project.store.dtos.UserDto;
import com.project.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
