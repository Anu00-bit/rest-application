package com.project.store.repositories;

import com.project.store.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepositoriy extends JpaRepository<Cart, Long> {

}
