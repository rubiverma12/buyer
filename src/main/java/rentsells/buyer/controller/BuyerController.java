package rentsells.buyer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rentsells.buyer.model.Login;
import rentsells.buyer.repository.UserRepository;

@RestController
@RequestMapping("/buyer/v1")
public class BuyerController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/createUser")
	public Login createUser(@Valid @RequestBody Login login) {
		return userRepository.save(login);
	}
	
	@GetMapping("/user")
	public List<Login> getAllUser() {
		return userRepository.findAll();
	}
}
