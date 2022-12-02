package com.github.TusharLEARNSawant.demoLogger.repository;

import com.github.TusharLEARNSawant.demoLogger.model.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
