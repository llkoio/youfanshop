package com.youfan.mapper;

import com.youfan.model.ProductType;

public interface ProductTypeMapper {
    void insertProductType(ProductType productType);
    ProductType findProductTypeById(Integer id);
}
