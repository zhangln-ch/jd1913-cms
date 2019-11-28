package com.briup.cms.service;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface IArticleService {
    void saveOrUpdate(Article article) throws CustomerException;

    void deleteArticle(int id) throws CustomerException;

    Article queryById(int id) throws CustomerException;

    List<Article> findAllArticle() throws CustomerException;
}
