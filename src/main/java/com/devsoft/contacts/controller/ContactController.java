package com.devsoft.contacts.controller;

import com.devsoft.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by admin on 30.04.2016.
 */
@Controller
@RequestMapping(value = "/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contacts", produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody void getContacts(HttpServletResponse response,
                                          @RequestParam(value = "nameFilter") String nameFilter) throws IOException {
        Writer responseWriter = response.getWriter();
        contactService.getContacts(responseWriter, nameFilter);
    }
}
