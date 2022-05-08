package com.hanspm.fastcampus_restaurantreservation.domain;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);

}
