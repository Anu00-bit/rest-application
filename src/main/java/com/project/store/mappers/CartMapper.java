package com.project.store.mappers;

import com.project.store.dtos.CartDto;
import com.project.store.entities.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);
}
