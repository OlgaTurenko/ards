package com.devsoft.contacts.model;

/**
 * Created by admin on 30.04.2016.
 */
public class Contact {
    private Integer id  ;
    private String  name;

    public Contact() {}

    public Contact(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != null ? !id.equals(contact.id) : contact.id != null) return false;
        return name != null ? name.equals(contact.name) : contact.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public String getJSON(){
        return "Contact{'id':"+ id+",'name': "+name+"}";
    }
}
