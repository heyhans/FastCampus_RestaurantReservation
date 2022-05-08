package com.hanspm.fastcampus_restaurantreservation.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RestaurantTests {

    //    Check restaurant object
    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));

    }
}