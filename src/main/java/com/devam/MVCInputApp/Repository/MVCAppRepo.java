package com.devam.MVCInputApp.Repository;

import com.devam.MVCInputApp.Model.MVCApp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MVCAppRepo extends MongoRepository<MVCApp, String> {
}
