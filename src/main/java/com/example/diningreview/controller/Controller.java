package com.example.diningreview.controller;

import com.example.diningreview.model.DiningReview;
import com.example.diningreview.model.Restaurant;
import com.example.diningreview.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/user/{userName}")
    public User getUserByUserName(@PathVariable String userName) {

    }

    @GetMapping("/restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable int id) {

    }

    @GetMapping("/review/{id}")
    public DiningReview getReviewById(@PathVariable int id) {

    }
}
