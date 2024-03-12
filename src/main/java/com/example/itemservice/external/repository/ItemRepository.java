package com.example.itemservice.external.repository;

import com.example.itemservice.domain.entities.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemsEntity, Long> {
}
