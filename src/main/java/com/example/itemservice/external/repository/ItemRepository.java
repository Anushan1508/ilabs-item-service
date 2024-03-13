package com.example.itemservice.external.repository;

import com.example.itemservice.domain.entities.ItemsEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemsEntity, Long> {
    @Transactional
    @Query("SELECT i FROM ItemsEntity i WHERE i.item = :item")
    ItemsEntity findByItem(String item);
}
