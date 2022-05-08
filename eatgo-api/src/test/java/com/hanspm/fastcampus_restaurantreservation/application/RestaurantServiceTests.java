package com.hanspm.fastcampus_restaurantreservation.application;

import com.hanspm.fastcampus_restaurantreservation.domain.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RestaurantServiceTests {

    private RestaurantService restaurantService;

    private RestaurantRepository restaurantRepository;

    private MenuItemRepository menuItemRepository;

    @Before
    public void setUp() {
        restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();
        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }

    @Test
    public void getRestaurant() {
        Restaurant restaurant = restaurantService.getRestaurant(1004L);

        assertThat(restaurant.getId(), is(1004L));

        MenuItem menuItem = restaurant.getMenuItems().get(0);
        assertThat(menuItem.getName(), is("Kimchi"));
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> restaurant = restaurantService.getRestaurants();

        Restaurant restaurant1 = restaurant.get(0);
        assertThat(restaurant1.getId(), is(1004L));

    }


}