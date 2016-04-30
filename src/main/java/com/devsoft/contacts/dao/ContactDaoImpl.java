package com.devsoft.contacts.dao;

import com.devsoft.contacts.logic.ContactLogic;
import com.devsoft.contacts.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by admin on 30.04.2016.
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private DataSource dataSource;

    public ResultSet getContacts(Writer writer, String regex){
        PreparedStatement ps      = null;
        ResultSet         rs      = null;
        Contact           contact = null;
        try(Connection conn =  dataSource.getConnection()){
            ps = conn.prepareStatement("SELECT id, name from contacts");
            if((rs = ps.executeQuery())!= null) {
                while(rs.next()) {
                    contact = new Contact(rs.getInt(1), rs.getString(2));

                    if (ContactLogic.isValidRegex(contact.getName(), regex)) {
                        writer.write(contact.getJSON());
                    }
                }
            }
        }catch (Exception e){

        }
        return rs;
    }
}
