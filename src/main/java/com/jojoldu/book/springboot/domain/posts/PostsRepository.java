package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // 필드명이 author이므로 findBy + Author 조합!
    List<Posts> findByAuthor(String author);
}