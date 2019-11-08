package com.account.BackupAccountRegistration.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.BackupAccountRegistration.entity.BackupAccountRegistrationEntity;
import com.account.BackupAccountRegistration.service.BackupAccountRegistrationService;

@RestController
public class BackupAccountRegistrationController {
	
	@Autowired
	BackupAccountRegistrationService backupAccountRegistrationService;
	
	private static final Log logger = LogFactory.getLog(BackupAccountRegistrationController.class);
	
	@GetMapping(value="/getAlluser")
	public List<BackupAccountRegistrationEntity> getAllUser() throws Exception{
		logger.info("getAllUser starts");
		
		logger.info("getAllUser ends");
		return backupAccountRegistrationService.getUser();
	} 

}
