package com.sreenutech.rewards.repository;

import org.springframework.data.repository.CrudRepository;

import com.sreenutech.rewards.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
}
