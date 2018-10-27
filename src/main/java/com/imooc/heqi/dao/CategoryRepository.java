package com.imooc.heqi.dao;

import com.imooc.heqi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query(value = "update Category category set category.name = ?1 where category.id = ?2")
    Category updateById(String name,Integer id);

    @Query(value = "select category from Category category WHERE  category.id = ?1")
    Category selectById(Integer id);
}
