package com.youfan.dao;

import com.youfan.mapper.ProductTypeMapper;
import com.youfan.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeDao {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    public void insertProductType(ProductType productType) {
        productTypeMapper.insertProductType(productType);
    }

    public ProductType findProductTypeById(Integer id) {
        return productTypeMapper.findProductTypeById(id);
    }
}
