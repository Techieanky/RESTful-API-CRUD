package com.ankit.myphonebookapi.repository;

import com.ankit.myphonebookapi.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {


}
