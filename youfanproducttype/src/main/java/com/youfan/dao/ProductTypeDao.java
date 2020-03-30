package com.youfan.dao;

import com.youfan.mapper.ProductTypeMapper;
import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public void updateProductType(ProductType productType) {
        productTypeMapper.updateProductType(productType);
    }

    public List<ProductType> queryListByVo(ProductTypeVo productTypeVo) {
        return productTypeMapper.queryListByVo(productTypeVo);
    }

    public void deleteProductTypeById(int id) {
        productTypeMapper.deleteProductTypeById(id);
    }
}
