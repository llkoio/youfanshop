package com.youfan.control;

import com.youfan.model.ProductType;
import com.youfan.service.ProductTypeService;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductControl {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping(value = "/insert_product_type", method = RequestMethod.POST)
    public void insertProductType(ProductType productType) {
        productTypeService.insertProductType(productType);
    }

    @RequestMapping(value = "/findProductTypeById", method = RequestMethod.GET)
    public String findProductTypeById(Integer id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        int productTypeParentId = productType.getProductTypeParentId();
        ProductType parentProductType = productTypeService.findProductTypeById(productTypeParentId);
        model.addAttribute("productType", productType);
        model.addAttribute("parentProductType", parentProductType);
        return "view_product_type";
    }

    @RequestMapping(value = "/to_update_product_type", method = RequestMethod.GET)
    public String toUpdateProductType(Integer id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        model.addAttribute("productType", productType);
        return "update_product_type";
    }

    @RequestMapping(value = "/update_product_type", method = RequestMethod.POST)
    public void updateProductType(ProductType productType, Model model) {
        productTypeService.UpdateProductType(productType);
    }

    @RequestMapping(value = "/list_product_type", method = RequestMethod.GET)
    public String listProductType(Model model) {
        ProductTypeVo productTypeVo = new ProductTypeVo();
        List<ProductType> productTypes = productTypeService.queryListByVo(productTypeVo);
        model.addAttribute("productTypes", productTypes);
        return "list";
    }
}
