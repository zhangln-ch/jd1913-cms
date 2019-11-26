package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ICategoryService {
    void saveOrUpdate(Category category) throws CustomerException;

    void deleteCategory(int id) throws CustomerException;

    Category queryById(int id) throws CustomerException;

    List<Category> getAllCategory() throws CustomerException;
}
