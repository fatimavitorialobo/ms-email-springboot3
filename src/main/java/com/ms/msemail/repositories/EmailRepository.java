package com.ms.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
