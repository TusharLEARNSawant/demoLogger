package com.github.TusharLEARNSawant.demoLogger.service;

import com.github.TusharLEARNSawant.demoLogger.conf.ApplicationData;
import com.github.TusharLEARNSawant.demoLogger.manager.LogAnalyserManager;
import com.github.TusharLEARNSawant.demoLogger.model.Context;
import com.github.TusharLEARNSawant.demoLogger.validator.LogAnalyserValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogAnalyserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAnalyserService.class);

    @Autowired
    private LogAnalyserValidator validator;

    @Autowired
    private LogAnalyserManager manager;

    @Autowired
    private ApplicationData applicationData;

    public void execute(String... args) {
        Context context = Context.getInstance();
        validator.validateInput(context, args);
        manager.parseAndPersistEvents(context);
    }

}
