package com.example.onlineShop;

import com.example.onlineShop.models.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepository extends JpaRepository<Shoe, Long> {
}
