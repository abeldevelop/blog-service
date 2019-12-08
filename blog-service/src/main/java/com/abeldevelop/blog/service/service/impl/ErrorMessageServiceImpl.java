package com.abeldevelop.blog.service.service.impl;


import org.springframework.stereotype.Component;

import com.abeldevelop.architecture.library.common.error.DefaultErrorMessageService;
import com.abeldevelop.blog.service.util.ErrorCodesConstants;

@Component
public class ErrorMessageServiceImpl extends DefaultErrorMessageService {

    public ErrorMessageServiceImpl() {
        addMessagesToMap();
    }

	private void addMessagesToMap() {
		
	}
}
