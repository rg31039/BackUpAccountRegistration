package com.account.BackupAccountRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.account.BackupAccountRegistration.entity.BackupAccountRegistrationEntity;

@Repository
public interface BackupAccountRegistrationRepository extends JpaRepository<BackupAccountRegistrationEntity,String> {

}
