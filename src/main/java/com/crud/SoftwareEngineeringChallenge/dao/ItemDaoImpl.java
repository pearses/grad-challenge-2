package com.crud.SoftwareEngineeringChallenge.dao;

import com.crud.SoftwareEngineeringChallenge.entity.Item;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("real") // Use this qualifier for the mock implementation
public class ItemDaoImpl implements ItemDao {

    @Override
    public Item save(Item item) {
        // Implement saving logic for the real data access
        return item;
    }

    @Override
    public Item findById(Long id) {
        // Implement finding logic for the real data access
        return null; // Replace with actual logic
    }

    @Override
    public void delete(Item item) {
        // Implement deletion logic for the real data access
    }

    // Implement any additional methods as needed for the real data access
}
