package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    @When("user enters librarian name")
    public void user_enters_librarian_name() {
        System.out.println("User enters librarian username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enter librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
      //TODO
    }

    @When("user enters student name")
    public void user_enters_student_name() {
        System.out.println("User enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password");
    }

    @When("user enters admin name")
    public void user_enters_admin_name() {
        System.out.println("User enters admin username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("User enters admin password");
    }





}
