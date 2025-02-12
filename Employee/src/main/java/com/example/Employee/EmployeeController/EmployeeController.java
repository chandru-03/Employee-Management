package com.example.Employee.EmployeeController;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Employee.domain.Employee;


@Controller
public class EmployeeController 
{

	private List<Employee> employees = new ArrayList<>();
	
	@GetMapping("/index")
	public String showForm(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "index";
	}
    
    @PostMapping("/result")
   	public String addEmployee(@ModelAttribute Employee employee,BindingResult result,Model model)
   	{
    	employees.add(employee);
   		model.addAttribute("employees", employees);
   		return "result";
   	}

}
