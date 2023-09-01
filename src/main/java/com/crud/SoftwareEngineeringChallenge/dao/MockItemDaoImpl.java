package com.crud.SoftwareEngineeringChallenge.dao;

import com.crud.SoftwareEngineeringChallenge.entity.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mock") // Use this qualifier for the mock implementation
public class MockItemDaoImpl implements MockItemDao {

    @Override
    public Item save(Item item) {
        // Implement saving logic for the mock data access
        return item;
    }

    @Override
    public Item findById(Long id) {
        // Implement finding logic for the mock data access
        return null; // Replace with actual logic
    }

    @Override
    public void delete(Item item) {
        // Implement deletion logic for the mock data access
    }

    // Implement any additional methods as needed for the mock data access
}
