package dz.douane.cntsid.tp10;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "dz.douane.cntsid.tp10.Repository")
public class MongoConfig {
    // Configuration specific to MongoDB
}
