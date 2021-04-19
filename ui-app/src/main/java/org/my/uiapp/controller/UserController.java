package org.my.uiapp.controller;

import java.util.Random;

import org.my.uiapp.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	public UserController() {
	}

	@GetMapping(produces = { MediaType.ALL_VALUE })
	public User getUser(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
			@RequestParam(value = "size", defaultValue = "10", required = true) int size) {

		System.out.println("Page:" + page + " size:" + size);
		return getUser();
	}

	@GetMapping(path = "/{userid}")
	public User getUser(@PathVariable int userid) {
		return getUser();
	}

	@PostMapping(consumes = { MediaType.ALL_VALUE }, produces = { MediaType.ALL_VALUE })
	public ResponseEntity<User> createUser(@RequestBody User user) {
		user.setUserId(Math.abs(new Random().nextInt()));
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@PutMapping
	public String updateUser() {
		return "Update user called.";
	}

	@DeleteMapping
	public String deleteUser() {
		return "Delete user called.";
	}

	private User getUser() {
		return new User("Kishore", "Penmetsa", "test@demo.com", null);
	}
}
