package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact>getContactOfUser(Long userId);

}
