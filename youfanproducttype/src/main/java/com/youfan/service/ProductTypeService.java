package com.youfan.service;

import com.youfan.dao.ProductTypeDao;
import com.youfan.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeDao productTypeDao;

    public void insertProductType(ProductType productType) {
        productTypeDao.insertProductType(productType);
    }

    public ProductType findProductTypeById(Integer id) {
        return productTypeDao.findProductTypeById(id);
    }

    public void UpdateProductType(ProductType productType) {
        productTypeDao.updateProductType(productType);
    }
}
