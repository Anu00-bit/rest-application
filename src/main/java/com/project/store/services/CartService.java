package com.project.store.services;

import com.project.store.dtos.CartDto;
import com.project.store.entities.Cart;
import com.project.store.mappers.CartMapper;
import com.project.store.repositories.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private CartRepository cartRepository;
    private CartMapper cartMapper;


    public CartDto createCart(){
        var cart = new Cart();
        cartRepository.save(cart);

        return cartMapper.toDto(cart);
    }
}
