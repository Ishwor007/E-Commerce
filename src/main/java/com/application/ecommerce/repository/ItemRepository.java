package com.application.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.ecommerce.model.Item;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Integer> {

}
