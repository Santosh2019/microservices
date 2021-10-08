package com.contact.serviceimpl;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactService contactService;

    public  List<Contact>list= Arrays.asList(

            new Contact(1l,"santoshlimbale@gmail.com","santosh",101L),
            new Contact(2l,"gajanan@gmail.com","santosh",101L),
            new Contact(3l,"ram@gmail.com","Gajanan",102L),
            new Contact(4l,"ram@gmail.com","Gajanan",102L)

    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {

        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
