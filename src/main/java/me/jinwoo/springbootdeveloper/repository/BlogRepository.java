package me.jinwoo.springbootdeveloper.repository;

import me.jinwoo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}