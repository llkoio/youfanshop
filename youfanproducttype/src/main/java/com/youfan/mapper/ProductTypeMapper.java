package com.youfan.mapper;

import com.youfan.model.ProductType;

public interface ProductTypeMapper {
    public void insertProductType(ProductType productType);
    public ProductType findProductTypeById(int id);
}
