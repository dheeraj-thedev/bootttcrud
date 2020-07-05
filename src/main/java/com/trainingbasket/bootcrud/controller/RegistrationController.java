package com.trainingbasket.bootcrud.controller;

import java.util.List;
import java.util.Map;

import javax.swing.border.EtchedBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.trainingbasket.bootcrud.model.EmployeeDTO;
import com.trainingbasket.bootcrud.service.EmployeeService;

@Controller
public class RegistrationController {

	// tight coupling -->> Spring MVC -- Loosely cupled
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/register")
	public String createEmployeeForm(Model model) {
		EmployeeDTO employee= new EmployeeDTO();
	
		model.addAttribute("employee", employee);
		return "registeremployee";

	}

	@PostMapping("/register")
	public String createEmployee(@ModelAttribute("emp") EmployeeDTO empDTO, BindingResult result,
			ModelMap map) {
		if (result.hasErrors()) {
			return "redirect:/register";
		}

		employeeService.createOrUpdateEmployee(empDTO);
		return "redirect:/list";
	}

	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<EmployeeDTO> employeeList = employeeService.getAllEmployee();
		model.addAttribute("empList", employeeList);
		return "employeelist";
	}

	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("id") String id) {
		employeeService.deleteEmployee(Long.parseLong(id));
		return "redirect:/list";
	}

}
