package com.devsoft.contacts.service;

import com.devsoft.contacts.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Writer;

/**
 * Created by admin on 30.04.2016.
 */
@Service
public class ContactService {
    @Autowired
    private ContactDao contactDao;

    public void getContacts(Writer writer, String regVar){
        if(!StringUtils.isEmpty(regVar)){

        }

    }
}
