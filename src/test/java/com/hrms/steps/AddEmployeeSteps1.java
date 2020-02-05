package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps1 extends CommonMethods {

	
	AddEmployeePageElements addEmployee;
	
	
	@When("I click on PIM")
	public void i_click_on_PIM() {
		addEmployee=new AddEmployeePageElements();
	  click(addEmployee.PIM);
	  
	}

	@When("I click on Add Employee")
	public void i_click_on_Add_Employee() {
		click(addEmployee.AddEmployee);
	    
	}

	@When("I enter first name and last name")
	public void i_enter_first_name_and_last_name() {
		sendText(addEmployee.firstName, "Leonardo");
		sendText(addEmployee.lastName, "Da Vinci");
	    
	}

	@And("I click on save")
	public void i_click_on_save() {
		click(addEmployee.saveBtn);
	    
	}

	@Then("I confirm employee is added")
	public void i_confirm_employee_is_added() {
		
		String empName1="Leonardo Da Vinci";
		Assert.assertEquals(empName1, addEmployee.empName.getText());
	    
	}
	
	
}
