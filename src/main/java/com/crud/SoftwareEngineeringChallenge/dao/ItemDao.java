package com.crud.SoftwareEngineeringChallenge.dao;

import com.crud.SoftwareEngineeringChallenge.entity.Item;

public interface ItemDao {
    Item save(Item item);
    Item findById(Long id);
    void delete(Item item);
}
