
package com.crud.SoftwareEngineeringChallenge.adapter;

import com.crud.SoftwareEngineeringChallenge.dto.ItemDto;
import com.crud.SoftwareEngineeringChallenge.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemAdapter {

    public ItemDto entityToDto(Item item) {
        ItemDto dto = new ItemDto();
        dto.setId(item.getId());
        dto.setName(item.getName());
        dto.setDescription(item.getDescription());
        return dto;
    }

    public Item dtoToEntity(ItemDto dto) {
        Item item = new Item();
        item.setName(dto.getName());
        item.setDescription(dto.getDescription());
        return item;
    }
}
