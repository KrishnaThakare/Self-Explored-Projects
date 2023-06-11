package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactServiceImpl;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@GetMapping("/display")
	public String display() {
		return "Hello Krishna";
	}

	@GetMapping("/user/{userId}")
	public List<Contact> getAllContact(@PathVariable("userId") Long id) {
		return contactServiceImpl.getAllContactsOfUser(id);

	}
}
