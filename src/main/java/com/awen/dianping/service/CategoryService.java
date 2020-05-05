package com.awen.dianping.service;

import com.awen.dianping.common.BusinessException;
import com.awen.dianping.model.CategoryModel;

import java.util.List;

/**
 * @author Liu Awen
 * @create 2020-05-05 23:20
 */
public interface CategoryService {
    CategoryModel create(CategoryModel categoryModel) throws BusinessException;
    CategoryModel get(Integer id);
    List<CategoryModel> selectAll();

    Integer countAllCategory();

}
