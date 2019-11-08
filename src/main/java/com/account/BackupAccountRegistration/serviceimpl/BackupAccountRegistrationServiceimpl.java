package com.account.BackupAccountRegistration.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.BackupAccountRegistration.entity.BackupAccountRegistrationEntity;
import com.account.BackupAccountRegistration.repository.BackupAccountRegistrationRepository;
import com.account.BackupAccountRegistration.service.BackupAccountRegistrationService;


@Service
public class BackupAccountRegistrationServiceimpl implements BackupAccountRegistrationService {

	
	@Autowired
	BackupAccountRegistrationRepository backupAccountRegistrationRepository;
	
	@Override
	public List<BackupAccountRegistrationEntity> getUser() {
		
		return backupAccountRegistrationRepository.findAll();
	}
}
