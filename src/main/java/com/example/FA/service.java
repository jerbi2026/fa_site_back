package com.example.FA;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class service {
    private final contact_repositry contactRepositry;

    public service(contact_repositry contactRepositry) {
        this.contactRepositry = contactRepositry;
    }

    public void ajout_contact(contact c){
        contact new_form = new contact();
        new_form.setName(c.getName());
        new_form.setEmail(c.getEmail());
        new_form.setMessage(c.getMessage());
        LocalDate dateAujourdhui = LocalDate.now();
        new_form.setDate(dateAujourdhui);
        contactRepositry.save(new_form);
    }
    public List<contact> affiche_contacts(){
       return contactRepositry.findAll();
    }

    public void delete_contact(String email){
        contactRepositry.deleteById(email);

    }


}
