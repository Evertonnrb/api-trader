package com.nrb.trader.model.repositories;

import com.nrb.trader.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
