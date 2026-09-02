package com.project.store.mappers;

import com.project.store.dtos.CartDto;
import com.project.store.dtos.CartItemDto;
import com.project.store.entities.Cart;
import com.project.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())" )
    CartItemDto toDto(CartItem cartItem);

}