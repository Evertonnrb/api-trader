package com.nrb.trader.config;

import com.nrb.trader.model.entities.Order;
import com.nrb.trader.model.entities.User;
import com.nrb.trader.model.repositories.OrderRespository;
import com.nrb.trader.model.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

import static java.util.Arrays.asList;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRespository userRespository;
    @Autowired
    OrderRespository orderRespository;

    @Override
    public void run(String... args) throws Exception {
        User jao = new User("Jao", "jao@gmail.com", "3045-1003", "9090", null);
        User ze = new User("Zé", "zee@gmail.com", "3312-1003", "9080", null);
        User alan = new User("Alan", "alan@gmail.com", "3412-1440", "9070", null);
        User miguel = new User("Miguel", "miguel@gmail.com", "9912-3440", "9060", null);

        Order order1 = new Order(Instant.parse("2020-05-22T11:00:00Z"), jao);
        Order order2 = new Order(Instant.parse("2020-04-10T11:00:00Z"), jao);
        Order order3 = new Order(Instant.parse("2020-02-18T11:00:00Z"), miguel);
        Order order4 = new Order(Instant.parse("2020-11-12T11:00:00Z"), ze);

        userRespository.saveAll(asList(jao, ze, alan, miguel));
        orderRespository.saveAll(asList(order1, order2, order3, order4));
    }

}
