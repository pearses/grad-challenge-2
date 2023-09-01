// File Location: src/main/java/com/crud/SoftwareEngineeringChallenge/service/ItemService.java

package com.crud.SoftwareEngineeringChallenge.service;

import com.crud.SoftwareEngineeringChallenge.dto.ItemDto;

public interface ItemService {
    ItemDto createItem(ItemDto itemDto);
    ItemDto getItem(Long id);
    ItemDto updateItem(Long id, ItemDto itemDto);
    String deleteItem(Long id);
}
