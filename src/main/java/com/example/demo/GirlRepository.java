package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曾佳
 * @date 2018/10/24
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    /**
     * 根据年龄查找女孩
     *
     * @param age
     * @return
     */
    List<Girl> findByAge(Integer age);
}
