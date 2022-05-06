package com.nrb.trader.config;

import com.nrb.trader.model.entities.Category;
import com.nrb.trader.model.entities.Order;
import com.nrb.trader.model.entities.Product;
import com.nrb.trader.model.entities.User;
import com.nrb.trader.model.entities.enuns.OrderStatus;
import com.nrb.trader.model.repositories.CategoryRepository;
import com.nrb.trader.model.repositories.OrderRespository;
import com.nrb.trader.model.repositories.ProductRespository;
import com.nrb.trader.model.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.Instant;

import static java.util.Arrays.asList;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRespository userRespository;
    @Autowired
    OrderRespository orderRespository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRespository productRespository;

    @Override
    public void run(String... args) throws Exception {

        Product p = new Product("Tv","TV samgung",new BigDecimal("4500.00"),"ulr-img");
        Product p1 = new Product("AirFry","Air Fry Arno",new BigDecimal("500.00"),"ulr-img");
        Product p2 = new Product("Sofá","Sofá Bergamo",new BigDecimal("1890.00"),"ulr-img");
        Product p3 = new Product("Mesa Andara","Mesa andara",new BigDecimal("12000.00"),"ulr-img");

        Category category1 = new Category("Eletronicos");
        Category category2 = new Category("Telefonia");
        Category category3 = new Category("Eletrodomésticos");
        Category category4 = new Category("Cama mesa e banho");

        User jao = new User("Jao", "jao@gmail.com", "3045-1003", "9090", null);
        User ze = new User("Zé", "zee@gmail.com", "3312-1003", "9080", null);
        User alan = new User("Alan", "alan@gmail.com", "3412-1440", "9070", null);
        User miguel = new User("Miguel", "miguel@gmail.com", "9912-3440", "9060", null);

        Order order1 = new Order(Instant.parse("2020-05-22T11:00:00Z"),1, jao);
        Order order2 = new Order(Instant.parse("2020-04-10T11:00:00Z"),2, jao);
        Order order3 = new Order(Instant.parse("2020-02-18T11:00:00Z"),3, miguel);
        Order order4 = new Order(Instant.parse("2020-11-12T11:00:00Z"),4, ze);


        productRespository.saveAll(asList(p1,p2,p3));
        categoryRepository.saveAll(asList(category1,category2,category3,category4));
        userRespository.saveAll(asList(jao, ze, alan, miguel));
        orderRespository.saveAll(asList(order1, order2, order3, order4));
    }

}
