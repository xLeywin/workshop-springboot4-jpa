package com.wendellyv.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendellyv.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Carlos", "carlos@gmail.com", "2121-2132", "SenhaCarlos");
		return ResponseEntity.ok().body(u);
	}
}	
