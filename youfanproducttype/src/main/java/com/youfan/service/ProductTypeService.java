package com.youfan.service;

import com.youfan.dao.ProductTypeDao;
import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ProductType> queryListByVo(ProductTypeVo productTypeVo) {
        return productTypeDao.queryListByVo(productTypeVo);
    }

    public void deleteProductTypeById(int id) {
        productTypeDao.deleteProductTypeById(id);
    }
}
