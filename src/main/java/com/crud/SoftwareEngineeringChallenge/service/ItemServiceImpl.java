// File Location: src/main/java/com/crud/SoftwareEngineeringChallenge/service/ItemServiceImpl.java

package com.crud.SoftwareEngineeringChallenge.service;

import com.crud.SoftwareEngineeringChallenge.dao.ItemDao;
import com.crud.SoftwareEngineeringChallenge.dto.ItemDto;
import com.crud.SoftwareEngineeringChallenge.entity.Item;
import com.crud.SoftwareEngineeringChallenge.adapter.ItemAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private static final String ITEM_NOT_FOUND_MESSAGE = "Item not found";

    private final ItemDao itemDao;
    private final ItemAdapter itemAdapter;

  //  @Autowired
  //  public ItemServiceImpl(@Qualifier("real") ItemDao itemDao, ItemAdapter itemAdapter) {
  //      this.itemDao = itemDao;
  //      this.itemAdapter = itemAdapter;

    
    @Autowired
    public ItemServiceImpl(@Qualifier("mock") ItemDao itemDao, ItemAdapter itemAdapter) {
        this.itemDao = itemDao;
        this.itemAdapter = itemAdapter;
    }

    @Override
    public ItemDto createItem(ItemDto itemDto) {
        Item item = itemAdapter.dtoToEntity(itemDto);
        item = itemDao.save(item);
        return itemAdapter.entityToDto(item);
    }

    @Override
    public ItemDto getItem(Long id) {
        Item item = itemDao.findById(id);
        if (item == null) {
            throw new RuntimeException(ITEM_NOT_FOUND_MESSAGE);
        }
        return itemAdapter.entityToDto(item);
    }

    @Override
    public ItemDto updateItem(Long id, ItemDto itemDto) {
        Item item = itemDao.findById(id);
        if (item == null) {
            throw new RuntimeException(ITEM_NOT_FOUND_MESSAGE);
        }
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        item = itemDao.save(item);
        return itemAdapter.entityToDto(item);
    }

    @Override
    public String deleteItem(Long id) {
        Item item = itemDao.findById(id);
        if (item == null) {
            throw new RuntimeException(ITEM_NOT_FOUND_MESSAGE);
        }
        itemDao.delete(item);
        return "Item deleted successfully";
    }
}
