package com.imooc.heqi.dao;

import com.imooc.heqi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import javax.transaction.Transactional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Modifying
    @Transactional
    @Query(value = "update Category category set category.name = :name where category.id = :id")
    void updateById(@Param(value = "name") String name, @Param(value = "id") Integer id);

    @Query(value = "select category from Category category WHERE  category.id = ?1")
    Category selectById(Integer id);


//    deleteByIdAndName(54,"%"+" C"+"%")
//    无效，不能进行模糊查询
//
//    deleteByIdAndNameLike(54,"%"+" C"+"%")
//    可以进行模糊查询
//
//    deleteByIdAndNameLike(54," C")
//    不能模糊查询

    @Modifying
    @Transactional
    @Query(value = "delete from Category c where c.id = :id and c.name like %:name%")
    int deleteByIdAndNameLike(@Param(value = "id") Integer id,
                              @Param(value = "name") String name);


}
