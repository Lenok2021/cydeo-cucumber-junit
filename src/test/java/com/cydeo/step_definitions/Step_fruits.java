package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class Step_fruits {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println("fruits = " + fruits);
        System.out.println(fruits.get(1));
        
        
        
    }








}
