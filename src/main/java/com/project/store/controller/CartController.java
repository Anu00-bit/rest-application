package com.project.store.controller;

import com.project.store.dtos.CartDto;
import com.project.store.dtos.CartItemDto;
import com.project.store.entities.Cart;
import com.project.store.mappers.CartMapper;
import com.project.store.repositories.CartRepositoriy;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartRepositoriy cartRepositoriy;
    private final CartMapper cartMapper;

    @PostMapping
    public ResponseEntity<CartDto> createCart(
            UriComponentsBuilder uriBuilder
    ){
        var cart = new Cart();
       cartRepositoriy.save(cart);

      var cartDto =  cartMapper.toDto(cart);
      var uri = uriBuilder.path("/carts/{id}").buildAndExpand(cartDto.getId()).toUri();

      return new ResponseEntity<>(cartDto, HttpStatus.CREATED);
    }
    public ResponseEntity<CartItemDto> addToCart(
            @PathVariable UUID cartId,
    AddItemToCartRequest request)

}
