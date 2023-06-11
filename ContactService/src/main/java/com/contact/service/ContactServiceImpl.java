package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// Fake list of contacts

	List<Contact> contacts = List.of(
			new Contact(1L, "dhiraj@gmail.com", "Dhiraj", 1L),
			new Contact(2L, "krishna@gmail.com", "Krishna", 1L), 
			new Contact(3L, "roshan@gmail.com", "Roshan", 1L),
			new Contact(4L, "shiva@gmail.com", "Shiva", 2L),
			new Contact(5L, "raosaheb@gmail.com", "Raosaheb", 2L), 
			new Contact(6L, "shridhar@gmail.com", "Shridhar", 3L),
			new Contact(7L, "vasant@gmail.com", "Vasant", 2L),
			new Contact(8L, "dharma@gmail.com", "Dharma", 3L), 
			new Contact(9L, "gopal@gmail.com", "Gopal", 3L)
			);

	@Override
	public List<Contact> getAllContactsOfUser(Long id) {
		return contacts.stream().filter(contacts -> contacts.getUserId().equals(id)).collect(Collectors.toList());

	}

}