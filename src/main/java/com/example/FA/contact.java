package com.example.FA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
public class contact{
    private String name;
    @Id
    private String email;
    private String message;
    private LocalDate date;
    public contact() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public contact(String name, String email, String message, LocalDate date) {
        this.name = name;
        this.email = email;
        this.message = message;

        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        contact contact = (contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(email, contact.email) && Objects.equals(message, contact.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, message);
    }


}
