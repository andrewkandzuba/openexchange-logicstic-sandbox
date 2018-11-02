package com.bnsf.waybill.haulage.eventstore;

import com.playtika.test.kafka.configuration.EmbeddedKafkaBootstrapConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = EmbeddedKafkaBootstrapConfiguration.class,
        properties = {
                "embedded.kafka.topicsToCreate=autoCreatedTopic",
                "embedded.kafka.socketTimeoutMs=10000",
                "embedded.zookeeper.socketTimeoutMs=10000",
        }
)
public class StreamEventIT {

    @Value("${embedded.kafka.brokerList}")
    String kafkaBrokerList;
    @Value("${embedded.zookeeper.zookeeperConnect}")
    String zookeeperConnect;

    @Test
    public void load() {
        Assert.assertNotNull("Should not be null", kafkaBrokerList);
        Assert.assertNotNull("Should not be null", zookeeperConnect);
    }
}
