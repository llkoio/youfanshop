package com.youfan.mapper;

import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;

import java.util.List;

public interface ProductTypeMapper {
    void insertProductType(ProductType productType);
    ProductType findProductTypeById(Integer id);
    void updateProductType(ProductType productType);
    List<ProductType> queryListByVo(ProductTypeVo productTypeVo);
    void deleteProductTypeById(int id);
}
